package com.example.ajedrez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_juego);

        final Button btnEmpezar = findViewById(R.id.btnEmpezar);
        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToTablero();
            }
        });
    }

    private void goToTablero(){
        Intent intentTablero = new Intent(this,Tablero.class);
        startActivityForResult(intentTablero, 1);
    }

}
