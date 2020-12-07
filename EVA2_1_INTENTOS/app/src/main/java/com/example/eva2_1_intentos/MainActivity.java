package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //URI --> UNIFORM RESOURCE IDENTIFICATOR
        //protocolo_identificador
        //URL --> UNIFORM RESOURCE LOCATOR
        //http://www.google.com
        String stel = "6144631321";
        //                          action      , data
        intent = new Intent(Intent.ACTION_DIAL, Uri.parse(stel)); //intento implicito
    }
    public void onClick(View v){
        startActivity(intent);
    }
}