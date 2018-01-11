package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InitialActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class); //instancia a intent com a tela que deseja alcancar
        startActivity(intent); // pula para a proxima tela
    }
}
