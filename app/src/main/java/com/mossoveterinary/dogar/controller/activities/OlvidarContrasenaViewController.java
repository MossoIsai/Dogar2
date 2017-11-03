package com.mossoveterinary.dogar.controller.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mossoveterinary.dogar.R;

/**
 * Created by developer on 03/11/17.
 */

public class OlvidarContrasenaViewController extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.olvidar_password_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_olvidarpassword);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}
