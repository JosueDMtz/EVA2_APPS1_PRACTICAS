package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] datos = {
            "Chihuahua",
            "Parral",
            "Delicias",
            "Juárez",
            "Camargo",
            "Jiménez",
            "Casas Grandes",
            "Durango",
            "Hermosillo",
            "Obregón",
            "Mexicali",
            "Nogales",
            "Saltillo",
            "Torreón",
            "Piedras negras",
            "Monterrey",
            "Acuña",
            "Tampico",
            "Ciudad Victoria"
    };
    Intent intent;
    ListView lsVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsVwDatos = findViewById(R.id.lsVwDatos);
        intent = new Intent(this, DetailActivity.class);
        lsVwDatos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos));
        lsVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("CIUDAD ", datos[i]);
                bundle.putInt("POSICIÓN", i+1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}