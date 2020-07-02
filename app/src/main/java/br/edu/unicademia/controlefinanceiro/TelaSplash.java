package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TelaSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_splash);

        new Handler().postDelayed(new Runnable(){
             @Override
             public void run() {
                 Intent main = new Intent(TelaSplash.this, MainActivity.class);
                 startActivity(main);
             }
        }, 3000);
    }
}