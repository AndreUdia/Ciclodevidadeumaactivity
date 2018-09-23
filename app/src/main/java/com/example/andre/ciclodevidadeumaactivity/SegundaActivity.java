package com.example.andre.ciclodevidadeumaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);
        Intent i = getIntent();
        String nome = i.getStringExtra("nome");
        ((TextView) findViewById(R.id.dados)).setText(nome);

    }
}
