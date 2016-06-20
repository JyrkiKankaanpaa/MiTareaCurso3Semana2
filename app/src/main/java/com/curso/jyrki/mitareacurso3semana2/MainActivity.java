package com.curso.jyrki.mitareacurso3semana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton =(Button)findViewById(R.id.activitybutton1);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(getApplicationContext(),ActivityDos.class);
                miIntent.putExtra("nombreCompleto_campo_value",findViewById(R.id.nombreCompleto_campo).getContext());
                miIntent.putExtra("fechaDatePicker_value",findViewById(R.id.fechaDatePicker).getContext());
                miIntent.putExtra("teléfono_campo_value",findViewById(R.id.teléfono_campo).getContext());
                miIntent.putExtra("email_campo_value",findViewById(R.id.email_campo).getContext());
                miIntent.putExtra("descripción_campo_value",findViewById(R.id.descripción_campo).getContext());
                startActivity(miIntent);

            }
        });
    }
}
