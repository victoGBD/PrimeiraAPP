package dicberner.victor.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // Declaração da classe MainActivity que estende AppCompatActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método onCreate que é chamado quando a atividade é criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Constroi elementos de interface definidos o arquivo xml

        Button btnEnviar = findViewById(R.id.btnEnviar); // Referencia o botão
        btnEnviar.setOnClickListener(new View.OnClickListener() { // Configura um listener de clique para o botão
            @Override
            public void onClick(View v) { // Método chamado quando o botão é clicado

                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); // Referencia o campo de texto pelo ID etDigiteAqui
                String textoDigitado = etDigiteAqui.getText().toString(); // Obtém o texto digitado no campo de texto

                Intent i = new Intent(MainActivity.this, NextActivity.class); // Cria um novo objeto Intent para iniciar NextActivity
                i.putExtra("texto", textoDigitado); // Adiciona o texto digitado como dado extra no Intent
                startActivity(i); // Inicia NextActivity com o Intent configurado
            }
        });
    }
}
