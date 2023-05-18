package com.example.krus;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class farmadapter extends RecyclerView.Adapter<farmadapter.farmviewholder>
{

    ArrayList<modelfar> farmlist;
    public farmadapter(ArrayList<modelfar> farmlist) {
        this.farmlist =farmlist;
    }

    @NonNull
    @Override
    public farmviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.farmersinglerow,parent,false);
        return new farmviewholder(view);

    }



    @Override
    public void onBindViewHolder(@NonNull farmviewholder holder, int position) {


        String fname = farmlist.get(position).getFarmername();
        String fcropname = farmlist.get(position).getFarmercropname();
        String femail = farmlist.get(position).getFarmeremail();
        String fphone = farmlist.get(position).getFarmerphone();
        String fquantity = farmlist.get(position).getFarmerquantity();
        String fstate = farmlist.get(position).getFarmerstate();
        String fdist = farmlist.get(position).getFarmerdistrict();
        String fage = farmlist.get(position).getFarmerage();
       String fprice= farmlist.get(position).getFarmerprice();
       String ftotalprice = farmlist.get(position).getFarmertotalprice();

        holder.farmercrop1.setText("Crop Name: "+fcropname);
        holder.farmerquantity1.setText("Quantal: "+fquantity);
        holder.farmerprice1.setText("Price/Quantal: "+fprice);
       holder.farmertotalprice1.setText("Total price: "+ftotalprice);
        holder.farmerstate1.setText("State: "+fstate);
        holder.farmerdistrict1.setText("District: "+fdist);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.cardView.getContext(),farmresultintrad.class);
                intent.putExtra("name",fname);
                intent.putExtra("cropn",fcropname);
                intent.putExtra("email",femail);
                intent.putExtra("phone",fphone);
                intent.putExtra("quantity",fquantity);
                intent.putExtra("state",fstate);
                intent.putExtra("dist",fdist);
                intent.putExtra("price",fprice);
                intent.putExtra("totalprice",ftotalprice);

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                holder.cardView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return farmlist.size();

    }

    class farmviewholder extends RecyclerView.ViewHolder{
        TextView farmercrop1,farmerquantity1,farmerstate1,farmerdistrict1,farmerprice1,farmertotalprice1;
        CardView cardView;

        public farmviewholder(@NonNull View itemView) {
            super(itemView);
            farmercrop1 = itemView.findViewById(R.id.farmercrop1);
            farmerquantity1 = itemView.findViewById(R.id.farmerquantity1);
            farmerprice1= itemView.findViewById(R.id.farmerprice1);
            farmertotalprice1 = itemView.findViewById(R.id.farmertotalprice1);
            farmerstate1 = itemView.findViewById(R.id.farmerstate1);
            farmerdistrict1 = itemView.findViewById(R.id.farmerdistrict12);

            cardView = itemView.findViewById(R.id.farmcard);



        }
    }
}
