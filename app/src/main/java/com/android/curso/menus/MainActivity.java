package com.android.curso.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button opciones = (Button) findViewById(R.id.menu_opciones);
        Button contextual1 = (Button) findViewById(R.id.menu_contextual1);
        Button contextual2 = (Button) findViewById(R.id.menu_contextual2);
        Button emergente = (Button) findViewById(R.id.menu_emergente);

        opciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,OpcionesActivity.class);
                startActivity(intent);
            }
        });

        contextual1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Contextual1Activity.class);
                startActivity(intent);
            }
        });

        contextual2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Contextual2Activity.class);
                startActivity(intent);
            }
        });

        emergente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EmergenteActivity.class);
                startActivity(intent);
            }
        });
    }
}
