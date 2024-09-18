package com.example.g7s21_ddim_activ_fabian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menor);
        TextView txtmenor = findViewById(R.id.txtmenor);
        Button btnmenor = findViewById(R.id.btnmenor);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            txtmenor.setText("Hola " + nombre + ". Eres menor de edad.");
        }
        btnmenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenorActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish(); // Finaliza esta actividad
            }
        });
    }

}