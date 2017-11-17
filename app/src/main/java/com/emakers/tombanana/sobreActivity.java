package com.emakers.tombanana;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sobreActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        btn_voltar = (Button) findViewById(R.id.btn_voltar); // pegando o id do xml
        btn_voltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class); //instancia a intent com a tela que deseja
        // alcancar
        startActivity(intent); // pula para a proxima tela
    }
}
