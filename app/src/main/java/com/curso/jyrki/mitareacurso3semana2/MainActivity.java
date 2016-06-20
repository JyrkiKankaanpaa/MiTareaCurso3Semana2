package com.curso.jyrki.mitareacurso3semana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button miBoton;
    EditText mNobre;
    EditText mFecha;
    EditText mTele;
    EditText mEmail;
    EditText mDes;
    DatePicker dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBoton =(Button)findViewById(R.id.activitybutton1);
        mNobre = (EditText) findViewById(R.id.nombreCompleto_campo);
      //  mFecha = (EditText) findViewById(R.id.nombreCompleto_campo);
        mTele = (EditText) findViewById(R.id.teléfono_campo);
        mEmail = (EditText) findViewById(R.id.email_campo);
        mDes = (EditText) findViewById(R.id.descripción_campo);
        dp = (DatePicker) findViewById(R.id.datePicker);

        miBoton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String dNobre = mNobre.getText().toString();
                String dTele = mTele.getText().toString();
                String dEmail = mEmail.getText().toString();
                String dDes = mDes.getText().toString();
                String dFecha = dp.getDayOfMonth()+"/"+ dp.getMonth()+"/"+ dp.getYear();

                Log.d("MainActivity", "main*********************" + mNobre);

                Intent miIntent = new Intent("second_filter");
                Bundle miBundle = new Bundle();
                miBundle.putString("send_dNobre",dNobre);
                miBundle.putString("send_dTele",dTele);
                miBundle.putString("send_dEmail",dEmail);
                miBundle.putString("send_dDes",dDes);
                miBundle.putString("send_dFecha",dFecha);
                miIntent.putExtras(miBundle);

                startActivity(miIntent);

            }
        });
    }
}
