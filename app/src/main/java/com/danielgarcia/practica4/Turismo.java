package com.danielgarcia.practica4;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Turismo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }

    public void volverT (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void charcos (View view){
        Intent i = new Intent(this, Charcos.class);
        startActivity(i);
    }

    public void museo (View view){
        Intent i = new Intent(this, Museo.class);
        startActivity(i);
    }

    public void motorrodillo (View view){
        Intent i = new Intent(this, Motorrodillo.class);
        startActivity(i);
    }

    public void locomotora (View view){
        Intent i = new Intent(this, Locomotora.class);
        startActivity(i);
    }

    public void infocisnerosBoton (View view){
        Intent i = new Intent(this, InfoCisneros.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_turismo, menu);
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