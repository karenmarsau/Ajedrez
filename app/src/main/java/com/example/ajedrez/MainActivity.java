package com.example.ajedrez;

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

        final Button btnJugar = findViewById(R.id.btnJugar);
        btnJugar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToOpcionesJuego();
            }
        });

        final Button btnAyuda = findViewById(R.id.btnAyuda);
        btnAyuda.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToReglas();
            }
        });

    }
    private void goToOpcionesJuego(){
        Intent intentOpciones = new Intent(this,OpcionesJuego.class);
        startActivityForResult(intentOpciones, 1);
    }

    private void goToReglas(){
        Intent intentReglas = new Intent(this,Reglas.class);
        startActivityForResult(intentReglas, 1);
    }

}
