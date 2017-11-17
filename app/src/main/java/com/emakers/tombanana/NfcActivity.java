package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NfcActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_nfc;
    Button btn_nfc_ant;
    TextView textView_nfc;
    EditText editText_nfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);

        btn_nfc = (Button) findViewById(R.id.btn_nfc);
        btn_nfc_ant = (Button) findViewById(R.id.btn_nfc_ant);
        textView_nfc = (TextView) findViewById(R.id.textView_nfc);
        editText_nfc = (EditText) findViewById(R.id.editText_nfc);
        btn_nfc.setOnClickListener(this);
        btn_nfc_ant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {

            case R.id.btn_nfc:
                Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input = (InputData) intent.getSerializableExtra("input");

                // Testa se o editText e vazio
                if (TextUtils.isEmpty(editText_nfc.getText().toString())) {
                    editText_nfc.setError("O campo não pode ser vazio!");
                    return;
                }
                input.setInputData(9, Double.parseDouble(editText_nfc.getText().toString()) / 12.0);

                Intent intent1 = new Intent(this, ResultActivity.class); // criando a nova intent que aponta para ResultActivity
                intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
                startActivity(intent1);
                break;
            case R.id.btn_nfc_ant:
                Intent intent2 = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input1 = (InputData) intent2.getSerializableExtra("input");
                intent2 = new Intent(this, DfrActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
