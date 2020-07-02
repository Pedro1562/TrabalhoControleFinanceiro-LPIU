package br.edu.unicademia.controlefinanceiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DescSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_simples);

        Button calcular = (Button) findViewById(R.id.btCalcularDesconto);
        calcular.setOnClickListener(calcularDesconto);
    }

    private View.OnClickListener calcularDesconto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent exibirResultado = new Intent(DescSimples.this, TelaResultado.class);
            EditText nominal = (EditText) findViewById(R.id.edValorNominal);
            EditText taxa = (EditText) findViewById(R.id.edTaxaDesconto);
            EditText tempo = (EditText) findViewById(R.id.edTempoDesconto);

            Double nominalDesconto = Double.parseDouble(nominal.getText().toString());
            Double taxaDesconto = Double.parseDouble(taxa.getText().toString());
            Double tempoDesconto = Double.parseDouble(tempo.getText().toString());
            double total = nominalDesconto * (taxaDesconto/100) * tempoDesconto;

            if(nominalDesconto == null || taxaDesconto== null || tempoDesconto == null){
                TextView erro = (TextView) findViewById(R.id.txtError);

                erro.setText("Digite todos os valores");
            }
            else {
                Bundle bundleDesconto = new Bundle();
                bundleDesconto.putString("total", String.valueOf(total));
                exibirResultado.putExtras(bundleDesconto);

                startActivity(exibirResultado);
            }
        }
    };
}
