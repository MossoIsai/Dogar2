package com.mossoveterinary.dogar.controller.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mossoveterinary.dogar.R;

/**
 * Created by developer on 30/10/17.
 */

public class BaseViewController extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);
    }
}
