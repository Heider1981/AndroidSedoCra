package com.ejemplo.sedo_cra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity04 extends AppCompatActivity {

    private EditText nombres, apellidos, tipoDocumento, numDocumento, direccion, telefono, email, contraseña, confContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main04);

        nombres = findViewById(R.id.Nombres);
        apellidos = findViewById(R.id.Apellidos);
        tipoDocumento = findViewById(R.id.TipoDocumento);
        numDocumento = findViewById(R.id.NumDocumento);
        direccion = findViewById(R.id.Direccion);
        telefono = findViewById(R.id.Telefono);
        email = findViewById(R.id.Email);
        contraseña = findViewById(R.id.Contraseña);
        confContraseña = findViewById(R.id.ConfContraseña);
        Button enviar = findViewById(R.id.Enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra el mensaje "Registro Exitoso"
                Toast.makeText(MainActivity04.this, "Registro Exitoso", Toast.LENGTH_SHORT).show();

                // Limpia el formulario
                nombres.getText().clear();
                apellidos.getText().clear();
                tipoDocumento.getText().clear();
                numDocumento.getText().clear();
                direccion.getText().clear();
                telefono.getText().clear();
                email.getText().clear();
                contraseña.getText().clear();
                confContraseña.getText().clear();
            }
        });
    }
}
