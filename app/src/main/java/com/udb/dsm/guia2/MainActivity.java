package com.udb.dsm.guia2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblCounter;
    Button btnAumentar;
    CounterViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblCounter = findViewById(R.id.lblCounter);
        btnAumentar = findViewById(R.id.btnAumentar);

        model = new ViewModelProvider(this).get(CounterViewModel.class);
        model.getCounter().observe(this, c ->{
            //actualizar la ui
            lblCounter.setText(c.toString());
        });
        btnAumentar.setOnClickListener(btnAumentarListener);


    }// END onCreate

    private View.OnClickListener btnAumentarListener = new View.OnClickListener(){

        public void onClick(View v){
            // haz algo despues del click
            if(model.getCounter().getValue() < 9)
            {
                model.getCounter().setValue(model.getCounter().getValue() + 1);
            }
            else
            {
                model.getCounter().setValue(0);
            }

        }
    };


}
