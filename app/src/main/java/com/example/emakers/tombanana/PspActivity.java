package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PspActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_psp;
    TextView textView_psp;
    EditText editText_psp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psp);

        btn_psp = (Button) findViewById(R.id.btn_psp);
        textView_psp = (TextView) findViewById(R.id.textView_psp);
        editText_psp = (EditText) findViewById(R.id.editText_psp);
        btn_psp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_psp.getText().toString())){
            editText_psp.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(5, Double.parseDouble(editText_psp.getText().toString()));

        Intent intent1 = new Intent(this, PfrActivity.class); // criando a nova intent que aponta para PfrActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
