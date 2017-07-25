package com.example.emakers.tombanana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView TextView_result;
    TextView TextView_result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView_result = (TextView) findViewById(R.id.textView_result);
        TextView_result1 = (TextView) findViewById(R.id.textView_result1);

        /* Instancia objeto que cria vetor de entradas para a RNA, cada um dos 10 parâmetros é normalizado por uma constante */
        InputData iData =  new InputData(2.6/2.6, 77.0/77.0, 74.0/74.0, 7.0/7.0, 129.0/129.0, 4.2/4.2, 266.0/266.0, 19.0/19.0, 44.0/44.0, 12/12);

        /* Cria nova RNA do tipo Multi-Layer Perceptron com 10 entradas, 10 neurônios na camada escondida e um neurônio de saída */
        MLP RNA = new MLP();

        Double result =  22 * RNA.calculate(iData);

        /* Imprime o resultado da RNA para o vetor iData e desnormaliza a saída */
        TextView_result1.setText(Double.toString(result));


    }
}
