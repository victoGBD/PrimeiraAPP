package dicberner.victor.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity { // Declaração da classe NextActivity que estende AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Método onCreate que é chamado quando a atividade é criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); // Obtém o Intent do começo
        String textoDigitado = i.getStringExtra("texto"); //Obtém o texto extra passado pelo Intent
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado);
    }
}
