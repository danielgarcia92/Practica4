package com.danielgarcia.practica4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Hoteles extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
    }

    public void volverH (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void lolita (View view){
        Intent i = new Intent(this, Lolita.class);
        startActivity(i);
    }

    public void cisneros (View view){
        Intent i = new Intent(this, Cisneros.class);
        startActivity(i);
    }

    public void hosteria (View view){
        Intent i = new Intent(this, Hosteria.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hoteles, menu);
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

        return super.onOptionsItemSelected(item);
    }
}