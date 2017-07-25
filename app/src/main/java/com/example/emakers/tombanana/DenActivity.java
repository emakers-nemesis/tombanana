package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DenActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_den;
    TextView textView_den;
    EditText editText_den;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_den);

        btn_den = (Button) findViewById(R.id.btn_den);
        textView_den = (TextView) findViewById(R.id.textView_den);
        editText_den = (EditText) findViewById(R.id.editText_den);
        btn_den.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");

        // Testa se o editText e vazio
        if(TextUtils.isEmpty(editText_den.getText().toString())){
            editText_den.setError("O campo não pode ser vazio!");
            return;
        }
        input.setInputData(2, Double.parseDouble(editText_den.getText().toString()));

        Intent intent1 = new Intent(this, NpcActivity.class); // criando a nova intent que aponta para NpcActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
