package com.barclays.barclays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class
        MainActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button firstButton = (Button) findViewById(R.id.button);


        //Listener for the Purchase Requisition button
        firstButton.setOnClickListener
                (new Button.OnClickListener() {
                     public void onClick(View v) {
                         Intent intent = new Intent(MainActivity.this, Ruleone.class);
                         startActivity(intent);

                     }
                 }
                );
    }}