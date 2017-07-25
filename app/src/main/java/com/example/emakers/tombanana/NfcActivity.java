package com.example.emakers.tombanana;

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
    TextView textView_nfc;
    EditText editText_nfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);

        btn_nfc = (Button) findViewById(R.id.btn_nfc);
        textView_nfc = (TextView) findViewById(R.id.textView_nfc);
        editText_nfc = (EditText) findViewById(R.id.editText_nfc);
        btn_nfc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_nfc.getText().toString())){
            editText_nfc.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(9, Double.parseDouble(editText_nfc.getText().toString()));

        Intent intent1 = new Intent(this, ResultActivity.class); // criando a nova intent que aponta para ResultActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
