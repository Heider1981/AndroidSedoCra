package com.ejemplo.sedo_cra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonAdministrador;
    private Button buttonEmpleados;
    private Button buttonClientes;
    private ImageView imgRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdministrador = findViewById(R.id.buttonAdministrador);
        buttonEmpleados = findViewById(R.id.buttonEmpleados);
        buttonClientes = findViewById(R.id.buttonClientes);
        imgRegistrarse = findViewById(R.id.imgRegistrarse);

        buttonAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity03.class);
                startActivity(intent);
            }
        });

        buttonEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity03.class);
                startActivity(intent);
            }
        });

        buttonClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity02.class);
                startActivity(intent);
            }
        });

        imgRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity04.class);
                startActivity(intent);
            }
        });
    }
}
