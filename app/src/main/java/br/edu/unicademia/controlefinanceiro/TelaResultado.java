package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resultado);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        TextView resultado = (TextView) findViewById(R.id.txtResultado);

        resultado.setText(bundle.getString("total"));

    }
}
