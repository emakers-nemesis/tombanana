package com.emakers.tombanana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    TextView TextView_result;
    TextView TextView_result1;
    Button btn_inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView_result = (TextView) findViewById(R.id.textView_result);
        TextView_result1 = (TextView) findViewById(R.id.textView_result1);
        btn_inicio = (Button) findViewById(R.id.btn_inicio);
        btn_inicio.setOnClickListener(this);

        Intent intent = getIntent(); // recebendo a classe alterada nas outras activits
        InputData input = (InputData) intent.getSerializableExtra("input");

        /* Cria nova RNA do tipo Multi-Layer Perceptron com 10 entradas, 10 neurônios na camada escondida e um neurônio de saída */
        MLP RNA = new MLP();

        Double result =  22 * RNA.calculate(input);

        /* Imprime o resultado da RNA para o vetor iData e desnormaliza a saída */
        TextView_result1.setText(Double.toString(result).format("%.3f", result));

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
