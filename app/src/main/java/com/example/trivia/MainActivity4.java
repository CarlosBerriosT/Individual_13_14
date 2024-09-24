package com.example.trivia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        buttonBack = findViewById(R.id.buttonBack); // Asegúrate de que este ID coincida con el de tu botón en el layout

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a MainActivity2
                Intent intent = new Intent(MainActivity4.this, mainactivity2.class);
                startActivity(intent);
                finish(); // Opcional: finaliza la actividad actual
            }
        });
    }
}
