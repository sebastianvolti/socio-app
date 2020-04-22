package com.example.socio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String user;
    private String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void saveUsername(View vista) {
        TextView textoResultado = (TextView) findViewById(R.id.user);
        user = textoResultado.getText().toString();
    }

    public void savePassword(View vista) {
        TextView textoResultado = (TextView) findViewById(R.id.pass);
        pass = textoResultado.getText().toString();

    }

    public void login(View vista){
        saveUsername(vista);
        savePassword(vista);
        System.out.println("user " + this.user);
        System.out.println("pass " + this.pass);
        Intent intent = new Intent(this,Main.class);
        intent.putExtra("user", this.user);
        intent.putExtra("pass", this.pass);
        startActivity(intent);
    }

    public void signup(View vista) {
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }

}
