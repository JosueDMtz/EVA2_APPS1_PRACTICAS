package com.example.eva2_3_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ACTION: EL OBJETO QUE LANZA LA NUEVA ACTIVIDAD
        //DATA: LA CLASE DE LA NUEVA ACTIVIDAD
        intent = new Intent(this, SecundaryActivity.class);
    }
    public void onClick(View v){
        startActivity(intent);
    }
}