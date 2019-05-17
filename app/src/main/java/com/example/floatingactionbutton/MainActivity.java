package com.example.floatingactionbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FABToolbarLayout morph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_label);
        morph = (FABToolbarLayout) findViewById(R.id.menu_fab);

        View uno, dos, tres, cuatro;

        uno = findViewById(R.id.accion_favorito);
        dos = findViewById(R.id.accion_buscar);
        cuatro = findViewById(R.id.accion_carrito);

        fab.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        cuatro.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.menu_fab) {
            morph.show();
        }

        morph.hide();
    }
}