package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FormClub2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_club2);
    }

    public void stepback(View vista) {
        Intent intent = new Intent(this, FormClub.class);
        startActivity(intent);
    }

    public void dash(View vista) {
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }



}
