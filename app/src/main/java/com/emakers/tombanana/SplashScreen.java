package com.emakers.tombanana;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide(); // remove a aba e titulo da activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(this, 3000); // delay de 3 segundos
    }

    @Override
    public void run(){
        startActivity(new Intent(this, MainActivity.class)); // apos o delay chama a tela MainActivity
        finish();
    }
}
