package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NpcActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_npc;
    Button btn_npc_ant;
    TextView textView_npc;
    EditText editText_npc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc);

        btn_npc = (Button) findViewById(R.id.btn_npc);
        btn_npc_ant = (Button) findViewById(R.id.btn_npc_ant);
        textView_npc = (TextView) findViewById(R.id.textView_npc);
        editText_npc = (EditText) findViewById(R.id.editText_npc);
        btn_npc.setOnClickListener(this);
        btn_npc_ant.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btn_npc:
                Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input = (InputData) intent.getSerializableExtra("input");

                // Testa se o editText e vazio
                if (TextUtils.isEmpty(editText_npc.getText().toString())) {
                    editText_npc.setError("O campo não pode ser vazio!");
                    return;
                }
                input.setInputData(3, Double.parseDouble(editText_npc.getText().toString()) / 7.0);

                Intent intent1 = new Intent(this, NfrActivity.class); // criando a nova intent que aponta para NfrActivity
                intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
                startActivity(intent1);
                break;
            case R.id.btn_npc_ant:
                Intent intent2 = getIntent(); // recebendo a classe alterada em PraActivity
                InputData input1 = (InputData) intent2.getSerializableExtra("input");

                intent2 = new Intent(this, DenActivity.class);
                intent2.putExtra("input", input1); // passando o obj para a intent que vai para CenActivity
                startActivity(intent2);
        }
    }
}
