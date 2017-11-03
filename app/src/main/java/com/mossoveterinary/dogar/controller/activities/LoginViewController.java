package com.mossoveterinary.dogar.controller.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.mossoveterinary.dogar.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginViewController extends AppCompatActivity {

    @BindView(R.id.txtOlvidarPassword) TextView txtOlvidarPassword;
    @BindView(R.id.txtPassword) EditText editPassword;
    @BindView(R.id.txtUsuario) EditText editUsuario;
    @BindView(R.id.btnInciarSesion) Button btnIniciarSesion;
    @BindView(R.id.btnRegistrar) Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        ButterKnife.bind(this);
        initsViews();
    }
    public void initsViews(){

        Typeface typefaceSemibol  = Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Semibold.otf");
        Typeface typefaceBold =  Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Bold.otf");
        Typeface typefaceLigth =  Typeface.createFromAsset(getAssets(),"fonts/SF-UI-Display-Light.otf");

        editUsuario.setTypeface(typefaceSemibol);
        editPassword.setTypeface(typefaceSemibol);
        btnIniciarSesion.setTypeface(typefaceBold);
        btnRegistrar.setTypeface(typefaceBold);
        txtOlvidarPassword.setTypeface(typefaceSemibol);

    }
    @OnClick(R.id.txtOlvidarPassword) void clickOlvidarPassword(){

        Intent intent = new Intent(this,OlvidarContrasenaViewController.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnRegistrar)
    public void clickRegistrar() {
        //btn click en registrar
        Intent intent = new Intent(this, RegistrarViewController.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnInciarSesion)
    public void clickIniciarSesion() {
        Intent intent = new Intent(this, BaseViewController.class);
        startActivity(intent);
       // finish();

    }

}
