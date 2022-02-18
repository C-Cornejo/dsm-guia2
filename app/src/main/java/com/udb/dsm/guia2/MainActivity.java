package com.udb.dsm.guia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    EditText txtNombre,txtHoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        txtNombre = findViewById(R.id.txtNombre);
        txtHoras = findViewById(R.id.txtHoras);

        btnCalcular.setOnClickListener(btnCalcularListener);
        getSupportActionBar().setTitle("Calculo de salario neto");
    }

    View.OnClickListener btnCalcularListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intento = new Intent(MainActivity.this,DetailActivity.class);
            intento.putExtra("trabajador",new Trabajador(txtNombre.getText().toString(),Double.parseDouble(txtHoras.getText().toString())));
            startActivity(intento);

        }
    };

}