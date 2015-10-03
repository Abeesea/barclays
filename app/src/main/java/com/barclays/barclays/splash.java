package com.barclays.barclays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class splash extends Activity {

    //Set the time the splash scree time will take
    private static int splashInterval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
// Set the view of this activity to be Splash.xml
        setContentView(R.layout.activity_splash);

        new android.os.Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                // TODO Auto-generated method stub
                //Starting the splash activity
                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);


                //This exits the SplashScreen activity
                this.finish();
            }

            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    }


}