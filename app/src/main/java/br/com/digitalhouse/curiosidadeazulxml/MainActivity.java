package br.com.digitalhouse.curiosidadeazulxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCuriosidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        btnCuriosidade = findViewById(R.id.btnCuriosidade);

        btnCuriosidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Um quarto pintado de azul garante melhor noite de sono, segundo estudos. Quarto de bebês pintados de azul também reduzem o choro e a atividade física em crianças.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
