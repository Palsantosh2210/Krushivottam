package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class animalhuslistview extends AppCompatActivity {

    ListView listViewah;
    ArrayList<String> arrnameah = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalhuslistview);
        listViewah = findViewById(R.id.animalhuslist);

        arrnameah.add("Cow");
        arrnameah.add("Pig");
        arrnameah.add("Chicken");
        arrnameah.add("Sheep");
        arrnameah.add("Goat");
        arrnameah.add("Horse");
        arrnameah.add("Rabbit");
        arrnameah.add("Bee");
       // arrnameah.add("Fish");
        arrnameah.add("Deer");
        arrnameah.add("Ostrich");
        arrnameah.add("Alpaca");
        arrnameah.add("Llama");
        arrnameah.add("Emu");
        arrnameah.add("Duck");
       /* arrnameah.add("");
        arrnameah.add("");
        arrnameah.add("");
        arrnameah.add(""); */

        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnameah);
        listViewah.setAdapter(adapter);


        listViewah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position == 0){
                    String tit1= "Cow";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "Ldz4_tFmolw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==1 ){
                    String tit1= "Pig";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "HH8O12R7SBw";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 2){
                    String tit1= "Chicken";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "n8fIlw69vcA";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Sheep";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "fayNcAAAIzA";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 4){
                    String tit1= "Goat";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "xgu2HOxli58";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==5 ){
                    String tit1= "Horse";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "cy2sTR490ls";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Rabbit";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "3CNwxQ_BISU";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 7){
                    String tit1= "Bee";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "g1WNyAEtlYU";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 8){
                    String tit1= "Fish";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "R0QrIGebUdk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 9){
                    String tit1= "Deer";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "R0QrIGebUdk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==10 ){
                    String tit1= "Ostrich ";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "oJ6kXUr9Isk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Alpaca";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "oJ6kXUr9Isk";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 12){
                    String tit1= "Llama";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "qXqlR-fbl3o";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 13){
                    String tit1= "Emu";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "3qTsDed8FQ0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else {
                    String tit1= "Duck";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "Ye7y2LvuvM8";
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