package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class traderactivity extends AppCompatActivity {

    FirebaseFirestore firebaseFirestore;
    FirebaseAuth firebaseAuth;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private long pressedtime;

    CardView mango1,apple1,rice1,ladies1,mustard1,peas1,sugarcane1,wheat1,dal1,watermelon1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traderactivity);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        mango1= findViewById(R.id.mango1);
        apple1= findViewById(R.id.apple1);
        rice1= findViewById(R.id.rice1);
        ladies1= findViewById(R.id.ladies1);
        mustard1= findViewById(R.id.mustard1);
        peas1= findViewById(R.id.peas1);
        sugarcane1= findViewById(R.id.sugarcane1);
        wheat1= findViewById(R.id.wheat1);
        dal1= findViewById(R.id.udrdal1);
        watermelon1= findViewById(R.id.watermelon1);





        drawerLayout = findViewById(R.id.drawertrad);
        navigationView = findViewById(R.id.navviewtrad);
        toolbar = findViewById(R.id.toolartrad);



        mango1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent  intent = new Intent(traderactivity.this,tradresultact.class);
            intent.putExtra("img",R.drawable.mango);
            intent.putExtra("pricetraad","100");
            intent.putExtra("nametrad","Mango");
            startActivity(intent);





            }
        });

        apple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.apple);
                intent.putExtra("pricetraad","150");
                intent.putExtra("nametrad","Apple");
                startActivity(intent);
            }
        });

        rice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.rice);
                intent.putExtra("pricetraad","100");
                intent.putExtra("nametrad","Basmati Rice");
                startActivity(intent);
            }
        });
        ladies1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.ladiesfinger);
                intent.putExtra("pricetraad","50");
                intent.putExtra("nametrad","Ladies Finger");
                startActivity(intent);
            }
        });
        mustard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.mustard);
                intent.putExtra("pricetraad","100");
                intent.putExtra("nametrad","Mustard");
                startActivity(intent);
            }
        });
        peas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.peas);
                intent.putExtra("pricetraad","70");
                intent.putExtra("nametrad","Peas");
                startActivity(intent);
            }
        });
        sugarcane1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.sugarcane);
                intent.putExtra("pricetraad","200");
                intent.putExtra("nametrad","Sugarcane");
                startActivity(intent);
            }
        });
        wheat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.wheat);
                intent.putExtra("pricetraad","30");
                intent.putExtra("nametrad","Wheat");
                startActivity(intent);
            }
        });
        dal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.urdidal);
                intent.putExtra("pricetraad","120");
                intent.putExtra("nametrad","Dal");
                startActivity(intent);
            }
        });
       watermelon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(traderactivity.this,tradresultact.class);
                intent.putExtra("img",R.drawable.watermelon);
                intent.putExtra("pricetraad","70");
                intent.putExtra("nametrad","Watermelon");
                startActivity(intent);
            }
        });















        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.optprofile){
                    Intent intent = new Intent(getApplicationContext(),profile.class);
                    startActivity(intent);
                }
                else if(id == R.id.opthome){


                }
                else if(id == R.id.opttips){
                    startActivity(new Intent(getApplicationContext(), iotapplication.class));
                }
                else if(id == R.id.optservice){
                    startActivity(new Intent(getApplicationContext(),services.class));
                }
                else if(id == R.id.optshare){

                }
                else if(id == R.id.optcontact){
                    startActivity(new Intent(getApplicationContext(),developerinfo.class));

                }
                else {
                    firebaseAuth.signOut();
                    startActivity( new Intent(getApplicationContext(), loginactivity.class));
                    Toast.makeText(traderactivity.this, "Logout successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }

                drawerLayout.closeDrawer(GravityCompat.START);




                return true;
            }
        });





    }


    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
            finish();
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dot_item_tand, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id1 = item.getItemId();
        if(id1 == R.id.joinustrad){
            startActivity( new Intent(getApplicationContext(),recylerfarmerintrad.class) );

        }

        else {
            // startActivity( new Intent(getApplicationContext(),MainActivity5.class) );
            startActivity(new Intent(getApplicationContext(),developerinfo.class));
        }



        return true;
    }


}