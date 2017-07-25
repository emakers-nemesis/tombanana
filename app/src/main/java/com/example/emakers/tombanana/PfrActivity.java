package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PfrActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pfr;
    TextView textView_pfr;
    EditText editText_pfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfr);

        btn_pfr = (Button) findViewById(R.id.btn_pfr);
        textView_pfr = (TextView) findViewById(R.id.textView_pfr);
        editText_pfr = (EditText) findViewById(R.id.editText_pfr);
        btn_pfr.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");
        input.setInputData(6, Double.parseDouble(editText_pfr.getText().toString()));

        Intent intent1 = new Intent(this, CefActivity.class); // criando a nova intent que aponta para CefActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}