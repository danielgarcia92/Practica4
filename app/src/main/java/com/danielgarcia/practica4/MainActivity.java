package com.danielgarcia.practica4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hotel (View view){
        Intent i = new Intent(this, Hoteles.class);
        startActivity(i);
    }

    public void bar (View view){
        Intent i = new Intent(this, Bares.class);
        startActivity(i);
    }

    public void turismo (View view){
        Intent i = new Intent(this, Turismo.class);
        startActivity(i);
    }

    public void demografia (View view){
        Intent i = new Intent(this, Demografia.class);
        startActivity(i);
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
        if (id == R.id.action_settings) {
            return true;
        }

        if (id==R.id.menuA){
            Intent i = new Intent(this, AcercaDe.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
