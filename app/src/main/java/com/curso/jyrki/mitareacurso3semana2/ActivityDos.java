package com.curso.jyrki.mitareacurso3semana2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityDos extends AppCompatActivity {

    TextView dosNobre;
    TextView dosTele;
    TextView dosEmail;
    TextView dosDes;
    TextView dosFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        Bundle dosBundle = getIntent().getExtras();

        dosNobre = (TextView) findViewById(R.id.nombreCompleto_dos);
        dosNobre.setText((CharSequence) dosBundle.get("send_dNobre"));

        dosTele = (TextView) findViewById(R.id.teléfono_dos);
        dosTele.setText((CharSequence) dosBundle.get("send_dTele"));

        dosEmail = (TextView) findViewById(R.id.email_dos);
        dosEmail.setText((CharSequence) dosBundle.get("send_dEmail"));

        dosDes = (TextView) findViewById(R.id.descripción_dos);
        dosDes.setText((CharSequence) dosBundle.get("send_dDes"));

        dosFecha = (TextView) findViewById(R.id.fecha_dos);
        dosFecha.setText((CharSequence) dosBundle.get("send_dFecha"));

    }
}
