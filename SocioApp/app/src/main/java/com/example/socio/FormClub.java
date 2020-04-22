package com.example.socio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FormClub extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_club);
    }

    public void step2(View vista) {
        Intent intent = new Intent(this, FormClub2.class);
        startActivity(intent);
    }

}
