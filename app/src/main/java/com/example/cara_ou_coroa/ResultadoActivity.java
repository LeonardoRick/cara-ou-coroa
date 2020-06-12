package com.example.cara_ou_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    Button voltar;
    ImageView imagemMoeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemMoeda = findViewById(R.id.imagemoeda);

        // Configurando o botão voltar para a MainActivity (Encerrando a activity atual
        Button voltar = findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Encerra a activity atual e exibe a anterior na pilha
            }
        });

        // Recuperando as informações da MainActivity
        Bundle data = getIntent().getExtras();
        int random = data.getInt("moeda");

        // Configurando exibição da imagem correta
        if(random == 0) { // cara
            imagemMoeda.setImageResource(R.drawable.moeda_cara);
        } else { // coroa
            imagemMoeda.setImageResource(R.drawable.moeda_coroa);
        }
    }
}