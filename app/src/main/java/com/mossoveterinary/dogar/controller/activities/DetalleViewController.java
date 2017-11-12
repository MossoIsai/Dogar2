package com.mossoveterinary.dogar.controller.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.mossoveterinary.dogar.R;
import com.mossoveterinary.dogar.adapter.AdapterRecyclerViewScroll;
import com.mossoveterinary.dogar.models.NObjeto;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by developer on 01/11/17.
 */

public class DetalleViewController extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterRecyclerViewScroll adapterRecyclerViewScroll;
    private List<NObjeto> nObjetoList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_uber_eat);

        initView();


    }

    public void initView() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_detalle);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        recyclerView =  (RecyclerView) findViewById(R.id.recyclerViewScroll);
        nObjetoList = new ArrayList<>();
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        nObjetoList.add(new NObjeto("", ""));
        adapterRecyclerViewScroll = new AdapterRecyclerViewScroll(nObjetoList, getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(adapterRecyclerViewScroll);

    }
}
