package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class commerciallistview extends AppCompatActivity {

    ListView listViewc;
    ArrayList<String> arrnamec = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerciallistview);

        listViewc = findViewById(R.id.commerciallist);

        arrnamec.add("Almonds");
        arrnamec.add("Avocados");
       // arrnamec.add("Bananas");
        arrnamec.add("Cashews");
        arrnamec.add("Cocoa");
        arrnamec.add("Coffee");
        arrnamec.add("Corn");
        arrnamec.add("Cotton");
        arrnamec.add("Olives");
        arrnamec.add("Palm oil");
        arrnamec.add("Peanuts");
        arrnamec.add("Pineapples");
        arrnamec.add("Rubber");
        arrnamec.add("Seaweed");
        arrnamec.add("Silk");
        arrnamec.add("Soybeans");
        arrnamec.add("Sugarcane");
        arrnamec.add("Sunflowers");
        arrnamec.add("Tea");
        arrnamec.add("Tobacco");

        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnamec);
        listViewc.setAdapter(adapter);
        listViewc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if(position == 0){
                    String tit1= "Almonds";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "o5qCg0aAuwU";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==1 ){
                    String tit1= "Avocados";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "ZrpiVjJL0k0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 2){
                    String tit1= "Cashews";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "iFwu2cfsnmc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Cocoa";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "FbcIivtDFzA";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 4){
                    String tit1= "Coffee";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "vzGa9Wi-KwM";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==5 ){
                    String tit1= "Corn";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "nfMLKP1nXK0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Cotton";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "eM36ZrLatak";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 7){
                    String tit1= "Olives";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "CWIBDy4gv0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 8){
                    String tit1= "Palm oil";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "km2X-6qk38c";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 9){
                    String tit1= "Peanuts";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "2VExufCZdcs";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==10 ){
                    String tit1= "Pineapples";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "LLcei6vgK0A";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Rubber";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "dL781kf9M2Y";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 12){
                    String tit1= "Seaweed";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "JdBKVO8yYPE";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 13){
                    String tit1= "Silk";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "vlkIPELbKdo";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 14){
                    String tit1= "Soybeans";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "3JVNJJsyOVc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 15){
                    String tit1= "Sugarcane";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "wdvrzWtkHfA";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 16){
                    String tit1= "Sunflowers";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "LatgukbcTVk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }else if(position == 17){
                    String tit1= "Tea";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "dTHansLrH0M";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else{
                    String tit1= "Tobacco";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "wdVkLiDHNkE";
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