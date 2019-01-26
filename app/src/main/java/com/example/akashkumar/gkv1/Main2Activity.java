package com.example.akashkumar.gkv1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Main2Activity extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayerView mYouTubePlayerView1;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    Button play2,play5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        play2=findViewById(R.id.play2);

        mYouTubePlayerView=findViewById(R.id.youtube2);

        play5=findViewById(R.id.play5);

        mYouTubePlayerView1=findViewById(R.id.youtube5);




        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {







                       /* youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION
                                | YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI
                                | YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE
                                | YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);*/
                        youTubePlayer.setShowFullscreenButton(false);



                        youTubePlayer.loadVideo("jcIb_6upgPY");




                    }



                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                };


                mYouTubePlayerView.initialize(YouTubeconfig.getApiKey(),mOnInitializedListener);

            }


        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {







                      /*  youTubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION
                                | YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI
                                | YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE
                                | YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);*/
                        youTubePlayer.setShowFullscreenButton(false);



                        youTubePlayer.loadVideo("mujN_ppswBA");




                    }



                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                };


                mYouTubePlayerView1.initialize(YouTubeconfig.getApiKey(),mOnInitializedListener);

            }


        });
    }
}
