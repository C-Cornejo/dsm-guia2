package com.udb.dsm.guia2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView lblSalario,lblTotal,lblDescuento,lblNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        lblDescuento = findViewById(R.id.lblDescuento);
        lblSalario = findViewById(R.id.lblSalario);
        lblTotal = findViewById(R.id.lblTotal);
        lblNombre = findViewById(R.id.lblNombre);

        Intent i = getIntent();
        Trabajador t = (Trabajador) i.getExtras().getSerializable("trabajador");

        getSupportActionBar().setTitle("Resultados");
        lblDescuento.setText(String.valueOf(t.getDescuento()));
        lblSalario.setText(String.valueOf(t.getSalario()));
        lblTotal.setText(String.valueOf(t.getTotal()));
        lblNombre.setText(String.valueOf(t.getNombre()));

    }


}
