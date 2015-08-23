package com.example.stephen.traveland;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private TravelHolder travelHolder;
    private int advisoryLevelID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is where all the ids are being held and being called from.
        travelHolder = new TravelHolder();
        ButterKnife.bind(travelHolder, this);
    }

    public void submitLevel(View view) {

        // http://developer.android.com/intl/ko/training/basics/firstapp/starting-activity.html
        advisoryLevelID = (int) travelHolder.levelOption.getSelectedItemId();
        Intent intent = new Intent(MainActivity.this, ListOfCountriesByLevel.class);
        intent.putExtra("key", advisoryLevelID);
        startActivity(intent);

        /*Toast.makeText(MainActivity.this,
                "Result : " + "\nSpinner 1 : " + String.valueOf(String.valueOf(travelHolder.levelOption.getSelectedItemId())),
                Toast.LENGTH_LONG).show();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Help");
            builder.setMessage("By selecting the advisory level in the option menu and submiting your " +
                    "option with the submit button. A list will populate with results based on your choice.");
            builder.setNegativeButton("close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
            return true;
        } else if (id == R.id.action_about) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle("About");
            builder2.setMessage("This app offers advice and advisory information to keep you " +
                    "informed about the vacation destination you are planning to vacate.");
            builder2.setNegativeButton("close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder2.create();
            alert.show();
        }


        return super.onOptionsItemSelected(item);
    }

    // From developping my app in prj666
    protected class TravelHolder {
        @Bind(R.id.spinner)
        Spinner levelOption;
    }
}
