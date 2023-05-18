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
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class Farmeractivity extends AppCompatActivity {
    Button bfn;
    FirebaseFirestore firebaseFirestore;
    FirebaseAuth firebaseAuth;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private long pressedtime;


    TextView namepro , emailpro;
    String userId;
    CardView suggestf,cropf,poultryf,aquaf,aniamlf,dairyf,commercialf,hortif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmeractivity);



        firebaseAuth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        namepro = findViewById(R.id.nameh);
        emailpro = findViewById(R.id.emailh);


        drawerLayout = findViewById(R.id.drawerfarm);
        navigationView = findViewById(R.id.navviewfarm);
        toolbar = findViewById(R.id.toolarfarm);

        //id of farmer
        suggestf = findViewById(R.id.suggest);
        cropf = findViewById(R.id.crop);
        poultryf = findViewById(R.id.poultry);
        aquaf = findViewById(R.id.aqua);
        aniamlf = findViewById(R.id.animal);
        dairyf = findViewById(R.id.dairy);
        commercialf= findViewById(R.id.commercial);
        hortif = findViewById(R.id.horti);





        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


           /* //profile
            userId = firebaseAuth.getCurrentUser().getUid();
        DocumentReference documentReference = firebaseFirestore.collection("User").document(userId);
        documentReference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                String name = documentSnapshot.getString("email");
                String fname = documentSnapshot.getString("fname");
                String pass = documentSnapshot.getString("password");
                String phonepr = documentSnapshot.getString("phone");

                namepro.setText(fname);
                emailpro.setText(name);


            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Farmeractivity.this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        });
*/





        // card of profile

       suggestf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),farmersuggestion.class));
            }
        });

        cropf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),foodcroplistview.class));
            }
        });

        poultryf.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),poultrylistview.class));
                    }
                });

        aquaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),aqualistview.class));
            }
        });

     aniamlf.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(getApplicationContext(),animalhuslistview.class));
         }
     });
       dairyf.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),dairylistview.class));
           }
       });
       commercialf.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getApplicationContext(),commerciallistview.class));
           }
       });
      hortif.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),hortilistview.class));
          }
      });





        //name.setText("Amar");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               //profile


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
                    Toast.makeText(Farmeractivity.this, "Logout successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }

                drawerLayout.closeDrawer(GravityCompat.START);




                return true;
            }
        });


       /* bfn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firebaseAuth.signOut();
                startActivity(new Intent(getApplicationContext(),loginactivity.class));

                Toast.makeText(Farmeractivity.this, "Logout successfully", Toast.LENGTH_SHORT).show();

            }
        });*/
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

//end
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.dot_item_farmer, menu);
    return true;
}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id1 = item.getItemId();
        if(id1 == R.id.joinus){
            startActivity( new Intent(getApplicationContext(),farmjoin.class) );

        }

        else {
           // startActivity( new Intent(getApplicationContext(),MainActivity5.class) );
            startActivity(new Intent(getApplicationContext(),developerinfo.class));
        }



        return true;
    }



    //end

}