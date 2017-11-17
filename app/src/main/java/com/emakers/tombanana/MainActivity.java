package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_calcular;
    Button btn_sobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_calcular = (Button) findViewById(R.id.btn_calcular); // pegando o id do xml
        btn_calcular.setOnClickListener(this);

        btn_sobre = (Button) findViewById(R.id.btn_sobre); // pegando o id do xml
        btn_sobre.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btn_calcular:
                Intent intent = new Intent(this, PraActivity.class); //instancia a intent com a tela que deseja
                // alcancar
                startActivity(intent); // pula para a proxima tela
                break;
            case R.id.btn_sobre:
                Intent intent1 = new Intent(this, sobreActivity.class); //instancia a intent com a tela que deseja
                // alcancar
                startActivity(intent1); // pula para a proxima tela
                break;
        }
    }
    //https://pt.stackoverflow.com/questions/75646/passar-objeto-por-par%C3%A2metro-causa-erro-android-studio
    //https://www.youtube.com/watch?v=Gi46yco8OJg
}
