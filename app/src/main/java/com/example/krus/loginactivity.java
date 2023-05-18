package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.SignInButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;


public class loginactivity extends AppCompatActivity {
    TextView b1s,forget;
    Button b2l;
    TextInputEditText Email,Password;
    TextInputLayout Emailh,Passwordh;
    SignInButton googlebtn;
    FirebaseAuth firebaseAuth;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Emailh = findViewById(R.id.emaillogh);
        Passwordh = findViewById(R.id.passlogh);
        forget = findViewById(R.id.forget);
       b1s= findViewById(R.id.signin);
        b2l = (Button) findViewById(R.id.button);
        Email = findViewById(R.id.emaillog);
        Password = findViewById(R.id.passlog);
        googlebtn= findViewById(R.id.googlesign);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        if(firebaseAuth.getCurrentUser()!= null){
            startActivity( new Intent(getApplicationContext(),Tabactivity.class));
            finish();
        }


        b1s.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Toast.makeText(getApplicationContext(),"Go to Sigin-page",Toast.LENGTH_SHORT).show();
         openactivity4();

        }
    });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginactivity.this,forgetpass.class));
            }
        });



    b2l.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            final String email = Email.getText().toString().trim();
            final String password = Password.getText().toString().trim();

            if(email.isEmpty()){
                Toast.makeText(loginactivity.this,"Email should not be empty",Toast.LENGTH_SHORT).show();
               return;
            }
            else if(password.isEmpty()){
                Toast.makeText(loginactivity.this,"Password should not be empty",Toast.LENGTH_SHORT).show();
                return;
            }
           else if(email.isEmpty() || (password.isEmpty())){
                Toast.makeText(loginactivity.this,"Email and Password should not be empty",Toast.LENGTH_SHORT).show();
                return;
            }



            firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                        openactivity5();
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }


                    //1
                }
            });

            //e









        }
    });
    }

    public void openactivity4(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    public void openactivity5(){
        Intent intent = new Intent(this, Tabactivity.class);
        startActivity(intent);
    }

}