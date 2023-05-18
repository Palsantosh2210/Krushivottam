package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class farmersuggestion extends AppCompatActivity {

    TextInputEditText N,phos,kfar,tempera,humid,ph,rain;
    Button predictbtn;
    TextView sugest;

    String url = "https://krushiapi-production.up.railway.app/predict";
    String url2 = "https://krushiml.herokuapp.com/predict";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmersuggestion);

        N = findViewById(R.id.Nkg);
        phos = findViewById(R.id.Pkg);
        kfar = findViewById(R.id.Kkg);
        tempera= findViewById(R.id.tempe);
        humid = findViewById(R.id.humid);
        ph = findViewById(R.id.phsu);
        rain =findViewById(R.id.rain);
        predictbtn = findViewById(R.id.suggestion);
        sugest = findViewById(R.id.result);




        predictbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ni = N.getText().toString().trim();
                String phosph = phos.getText().toString().trim();
                String pot = kfar.getText().toString().trim();
                String temp = tempera.getText().toString().trim();
                String hum = humid.getText().toString().trim();
                String phoff = ph.getText().toString().trim();
                String rainf = rain.getText().toString().trim();



                if(ni.isEmpty()){
                    Toast.makeText(getApplicationContext(),"N value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
               else if(phosph.isEmpty()){
                    Toast.makeText(getApplicationContext(),"P value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
                else if(pot.isEmpty()){
                    Toast.makeText(getApplicationContext(),"K value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
                else if(temp.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Temperature value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
                else if(hum.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Humidity value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
                else if(phoff.isEmpty()){
                    Toast.makeText(getApplicationContext(),"ph value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }
                else if(rainf.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Rainfall value should not be empty",Toast.LENGTH_SHORT).show();
                    return ;
                }



                sugest.setText("Please wait.....");

                StringRequest stringRequest= new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {


                            @Override
                            public void onResponse(String response) {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    String data =  jsonObject.getString("Crop");
                                    sugest.setText("Best crop will be  "+data);


                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(farmersuggestion.this, "Error"+error.getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        })   {


                    @Override
                    protected Map<String,String> getParams(){
                        Map<String,String> params = new HashMap<String,String>();
                        params.put("N",N.getText().toString().trim());
                        params.put("P",phos.getText().toString().trim());
                        params.put("K",kfar.getText().toString().trim());
                        params.put("temperature",tempera.getText().toString().trim());
                        params.put("humidity",humid.getText().toString().trim());
                        params.put("ph",ph.getText().toString().trim());
                        params.put("rainfall",rain.getText().toString().trim());

                        return params;
                    }


                };

                RequestQueue queue = Volley.newRequestQueue(farmersuggestion.this);
                queue.add(stringRequest);

            }
        });






    }
}