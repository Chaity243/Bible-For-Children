package com.children.bible;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000; // time out for the splash in ms
    private Handler mHandlerSplash;
    private Context mContext;

    private WebView splash_web;


    private String isUserRegistered = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        mContext = this;
        mHandlerSplash = new Handler();
        mHandlerSplash.postDelayed(new Runnable() {

            @Override
            public void run() {


                Intent main = new Intent(mContext, MainActivity.class);
                startActivity(main);

            }



        }, SPLASH_TIME_OUT);



    }


    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        super.onBackPressed();

        if (mHandlerSplash != null) {
            // Stops the handler
            mHandlerSplash.removeCallbacksAndMessages(null);
            finish();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }


}