package com.example.g7s21_ddim_activ_fabian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrincipalActivity extends AppCompatActivity {
    EditText txtnombre, txtedad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);


        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);

    }
    public void btnclick(View v){
        String nombre = txtnombre.getText().toString();
        String edadStr = txtedad.getText().toString();////CUANDO se obtiene el valor de un EditText se devuelve como una cadena String

        if (nombre.isEmpty() || edadStr.isEmpty()) { ////SI SE DEJAN LOS CAMPOS VACIOS APARARECE UNA NOTIFICACION (IS EMPTY)
            Toast.makeText(this, "Por favor, complete todos los campos.", Toast.LENGTH_SHORT).show();///MENSAJE QUE APARECE EN LA PANTALLA
            return;
        }

        int edad = Integer.parseInt(edadStr);////CONVIERTE LA CADENA EN UN ENTERO

        Intent intent;
        if (edad >= 18) {
            intent = new Intent(this, MayorActivity.class);
        } else {
            intent = new Intent(this, MenorActivity.class);
        }

        intent.putExtra("nombre", nombre);
        intent.putExtra("edad", edad);
        startActivity(intent);

    }

}