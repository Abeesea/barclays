package com.barclays.barclays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Main_Hub on 10/3/2015.
 */
public class Ruleone extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);


        Button firstButton = (Button) findViewById(R.id.button1);


        //Listener for the Purchase Requisition button
        firstButton.setOnClickListener
                (new Button.OnClickListener() {
                     public void onClick(View v) {
                         Intent intent = new Intent(Ruleone.this, Ruletwo.class);
                         startActivity(intent);

                     }
                 }
                );
    }}
