package com.example.cara_ou_coroa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button jogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.jogar);
        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int random = randomZeroOrOne();
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class); // Declarando intenção de navegação para a ResultadoActivity
                intent.putExtra("moeda", random); // Enviando valor da moeda para a ResultadoActivity
                startActivity(intent); // Navegando para a ResultadoActivity
            }
        });
    }


    /**
    * @return um int com o valor 0 ou 1
    * */
    public int randomZeroOrOne() {
        return new Random().nextInt(2); // número aleatório [0 ou 1]
    }

}