package com.example.emakers.tombanana;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PraActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_pra;
    TextView text_pra;
    EditText editText_pra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pra);

        //achando elementos que estao no xml
        btn_pra = (Button) findViewById(R.id.btn_pra);
        text_pra = (TextView) findViewById(R.id.text_pra);
        editText_pra = (EditText) findViewById(R.id.editText_pra);

        btn_pra.setOnClickListener(this); // ativando o evento do botao
    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this, CenActivity.class); // criando a nova intent que aponta para CenActivity

        Bananeira bananeira = new Bananeira(); // instanciando bananeira

        //Tratamento de execeçao para quando o usuario digitar algo errado
        try {
            bananeira.setPra(Float.parseFloat(editText_pra.getText().toString())); // pegando o valor do texto e passando para a classe
        }catch(NumberFormatException e){
            AlertDialog.Builder showAlert = new AlertDialog.Builder(this);
            showAlert.setTitle("Error").setMessage("Digite somente numeros!")
                     .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                         @Override
                         public void onClick(DialogInterface dialogInterface, int i) {

                         }
                     });
            showAlert.create();
            showAlert.show();
        }
        intent.putExtra("bananeira", bananeira); // passando o obj para a intent que vai para CenActivity

        startActivity(intent); // pula pra CenActivity


    }

}
