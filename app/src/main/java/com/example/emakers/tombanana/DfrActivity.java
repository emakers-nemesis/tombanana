package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DfrActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_dfr;
    TextView textView_dfr;
    EditText editText_dfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfr);

        btn_dfr = (Button) findViewById(R.id.btn_dfr);
        textView_dfr = (TextView) findViewById(R.id.textView_dfr);
        editText_dfr = (EditText) findViewById(R.id.editText_dfr);
        btn_dfr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_dfr.getText().toString())){
            editText_dfr.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(8, Double.parseDouble(editText_dfr.getText().toString()));

        Intent intent1 = new Intent(this, NfcActivity.class); // criando a nova intent que aponta para NfcActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
