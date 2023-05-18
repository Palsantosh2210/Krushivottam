package com.example.krus;

import static com.razorpay.AppSignatureHelper.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class farmresultintrad extends AppCompatActivity implements PaymentResultListener {

    TextView cropnamere,cropquantityre,croppricere,croptotalpricere,cropfarnamere,cropemailre,cropphonere,cropdistrictre,cropstatere;
    Button paybtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmresultintrad);


        cropnamere = findViewById(R.id.cropnamere);
        cropquantityre = findViewById(R.id.cropquantityre);
        croppricere = findViewById(R.id.croppricre);
        croptotalpricere = findViewById(R.id.croptotalpricere);
        cropfarnamere = findViewById(R.id.cropfarnamere);
        cropemailre = findViewById(R.id.cropemailre);
        cropphonere = findViewById(R.id.cropphonere);
        cropdistrictre = findViewById(R.id.cropdistrictre);
        cropstatere = findViewById(R.id.cropstatere);
        paybtn = findViewById(R.id.paytn);




        Intent intent = getIntent();
        String cname1 = intent.getStringExtra("cropn");
        String cquant = intent.getStringExtra("quantity");
        String cemail = intent.getStringExtra("email");
        String cphone = intent.getStringExtra("phone");
        String fname = intent.getStringExtra("name");
        String cprice = intent.getStringExtra("price");
        String cdist = intent.getStringExtra("dist");
        String ctotalprice = intent.getStringExtra("totalprice");
        String cstate = intent.getStringExtra("state");

        cropnamere.setText("Crop Name: "+cname1);
        cropquantityre.setText("Quantity in Quantal: "+cquant);
        croppricere.setText("Price per Quantal: "+cprice);
        croptotalpricere.setText("Total Price: "+ctotalprice);
        cropfarnamere.setText("Name: "+fname);
        cropemailre.setText("Email: "+cemail);
        cropphonere.setText("Phone no.: "+cphone);
        cropdistrictre.setText("District: "+cdist);
        cropstatere.setText("State: "+cstate);




        String amount = ctotalprice + "00";

        Checkout checkout =new Checkout();
        Checkout.preload(getApplicationContext());
        checkout.setKeyID("rzp_test_WWeWqbVeNrplMv");
        checkout.setImage(R.drawable.krushivo);


        paybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final Activity activity = farmresultintrad.this;


                try {
                    JSONObject options = new JSONObject();

                    options.put("name", "Krushivottam");
                    options.put("description", "Reference No. #123456");
                    options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.jpg");
                    // options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.
                    options.put("theme.color", "#3399cc");
                    options.put("currency", "INR");
                    options.put("amount", amount);//pass amount in currency subunits
                    options.put("prefill.email", cemail);
                    options.put("prefill.contact",cphone);
                    JSONObject retryObj = new JSONObject();
                    retryObj.put("enabled", true);
                    retryObj.put("max_count", 4);
                    options.put("retry", retryObj);

                    checkout.open(activity, options);

                } catch(Exception e) {
                    Log.e(TAG, "Error in starting Razorpay Checkout", e);
                    Toast.makeText(farmresultintrad.this, "Error:"+e.getMessage(), Toast.LENGTH_SHORT).show();
                }





            }
        });



    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(getApplicationContext(),"success id "+s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext(),"failure id "+s,Toast.LENGTH_SHORT).show();
    }
}