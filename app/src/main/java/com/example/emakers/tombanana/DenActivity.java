package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DenActivity extends AppCompatActivity {

    TextView textView_den;
    TextView textView_teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_den);

        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        Bananeira bananeira = (Bananeira) intent.getSerializableExtra("bananeira");

        textView_den = (TextView) findViewById(R.id.textView_den);
        textView_teste = (TextView) findViewById(R.id.textView_teste);

        textView_den.setText(Float.toString(bananeira.getPra()));
        textView_teste.setText(Float.toString(bananeira.getCen()));

    }
}
