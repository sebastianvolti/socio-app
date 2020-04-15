package com.example.app2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.app2.R.layout.dashboard;

public class Dashboard extends Activity {
    // private android.support.v7.widget.Toolbar toolbar;
    //private androidx.appcompat.widget.Toolbar toolbar;
    private String user;
    private String pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(dashboard);

    }

    public void sportsView(View vista){
        Intent intent = new Intent(this,ActivityList.class);
        startActivity(intent);
    }


    public void benefView(View vista){
        Intent intent = new Intent(this,DashboardBenef.class);
        startActivity(intent);
    }

}