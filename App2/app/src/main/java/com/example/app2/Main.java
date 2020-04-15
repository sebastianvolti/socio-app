package com.example.app2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import static com.example.app2.R.layout.main;

//import androidx.appcompat.widget.Toolbar;
//import android.support.v7.widget.Toolbar;


public class Main extends Activity {
   // private android.support.v7.widget.Toolbar toolbar;
    //private androidx.appcompat.widget.Toolbar toolbar;
    private String user;
    private String pass;
    private static int TIME_OUT = 2000; //Time to launch the another activity


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle datos = getIntent().getExtras();
        user = datos.getString("user");
        pass = datos.getString("pass");
        setContentView(main);
        TextView textoResultado = (TextView) findViewById(R.id.textView3);
        textoResultado.setText("Hello " + user);

        //final View myLayout = findViewById(R.i);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main.this, Dashboard.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

        /*
       try {
            Thread.sleep(5000);
            Intent intent = new Intent(this,Dashboard.class);
            startActivity(intent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        //  toolbar = findViewById(R.id.toolbar);
        //  setActionBar(toolbar);
        //  setActionBar(toolbar);

    }


    public void logout(View vista) {
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu) {
        getMenuInflater().inflate(R.menu.activity_menu,mimenu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem opcion) {
       int id = opcion.getItemId();

       if (id == R.id.setting){
           return true;
       }
        if (id == R.id.exit){
         //   View vista = new View(main);
        //  logout(vista);
            return true;
        }
        return super.onOptionsItemSelected(opcion);

    }
}
