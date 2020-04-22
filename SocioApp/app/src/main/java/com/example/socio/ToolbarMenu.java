package com.example.socio;


import android.app.Activity;
import android.os.Bundle;

import static com.example.socio.R.layout.dashboard;

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