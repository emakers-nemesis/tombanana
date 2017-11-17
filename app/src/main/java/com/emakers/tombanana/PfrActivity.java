package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PfrActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pfr;
    Button btn_pfr_ant;
    TextView textView_pfr;
    EditText editText_pfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfr);

        btn_pfr = (Button) findViewById(R.id.btn_pfr);
        btn_pfr_ant = (Button) findViewById(R.id.btn_pfr_ant);
        textView_pfr = (TextView) findViewById(R.id.textView_pfr);
        editText_pfr = (EditText) findViewById(R.id.editText_pfr);
        btn_pfr.setOnClickListener(this);
        btn_pfr_ant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btn_pfr:
                Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input = (InputData) intent.getSerializableExtra("input");

                // Testa se o editText e vazio
                if (TextUtils.isEmpty(editText_pfr.getText().toString())) {
                    editText_pfr.setError("O campo não pode ser vazio!");
                    return;
                }
                input.setInputData(6, Double.parseDouble(editText_pfr.getText().toString()) / 266.0);

                Intent intent1 = new Intent(this, CefActivity.class); // criando a nova intent que aponta para CefActivity
                intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
                startActivity(intent1);
                break;
            case R.id.btn_pfr_ant:
                Intent intent2 = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input1 = (InputData) intent2.getSerializableExtra("input");
                intent2 = new Intent(this, PspActivity.class);
                intent2.putExtra("input", input1); // passando o obj para a intent que vai para CenActivity
                startActivity(intent2);
                break;
        }
    }
}
