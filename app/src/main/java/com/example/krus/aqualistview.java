package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class aqualistview extends AppCompatActivity {

    ListView listViewaq;
    ArrayList<String> arrnameaq = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqualistview);
        listViewaq = findViewById(R.id.aqualist);

        arrnameaq.add("Abalone");
        arrnameaq.add("Catfish");
        arrnameaq.add("Clams");
        arrnameaq.add("Crawfish");
        arrnameaq.add("Crayfish");
        arrnameaq.add("Eels");
        arrnameaq.add("Mussels");
        arrnameaq.add("Oysters");
        arrnameaq.add("Salmon");
        arrnameaq.add("Scallops");
        arrnameaq.add("Shrimp");
        arrnameaq.add("Squid");
        arrnameaq.add("Tilapia");
        arrnameaq.add("Trout");
        arrnameaq.add("Tuna");
        arrnameaq.add("Yellowtail");


        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnameaq);
        listViewaq.setAdapter(adapter);

        listViewaq.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position == 0){
                    String tit1= "Abalone";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "vMlLFL7d8Rw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==1 ){
                    String tit1= "Catfish";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "KqtXuzoZlE8";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 2){
                    String tit1= "Clams";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "16NRISYwHWQ";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Crawfish";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "Y9zxXTiepRw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 4){
                    String tit1= "Crayfish";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "n93RPBLyycw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==5 ){
                    String tit1= "Eels";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "c-o-BHDoY6o";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Mussels";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= " t3k21vF9gNk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 7){
                    String tit1= "Oysters";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "nolq3cLo7Bw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 8){
                    String tit1= "Salmon";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "qxI0e5cW2Hg";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 9){
                    String tit1= "Scallops";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "Z0VCzS3uyao";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==10 ){
                    String tit1= "Shrimp";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "_ecUWo8ricg";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Squid";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "c8UIliO4Wns";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 12){
                    String tit1= "Tilapia";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "YR8mIyQECfw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 13){
                    String tit1= "Trout";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "4QbFev22aRc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 14){
                    String tit1= "Tuna";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "cSaVsjJimPc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else {
                    String tit1= "Yellowtail";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "8OvHGP3HVKg";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }







            }
        });


    }

    public  void dataintent(String tit1,String tit2,String tit3, String youtit ){
        Intent data = new Intent(getApplicationContext(),listviewresultfood.class);
        data.putExtra("title",tit1);
        data.putExtra("title2",tit2);
        data.putExtra("title3",tit3);
        data.putExtra("youtuetit",youtit);
        startActivity(data);
    }
}