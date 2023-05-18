package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class poultrylistview extends AppCompatActivity {

    ListView listViewp;
    ArrayList<String> arrnamep = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poultrylistview);

        listViewp = findViewById(R.id.poultyrlist);


        arrnamep.add("Chickens");
        arrnamep.add("Ducks");
        arrnamep.add("Turkeys");
        arrnamep.add("Geese");
        arrnamep.add("Quail");
        arrnamep.add("Guinea fowl");
        arrnamep.add("Pheasants");
        arrnamep.add("Ostriches");
        arrnamep.add("Emus");
        arrnamep.add("Pigeons");
        arrnamep.add("Partridges");
        arrnamep.add("Peafowl");
        arrnamep.add("Songbirds");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnamep);
        listViewp.setAdapter(adapter);

        listViewp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    String tit1= "Chickens";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 1){
                    String tit1= "Ducks";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);


                }
                else if(position == 2){
                    String tit1= "Turkeys";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Geese";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }

                else if(position == 4){
                    String tit1= "Quail";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 5){
                    String tit1= "Guinea fowl";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Pheasants";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);
                }
                else if(position == 7){
                    String tit1= "Ostriches";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);


                }
                else if(position == 8){
                    String tit1= "Emus";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 9){
                    String tit1= "Pigeons";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 10){
                    String tit1= "Partridges";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Peafowl";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else {
                    String tit1= "Songbirds";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
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