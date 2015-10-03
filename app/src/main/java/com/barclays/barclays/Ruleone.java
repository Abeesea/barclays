package com.barclays.barclays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Main_Hub on 10/3/2015.
 */
public class Ruleone extends ActionBarActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        listView = (android.widget.ListView) findViewById(R.id.listView1);

        String[] values = new String[] {"STEP ONE","STEP TWO", "STEP THREE", "STEP FOUR"};
        String[] previews = new String[] {};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String itemValue =(String) listView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "STEP at index:" + " " + itemValue, Toast.LENGTH_SHORT)
                        .show();
                if (position == 0) {
                    Intent appInfo = new Intent(getBaseContext(), Ruletwo.class);
                    startActivity(appInfo);
                }
                if (position == 1) {
                    Intent appInfo = new Intent(getBaseContext(), Rulethree.class);
                    startActivity(appInfo);
                }
                if (position == 2) {
                    Intent appInfo = new Intent(getBaseContext(), Rulefour.class);
                    startActivity(appInfo);
                }
                if (position == 3) {
                    Intent appInfo = new Intent(getBaseContext(), Rulefive.class);
                    startActivity(appInfo);
                }

            }
        });
    }
}