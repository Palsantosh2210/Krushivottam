package com.example.krus;

import static com.example.krus.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tabactivity extends AppCompatActivity {
    Button b1f,b2t,b3c;
    private long pressedtime;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tabactivity);
        b1f = (Button) findViewById(R.id.button3);
        b2t = (Button) findViewById(R.id.button4);
        b3c = (Button) findViewById(R.id.button5);

        b1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Go to Farmer page",Toast.LENGTH_SHORT).show();
                openactivity1();
            }
        });

        b2t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Go to Trader page",Toast.LENGTH_SHORT).show();
                openactivity2();
            }
        });

        b3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"Go to Customer page",Toast.LENGTH_SHORT).show();
                openactivity3();
            }
        });
    }
        public void openactivity1(){
            Intent intent = new Intent(Tabactivity.this, Farmeractivity.class);
            startActivity(intent);
        }

    public void openactivity2(){
        Intent intent = new Intent(Tabactivity.this, traderactivity.class);
        startActivity(intent);
    }

    public void openactivity3(){
        Intent intent = new Intent(Tabactivity.this, customeractivity.class);
        startActivity(intent);
    }


   @Override
    public void onBackPressed() {

        if (pressedtime + 1700 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        }
        else {
            Toast.makeText(getApplicationContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();
        }
        pressedtime = System.currentTimeMillis();
    }


}