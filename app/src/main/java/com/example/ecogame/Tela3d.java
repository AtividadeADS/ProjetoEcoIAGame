package com.example.ecogame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3d extends AppCompatActivity {

    private Button botaoContinuar2;
    private Button buttonVoltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela3d);

        //Navegaçãp
        botaoContinuar2 = findViewById(R.id.buttonGo2);

        botaoContinuar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3d.this, Tela3e.class);
                startActivity(in);
            }
        });

        buttonVoltar3 = findViewById(R.id.buttonBack3);

        buttonVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Tela3d.this, Tela3.class);
                startActivity(in);
            }
        });
    }
}