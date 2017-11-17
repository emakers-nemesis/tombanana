package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PraActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pra;
    Button btn_pra_ant;
    TextView textView_pra;
    EditText editText_pra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra);

        //achando elementos que estao no xml
        btn_pra = (Button) findViewById(R.id.btn_pra);
        btn_pra_ant = (Button) findViewById(R.id.btn_pra_ant);
        textView_pra = (TextView) findViewById(R.id.textView_pra);
        editText_pra = (EditText) findViewById(R.id.editText_pra);

        btn_pra.setOnClickListener(this); // ativando o evento do botao
        btn_pra_ant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()) {

            case R.id.btn_pra:
                Intent intent = new Intent(this, CenActivity.class); // criando a nova intent que aponta para CenActivity
                InputData input = new InputData();

                // Testa se o editText e vazio
                if (TextUtils.isEmpty(editText_pra.getText().toString())) {
                    editText_pra.setError("O campo não pode ser vazio!");
                    return;
                }
                input.setInputData(0, Double.parseDouble(editText_pra.getText().toString()) / 2.6); // pegando o valor do texto e passando para a classe
                intent.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
                startActivity(intent); // pula pra CenActivity
                break;

            case R.id.btn_pra_ant:
                Intent intent1 = new Intent(this, MainActivity.class); // criando a nova intent que aponta para CenActivity
                startActivity(intent1);
                break;

        }
    }

}
