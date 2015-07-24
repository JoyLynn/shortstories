package com.jjh.shortstories;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.listView);

        // Defined Array values to show in ListView
        String[] values = new String[]{"The fellow had a key - By Louis Stevenson",
                "Dinasour before dark - By Jack and Annie",
                "Mr Hyde's house - By Edward Hyde",
                "The Last Night - By G. J. Utterson",
                "The Carew murder case - By Jekyll’s house",
                "Incident of the letter - By Edward Hyde",
                "Code school Journals",
                "Holla at your boy"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Story :" + " " + itemValue, Toast.LENGTH_LONG)
                        .show();
                //linking the list view to a new activity
                if (position == 0) {
                    Intent myIntent = new Intent(getApplicationContext(), story1.class);
                    startActivity(myIntent);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(getApplicationContext(), story2.class);
                    startActivity(myIntent);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(getApplicationContext(), story3.class);
                    startActivity(myIntent);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(getApplicationContext(), story4.class);
                    startActivity(myIntent);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(getApplicationContext(), story5.class);
                    startActivity(myIntent);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(getApplicationContext(), story6.class);
                    startActivity(myIntent);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(getApplicationContext(), story7.class);
                    startActivity(myIntent);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(getApplicationContext(), story8.class);
                    startActivity(myIntent);
                }

            }

        });

    }
}