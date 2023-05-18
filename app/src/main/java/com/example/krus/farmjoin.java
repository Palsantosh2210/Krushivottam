package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class farmjoin extends AppCompatActivity {

    TextInputEditText farmername,farmerphone ,farmeremail,farmerage,farmercropname,farmerquantity,farmerstate,farmerdistrict,farmerprice,farmertotalprice;
    TextInputLayout farmernameout,farmerphoneout ,farmeremailout,farmerageout,farmercropnameout,farmerquantityout,farmerstateout,farmerdistrictout,farmerpriceout,farmertotalpriceout;
    Button join ;
    FirebaseFirestore firebaseFirestore;
    FirebaseAuth firebaseAuth;
    String Registerf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmjoin);

        farmernameout = findViewById(R.id.farmernameout);
        farmerphoneout  = findViewById(R.id.famrerphoneout);
        farmeremailout  = findViewById(R.id.fameremailout);
        farmerageout  = findViewById(R.id.famerageout);
        farmercropnameout  = findViewById(R.id.famercropout);
        farmerquantityout  = findViewById(R.id.famerquantityout);
        farmerstateout = findViewById(R.id.famerstateout);
        farmerdistrictout = findViewById(R.id.famerdistrictout);
        farmerpriceout = findViewById(R.id.famerpriceout);
        farmertotalpriceout =findViewById(R.id.famertotalpriceout);


        farmername = findViewById(R.id.farmername);
        farmerphone  = findViewById(R.id.farmerphone);
        farmeremail  = findViewById(R.id.farmeremail);
        farmerage  = findViewById(R.id.farmerage);
        farmercropname  = findViewById(R.id.farmercrop);
        farmerquantity  = findViewById(R.id.farmerquantity);
        farmerstate = findViewById(R.id.farmerstate);
        farmerdistrict = findViewById(R.id.farmerdistrict);
        farmerprice = findViewById(R.id.farmerprice);
        farmertotalprice=findViewById(R.id.farmertotalprice);
        join = findViewById(R.id.buttonjoin);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String farmername1 = farmername.getText().toString().trim();
                String farmerphone1 = farmerphone.getText().toString().trim();
                String farmeremail1 = farmeremail.getText().toString().trim();
                String farmerage1 = farmerage.getText().toString().trim();
                String farmercropname1 = farmercropname.getText().toString().trim();
                String farmerquantity1 = farmerquantity.getText().toString().trim();
                String farmerstate1 = farmerstate.getText().toString().trim();
                String farmerdistrict1 = farmerdistrict.getText().toString().trim();
                String farmerprice1 = farmerprice.getText().toString().trim();
                String farmertotalprice1 = farmertotalprice.getText().toString().trim();


                if (farmername1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerphone1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Phone should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmeremail1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Email should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerage1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Age should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmercropname1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Crop name should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerquantity1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Quantity should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerstate1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Rainfall value should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerdistrict1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Rainfall value should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmerprice1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Rainfall value should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                } else if (farmertotalprice1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Rainfall value should not be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {


                Map<String, Object> regfa = new HashMap<>();
                regfa.put("farmername", farmername1);
                regfa.put("farmerphone", farmerphone1);
                regfa.put("farmeremail", farmeremail1);
                regfa.put("farmerage", farmerage1);
                regfa.put("farmercropname", farmercropname1);
                regfa.put("farmerquantity", farmerquantity1);
                regfa.put("farmerstate", farmerstate1);
                regfa.put("farmerdistrict", farmerdistrict1);
                regfa.put("farmerprice", farmerprice1);
                regfa.put("farmertotalprice", farmertotalprice1);

                firebaseFirestore.collection("Registerfar").add(regfa).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {

                        Toast.makeText(farmjoin.this, "Sucessfully stored", Toast.LENGTH_SHORT).show();
                        farmername.setText("");
                        farmerphone.setText("");
                        farmeremail.setText("");
                        farmerage.setText("");
                        farmercropname.setText("");
                        farmerquantity.setText("");
                        farmerstate.setText("");
                        farmerdistrict.setText("");
                        farmerprice.setText("");
                        farmertotalprice.setText("");

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(farmjoin.this, "Error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

            }

            }
        });





    }
}