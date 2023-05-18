package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class recylerfarmerintrad extends AppCompatActivity {

    RecyclerView recylerfar;
    ArrayList<modelfar> farmertlist;
    FirebaseFirestore firebaseFirestore;
    farmadapter farmadapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylerfarmerintrad);



        recylerfar = (RecyclerView) findViewById(R.id.receivefarmer);
        recylerfar.setLayoutManager(new LinearLayoutManager(this));

        farmertlist = new ArrayList<>();
        farmadapter1 = new farmadapter(farmertlist);
       recylerfar.setAdapter(farmadapter1);


        firebaseFirestore = FirebaseFirestore.getInstance();

        firebaseFirestore.collection("Registerfar")
                .get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                        List<DocumentSnapshot> farlist = queryDocumentSnapshots.getDocuments();
                        for (DocumentSnapshot d:farlist)
                        {
                            modelfar obj = d.toObject(modelfar.class);
                            farmertlist.add(obj);
                        }

                        //update adapter

                        farmadapter1.notifyDataSetChanged();



                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(recylerfarmerintrad.this,"Error" +e.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });








    }
}