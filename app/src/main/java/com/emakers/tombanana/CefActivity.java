package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CefActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_cef;
    Button btn_cef_ant;
    TextView textView_cef;
    EditText editText_cef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef);

        btn_cef = (Button) findViewById(R.id.btn_cef);
        btn_cef_ant = (Button) findViewById(R.id.btn_cef_ant);
        textView_cef = (TextView) findViewById(R.id.textView_cef);
        editText_cef = (EditText) findViewById(R.id.editText_cef);
        btn_cef.setOnClickListener(this);
        btn_cef_ant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch (v.getId()) {

            case R.id.btn_cef:

                Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input = (InputData) intent.getSerializableExtra("input");

                // Testa se o editText e vazio
                if (TextUtils.isEmpty(editText_cef.getText().toString())) {
                    editText_cef.setError("O campo não pode ser vazio!");
                    return;
                }
                input.setInputData(7, Double.parseDouble(editText_cef.getText().toString()) / 19.0);

                Intent intent1 = new Intent(this, DfrActivity.class); // criando a nova intent que aponta para DfrActivity
                intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
                startActivity(intent1);
                break;
            case R.id.btn_cef_ant:
                Intent intent2 = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input1 = (InputData) intent2.getSerializableExtra("input");
                intent2 = new Intent(this, PfrActivity.class);
                intent2.putExtra("input", input1); // passando o obj para a intent que vai para CenActivity
                startActivity(intent2);
                break;

        }
    }
}
