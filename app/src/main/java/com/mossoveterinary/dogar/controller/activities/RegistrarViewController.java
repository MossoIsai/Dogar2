package com.mossoveterinary.dogar.controller.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mossoveterinary.dogar.R;
import com.mossoveterinary.dogar.adapter.AdapterRecylerView;
import com.mossoveterinary.dogar.models.NObjeto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 30/10/17.
 */

public class RegistrarViewController extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterRecylerView adapterRecylerView;
    private List<NObjeto> nObjetoList;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrar_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_recycler_view);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }
        initViews();

    }


    public void initViews(){
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_recycler_view);
        nObjetoList = new ArrayList<>();
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));
        nObjetoList.add(new NObjeto("",""));

        adapterRecylerView = new AdapterRecylerView(nObjetoList, getApplicationContext(), new AdapterRecylerView.onItemClicklistener() {
            @Override
            public void onItemClick(NObjeto nObjeto) {
                Intent intent = new Intent(getApplication(),DetalleViewController.class);
                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapterRecylerView);
        recyclerView.setNestedScrollingEnabled(true);




    }
}
