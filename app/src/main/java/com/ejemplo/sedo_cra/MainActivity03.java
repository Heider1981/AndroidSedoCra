package com.ejemplo.sedo_cra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity03 extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextPassword;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        editTextUsuario = findViewById(R.id.DigUsuario);
        editTextPassword = findViewById(R.id.DigContraseña);
        buttonEnviar = findViewById(R.id.BtnEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String password = editTextPassword.getText().toString();

                // Verificación de credenciales
                if (verificarCredenciales(usuario, password)) {
                    // Credenciales correctas, redirigir a activity_main05
                    Intent intent = new Intent(MainActivity03.this, MainActivity05.class);
                    startActivity(intent);
                } else {
                    // Credenciales incorrectas, mostrar mensaje de error
                    Toast.makeText(MainActivity03.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean verificarCredenciales(String usuario, String password) {
        // Verificación de credenciales
        return "jedabc".equals(usuario) && "1234".equals(password);
    }
}
