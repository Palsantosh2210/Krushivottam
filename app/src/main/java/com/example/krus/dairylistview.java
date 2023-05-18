package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class dairylistview extends AppCompatActivity {

    ListView listViewd;
    ArrayList<String> arrnamed = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairylistview);

        listViewd = findViewById(R.id.dairylist);

        arrnamed.add("Butter");
        arrnamed.add("Buttermilk");
        arrnamed.add("Cheddar");
        arrnamed.add( "Cheese");
        arrnamed.add("Condensed milk");
        arrnamed.add("Cottage cheese");
        arrnamed.add("Cream");
        arrnamed.add("Cream cheese");
        arrnamed.add("Evaporated milk");
        arrnamed.add( "Feta");
        arrnamed.add("Ghee");
        arrnamed.add("Ice cream");
        arrnamed.add("Kefir");
        arrnamed.add("Mascarpone cheese");
        arrnamed.add("Milk");
        arrnamed.add("Mozzarella");
        arrnamed.add("Powdered milk");
        arrnamed.add("Quark cheese");
        arrnamed.add("Ricotta cheese");
        arrnamed.add("Skyr");
        arrnamed.add("Sour cream");
        arrnamed.add("Whipped cream");
        arrnamed.add("Yoghurt fruit-flavored");
        arrnamed.add("Yoghurt Greek");
        arrnamed.add("Yogurt");

        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnamed);
        listViewd.setAdapter(adapter);
            listViewd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position == 0){
                        String tit1= "Butter";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 1){
                        String tit1= "Buttermilk";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 2){
                        String tit1= "Cheddar";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 3){
                        String tit1= "Cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 4){
                        String tit1= "Condensed milk";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position ==5 ){
                        String tit1= "Cottage cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 6){
                        String tit1= "Cream";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 7){
                        String tit1= "Cream cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 8){
                        String tit1= "Evaporated milk";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 9){
                        String tit1= "Feta";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position ==10 ){
                        String tit1= "Ghee";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 11){
                        String tit1= "Ice cream";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 12){
                        String tit1= "Kefir";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 13){
                        String tit1= "Mascarpone cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 14){
                        String tit1= "Milk";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 15){
                        String tit1= "Mozzarella";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 16){
                        String tit1= "Powdered milk";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 17){
                        String tit1= "Quark cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 18){
                        String tit1= "Ricotta cheese";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 19){
                        String tit1= "Skyr";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 20){
                        String tit1= "Sour cream";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 21){
                        String tit1= "Whipped cream";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 22){
                        String tit1= "Yoghurt fruit-flavored";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }
                    else if (position == 23){
                        String tit1= "Yoghurt Greek";
                        String tit2= "";
                        String tit3= "";
                        String youtuevi= "";
                        dataintent(tit1,tit2,tit3,youtuevi);
                    }

                    else {
                        String tit1= "Yoghurt";
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