package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NfrActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_nfr;
    TextView textView_nfr;
    EditText editText_nfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfr);

        btn_nfr = (Button) findViewById(R.id.btn_nfr);
        textView_nfr = (TextView) findViewById(R.id.textView_nfr);
        editText_nfr = (EditText) findViewById(R.id.editText_nfr);
        btn_nfr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_nfr.getText().toString())){
            editText_nfr.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(4, Double.parseDouble(editText_nfr.getText().toString()));

        Intent intent1 = new Intent(this, PspActivity.class); // criando a nova intent que aponta para PspActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
