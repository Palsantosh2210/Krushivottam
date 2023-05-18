package com.example.krus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class listviewresultfood extends AppCompatActivity {

    TextView titlel,infol,infol2;
    YouTubePlayerView youTubePlayerView;
    String videoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewresultfood);

        titlel = findViewById(R.id.titlelist);
        infol = findViewById(R.id.listinfo);
        infol2 = findViewById(R.id.listinfo2);
        youTubePlayerView = findViewById(R.id.youtube);


        Intent data = getIntent();
      String tit1 = data.getStringExtra("title");
       // String tit2 =   data.getStringExtra("title2");
       // String tit3 =   data.getStringExtra("title3");
       videoId =  data.getStringExtra("youtuetit");



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

        titlel.setText(tit1);
        infol.setText(tit2);
        infol2.setText(tit3);

        //title


        //youtube
        getLifecycle().addObserver(youTubePlayerView);
        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {

                youTubePlayer.cueVideo(videoId, 0);
            }
        });




    }
}