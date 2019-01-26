package com.example.akashkumar.gkv1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class yoga extends YouTubeBaseActivity {

    YouTubePlayerView mYouTubePlayerView;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    Button play1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        play1=findViewById(R.id.play4);

        mYouTubePlayerView=findViewById(R.id.youtube4);




        play1.setOnClickListener(new View.OnClickListener() {
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



                        youTubePlayer.loadVideo("lNeM5YkyESg");




                    }



                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                    }
                };


                mYouTubePlayerView.initialize(YouTubeconfig.getApiKey(),mOnInitializedListener);

            }


        });
    }
}
