package com.example.krus;

import static com.razorpay.AppSignatureHelper.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class tradresultact extends AppCompatActivity implements PaymentResultListener {

    ImageView imagetrad;
    TextView tradname,tradprice,traddel;
    Button buynow12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradresultact);

        imagetrad = findViewById(R.id.imagetrad);
        tradname = findViewById(R.id.tradname);
        tradprice = findViewById(R.id.tradprice);
        traddel = findViewById(R.id.traddel);
        buynow12 = findViewById(R.id.buynow123);

        Bundle bundle =getIntent().getExtras();
        if(bundle != null){
            int resid  = bundle.getInt("img");
            imagetrad.setImageResource(resid);

        }

        Intent intent = getIntent();
        String price = intent.getStringExtra("pricetraad");
       String name = intent.getStringExtra("nametrad");
       String cemail = intent.getStringExtra("profemail");
        String cphone = intent.getStringExtra("profphone");
        tradname.setText("Product Name: "+name);
        tradprice.setText("Price: "+price);

        String amount = price+"00";


        Checkout checkout =new Checkout();
        Checkout.preload(getApplicationContext());
        checkout.setKeyID("rzp_test_WWeWqbVeNrplMv");
        checkout.setImage(R.drawable.krushivo);


       buynow12.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               final Activity activity = tradresultact.this;


               try {
                   JSONObject options = new JSONObject();

                   options.put("name", "Krushivottam");
                   options.put("description", "Reference No. #123456");
                   options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.jpg");
                   // options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.
                   options.put("theme.color", "#3399cc");
                   options.put("currency", "INR");
                   options.put("amount", amount);//pass amount in currency subunits
                   options.put("prefill.email", cemail);
                   options.put("prefill.contact",cphone);
                   JSONObject retryObj = new JSONObject();
                   retryObj.put("enabled", true);
                   retryObj.put("max_count", 4);
                   options.put("retry", retryObj);

                   checkout.open(activity, options);

               } catch(Exception e) {
                   Log.e(TAG, "Error in starting Razorpay Checkout", e);
                   Toast.makeText(tradresultact.this, "Error:"+e.getMessage(), Toast.LENGTH_SHORT).show();
               }
           }
       });





            }


    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(getApplicationContext(),"success id "+s,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext(),"failure id "+s,Toast.LENGTH_SHORT).show();
    }
}