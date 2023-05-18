package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class hortilistview extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrname = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hortilistview);
            listView = findViewById(R.id.hortilist);

       arrname.add("Apples");
        arrname.add("Avocados");
        arrname.add("Bananas");
     arrname.add("Blackberries");
             arrname.add("Blueberries");
              arrname.add("Cantaloupes");
            arrname.add("Cherries");
            arrname.add("Grapes");
           arrname.add("Honeydews");
            arrname.add("Kiwis");
        arrname.add("Lemons");
        arrname.add("Limes");
      arrname.add("Mangoes");
        arrname.add("Oranges");
     arrname.add("Papayas");
     arrname.add("Peaches");
   arrname.add("Pears");
           arrname.add("Pineapples");
              arrname.add("Plums");
         arrname.add("Raspberries");
                 arrname.add("Strawberries");
         arrname.add("Watermelons");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrname);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){

                    String tit1 = "Apple";
                    String tit2 = "Site selection: Choose a site with well-draining soil, full sun exposure, and good air circulation. Avoid low-lying areas or sites prone to frost pockets, as these can increase the risk of frost damage to the trees.\n" +
                            "\n" +
                            "Planting: Plant apple trees in the early spring or fall. Dig a hole slightly larger than the root ball and backfill with soil. Water thoroughly and mulch around the base of the tree to help retain moisture.\n" +
                            "\n" +
                            "Fertilization: Fertilize apple trees annually in the early spring with a balanced fertilizer to provide essential nutrients for growth and fruit production.\n" +
                            "\n" +
                            "Pruning: Prune apple trees annually to remove dead or diseased wood, promote healthy growth, and encourage fruit production.\n" + "Pest and disease management: Monitor apple trees regularly for signs of pests or diseases, and take action as needed. This may involve using natural or synthetic pesticides, or implementing cultural practices to prevent or reduce pest and disease pressure.\n" +
                            "\n" +
                            "Harvesting: Apples should be harvested when they are fully ripe and ready to eat. This typically occurs in the late summer or early fall, depending on the variety of apple and the growing conditions.";
                    String tit3 ="Apple trees need full sun, with at least six to eight hours of sunlight during the growing season. The best soil for apple trees is moist and well-drained with a neutral soil pH of 6.0 to 7.0. If the soil in your planting site isn't suited for apple trees, you can try amending it prior to planting.";
                    String youtuevi = "SSSJCroA3Zs";
                    dataintent(tit1,tit2,tit3,youtuevi);
                }
                else if(position == 1){
                    String tit1= "Avocados";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);
                }
                else if(position == 2 ){
                    String tit1= "Bananas";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Blackberries";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 4){
                    String tit1= "Cantaloupes";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 5){
                    String tit1= "Cherries";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Grapes";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 7){
                    String tit1= "Honeydews";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 8){
                    String tit1= "Kiwis";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 9){
                    String tit1= "Lemons";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 10){
                    String tit1= "Limes";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Mangoes";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 12){
                    String tit1= "Oranges";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 13){
                    String tit1= "Papayas";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 14){
                    String tit1= "Peaches";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);


                }else if(position == 15){
                    String tit1= "Pears";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 16){
                    String tit1= "Pineapples";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 17){
                    String tit1= "Plums";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 18){
                    String tit1= "Raspberries";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 19){
                    String tit1= "Strawberries";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else{
                    String tit1= "Watermelons";
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