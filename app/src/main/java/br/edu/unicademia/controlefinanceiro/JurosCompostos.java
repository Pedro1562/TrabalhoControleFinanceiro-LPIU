package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JurosCompostos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juros_compostos);

        Button calcular = (Button) findViewById(R.id.btCalcularComposto);
        calcular.setOnClickListener(calcularComposto);
    }

    private View.OnClickListener calcularComposto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent exibirResultado = new Intent(JurosCompostos.this, TelaResultado.class);
            EditText capital = (EditText) findViewById(R.id.edCapitalComposto);
            EditText taxa = (EditText) findViewById(R.id.edJurosComposto);
            EditText tempo = (EditText) findViewById(R.id.edTempoComposto);

            Double capitalJuros = Double.parseDouble(capital.getText().toString());
            Double taxaJuros = Double.parseDouble(taxa.getText().toString());
            Double tempoJuros = Double.parseDouble(tempo.getText().toString());
            double total = capitalJuros * Math.pow((1+ taxaJuros/100), tempoJuros);;


            Bundle bundleJurosCompostos = new Bundle();
            bundleJurosCompostos.putString("total", String.valueOf(total));
            exibirResultado.putExtras(bundleJurosCompostos);

            startActivity(exibirResultado);
        }
    };
}
