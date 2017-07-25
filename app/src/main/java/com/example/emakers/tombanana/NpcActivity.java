package com.example.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NpcActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_npc;
    TextView textView_npc;
    EditText editText_npc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc);

        btn_npc = (Button) findViewById(R.id.btn_npc);
        textView_npc = (TextView) findViewById(R.id.textView_npc);
        editText_npc = (EditText) findViewById(R.id.editText_npc);
        btn_npc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent = getIntent(); // recebendo a classe alterada em PraActivity
        InputData input = (InputData) intent.getSerializableExtra("input");
        input.setInputData(3, Double.parseDouble(editText_npc.getText().toString()));

        Intent intent1 = new Intent(this, NfrActivity.class); // criando a nova intent que aponta para NfrActivity
        intent1.putExtra("input", input); // passando o obj para a intent que vai para CenActivity
        startActivity(intent1);
    }
}
