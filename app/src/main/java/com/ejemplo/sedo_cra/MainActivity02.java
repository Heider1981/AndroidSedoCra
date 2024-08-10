package com.ejemplo.sedo_cra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity02 extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextPassword;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        editTextUsuario = findViewById(R.id.Usuario);
        editTextPassword = findViewById(R.id.Password);
        buttonEnviar = findViewById(R.id.button);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String password = editTextPassword.getText().toString();

                // Verificación de credenciales
                if (verificarCredenciales(usuario, password)) {
                    // Credenciales correctas, redirigir a activity_main03
                    Intent intent = new Intent(MainActivity02.this, MainActivity09.class);
                    startActivity(intent);
                } else {
                    // Credenciales incorrectas, mostrar mensaje de error
                    Toast.makeText(MainActivity02.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean verificarCredenciales(String usuario, String password) {
        // Verificación de credenciales
        return "jedabc".equals(usuario) && "1234".equals(password);
    }
}

