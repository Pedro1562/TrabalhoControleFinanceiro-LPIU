package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btJuros1 = (Button) findViewById(R.id.btJurosSimples);
        btJuros1.setOnClickListener(avancarJurosSimples);

        Button jurosCompostos = (Button) findViewById(R.id.btJurosCompostos);
        jurosCompostos.setOnClickListener(avancarJurosCompostos);

        Button descontoSimples = (Button) findViewById(R.id.btDescontoSimples);
        descontoSimples.setOnClickListener(avancarDescontoSimples);
    }

    private View.OnClickListener avancarJurosSimples = new View.OnClickListener(){
        @Override
        public void onClick (View view) {
            Intent main = new Intent(MainActivity.this, JursSimples.class);
            startActivity(main);
        }
    };

    private View.OnClickListener avancarJurosCompostos = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent main = new Intent(MainActivity.this, JurosCompostos.class);
            startActivity(main);
        }
    };

    private View.OnClickListener avancarDescontoSimples = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent main = new Intent(MainActivity.this, DescSimples.class);
            startActivity(main);
        }
    };
}
