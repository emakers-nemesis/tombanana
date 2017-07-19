package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CenActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_cen;
    TextView textView_cen;
    EditText editText_cen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cen);

        btn_cen = (Button) findViewById(R.id.btn_cen);
        textView_cen = (TextView) findViewById(R.id.textView_cen);
        editText_cen = (EditText) findViewById(R.id.editText_cen);
        btn_cen.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        Bananeira bananeira = (Bananeira) intent.getSerializableExtra("bananeira");
        bananeira.setCen(Float.parseFloat(editText_cen.getText().toString()));

        Intent intent1 = new Intent(this, DenActivity.class); // criando a nova intent que aponta para CenActivity
        intent1.putExtra("bananeira", bananeira); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
