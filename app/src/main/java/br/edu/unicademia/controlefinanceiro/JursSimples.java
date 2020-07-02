package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JursSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_simples);

        Button calcular = (Button) findViewById(R.id.btCalcularSimples);
        calcular.setOnClickListener(calcularSimples);

    }
    private View.OnClickListener calcularSimples = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        Intent exibirResultado = new Intent(JursSimples.this, TelaResultado.class);
        EditText capital = (EditText) findViewById(R.id.edCapitalSimples);
        EditText taxa = (EditText) findViewById(R.id.edTaxaJuros);
        EditText tempo = (EditText) findViewById(R.id.edTempoSimples);

        Double capitalJuros = Double.parseDouble(capital.getText().toString());
        Double taxaJuros = Double.parseDouble(taxa.getText().toString());
        Double tempoJuros = Double.parseDouble(tempo.getText().toString());
        double total = capitalJuros * (taxaJuros/100) * tempoJuros;

        Bundle bundleJurosSimples = new Bundle();
        bundleJurosSimples.putString("total", String.valueOf(total));
        exibirResultado.putExtras(bundleJurosSimples);
        startActivity(exibirResultado);

        }
    };
}
