package com.curso.jyrki.mitareacurso3semana2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();

        String nombreCompleto_campo_dos = intent.getStringExtra("nombreCompleto_campo_value");
        String fechaDatePicker_dos = intent.getStringExtra("fechaDatePicker_value");
        String teléfono_campo_dos = intent.getStringExtra("teléfono_campo_value");
        String email_campo_dos = intent.getStringExtra("email_campo_value");
        String descripción_campo_dos = intent.getStringExtra("descripción_campo_value");


        Button miBoton2 =(Button)findViewById(R.id.activitybutton1);
        miBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(getApplicationContext(),ActivityDos.class);
                startActivity(miIntent);

            }
        });


    }
}
