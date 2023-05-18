package com.example.krus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class foodcroplistview extends AppCompatActivity {

    ListView listViewfc;
    ArrayList<String> arrnamefc = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcroplistview);

        listViewfc = findViewById(R.id.foodcroplist);


        arrnamefc.add("Barley");
        arrnamefc.add("Corn");
        arrnamefc.add("Millet");
        arrnamefc.add("Oats");
        arrnamefc.add("Quinoa");
        arrnamefc.add("Rice");
        arrnamefc.add("Rye");
        arrnamefc.add("Sorghum");
        arrnamefc.add("Wheat");
        arrnamefc.add("Wild rice");
        arrnamefc.add("Asparagus");
        arrnamefc.add("Beetroot");
        arrnamefc.add("Broccoli");
        arrnamefc.add("Carrots");
        arrnamefc.add("Cauliflower");
        arrnamefc.add("Cucumber");
        arrnamefc.add("Eggplant");
        arrnamefc.add("Green beans");
        arrnamefc.add("Kale");
        arrnamefc.add("Lettuce");
        arrnamefc.add("Okra");
        arrnamefc.add("Peppers");
        arrnamefc.add("Pumpkin");
        arrnamefc.add("Spinach");
        arrnamefc.add("Squash");
        arrnamefc.add("Tomatoes");
        arrnamefc.add("Zucchini");




        ArrayAdapter adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnamefc);
        listViewfc.setAdapter(adapter);

        listViewfc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    String tit1= "Barley";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "Fg9ksZKVUBY";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==1 ){
                    String tit1= "Corn";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "O0KSZn5QuX0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 2){
                    String tit1= "Millet";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "7WGCIguKYCU";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 3){
                    String tit1= "Oats";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "FOy-icS0FdI";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 4){
                    String tit1= "Quinoa";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "EG1b9sinGqs";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==5 ){
                    String tit1= "Rice";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "EG1b9sinGqs";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 6){
                    String tit1= "Rye";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "VoWlONmJNPc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 7){
                    String tit1= "Sorghum";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "tZb_pI98zM0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 8){
                    String tit1= "Wheat";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "_ULc_pkwMPA";
                    dataintent(tit1,tit2,tit3,youtuevi);
                }
                else if(position == 9){
                    String tit1= "Wild rice";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "MFhqS3lKSyo";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==10 ){
                    String tit1= "Asparagus";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "6nMZKnbDStI";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 11){
                    String tit1= "Beetroot";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "dtApEHttr0Q";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 12){
                    String tit1= "Broccoli";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "U1K_V5CL6vY";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 13){
                    String tit1= "Carrots";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "XdyWkRLfR9I";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 14){
                    String tit1= "Cauliflower";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "upNINtTZ05Q";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 15){
                    String tit1= "Cucumber";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "q5kJ4hil45Y";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }else if(position == 16){
                    String tit1= "Eggplant";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "L4saezVKYpo";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 17){
                    String tit1= "Green beans";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "LcOyQd_ykQs";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 18){
                    String tit1= "Kale";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "DlTfch3BxY0";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 19){
                    String tit1= "Lettuce";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "LcOyQd_ykQs";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 20){
                    String tit1= "Okra";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "KI32ejYWwo";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==21 ){
                    String tit1= "Peppers";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "1PKtae6K93Q";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 22){
                    String tit1= "Pumpkin";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "BMlMYrkouGQ";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 23){
                    String tit1= "Spinach";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "cV9KY6jnQAc";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position == 24){
                    String tit1= "Squash";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "DFbiztHI3w";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else if(position ==25 ){
                    String tit1= "Tomatoes";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "gv4ecC4zELg";
                    dataintent(tit1,tit2,tit3,youtuevi);

                }
                else{
                    String tit1= "Zucchini";
                    String tit2= "";
                    String tit3= "";
                    String youtuevi= "REKY21JIAVQ";
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