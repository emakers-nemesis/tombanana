package com.example.emakers.tombanana;

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
    TextView textView_cef;
    EditText editText_cef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cef);

        btn_cef = (Button) findViewById(R.id.btn_cef);
        textView_cef = (TextView) findViewById(R.id.textView_cef);
        editText_cef = (EditText) findViewById(R.id.editText_cef);
        btn_cef.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_cef.getText().toString())){
            editText_cef.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(7, Double.parseDouble(editText_cef.getText().toString()));

        Intent intent1 = new Intent(this, DfrActivity.class); // criando a nova intent que aponta para DfrActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
