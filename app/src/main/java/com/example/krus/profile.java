package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class profile extends AppCompatActivity {
    TextInputEditText namepro,phonepro,emailpro,passpro;
    TextInputLayout nameproout,phoneproout,emailproout,passproout;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;
    String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        namepro = findViewById(R.id.namepro);
        phonepro = findViewById(R.id.phonepro);
        emailpro = findViewById(R.id.emailpro);
        passpro = findViewById(R.id.passpro);

        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();

        userId = firebaseAuth.getCurrentUser().getUid();


        DocumentReference documentReference = firebaseFirestore.collection("User").document(userId);
        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String emailpr = documentSnapshot.getString("email");
                String fname = documentSnapshot.getString("fname");
                String pass = documentSnapshot.getString("password");
                String phonepr = documentSnapshot.getString("phone");

                namepro.setText(fname);
                phonepro.setText(phonepr);
                emailpro.setText(emailpr);
                passpro.setText(pass);

                Intent intent = new Intent(profile.this,tradresultact.class);
                intent.putExtra("profemail",emailpr);
                intent.putExtra("profphone",phonepr);
               // intent.putExtra("nametrad","Mango");
               // startActivity(intent);


            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(profile.this,"Error: "+e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });




    }
}