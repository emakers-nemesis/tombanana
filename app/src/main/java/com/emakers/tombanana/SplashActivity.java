package com.emakers.tombanana;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by unclear on 11/01/18.
 */

public class SplashActivity extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Delay antes de chamar a InitialActivity
        Handler handler = new Handler();
        handler.postDelayed(this, 3000);

    }

    @Override
    public void run() {
        startActivity(new Intent(this, InitialActivity.class)); // apos o delay chama a tela MainActivity
        finish();
    }
}
