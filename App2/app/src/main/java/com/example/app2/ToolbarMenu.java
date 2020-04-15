package com.example.app2;


import android.app.Activity;
import android.os.Bundle;

import static com.example.app2.R.layout.dashboard;

public class ToolbarMenu extends Activity {
    // private android.support.v7.widget.Toolbar toolbar;
    //private androidx.appcompat.widget.Toolbar toolbar;
    private String user;
    private String pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(dashboard);

    }
}