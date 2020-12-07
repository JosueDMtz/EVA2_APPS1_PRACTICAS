package com.example.eva2_2_sendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTxtTelefono, editTxtMensaje;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtTelefono = findViewById(R.id.editTxtTelefono);
        editTxtMensaje = findViewById(R.id.editTxtMensaje);
    }
    //CREAR INTENTO Y LANZAR ACTIVIDAD
    public void onClick(View v){
        String sTel = "smsto: " + editTxtTelefono.getText().toString();
        String sMensaje = editTxtTelefono.getText().toString();
        intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        intent.putExtra("sms_body", sMensaje);
        startActivity(intent);
    }
}