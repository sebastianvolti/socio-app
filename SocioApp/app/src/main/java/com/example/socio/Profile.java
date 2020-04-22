package com.example.socio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }


    public void formClub(View vista) {
        Intent intent = new Intent(this, FormClub.class);
        startActivity(intent);
    }
}
