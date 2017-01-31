package com.example.alex.mysnackfab;

import android.net.sip.SipAudioCall;
import android.support.annotation.StringRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //HEMOS ARRASTRADO EL ICONO EN LA CARPETA RESOURCES, HEMOS CREADO EL ADAPTER Y HEMOS CREADO LA VISTA MEDIANTE EL XML DE TIPO FRAMELAYOUT
        //CREANDO UN LISTVIREW Y UN WIDGET E IMPORTANDO LA LIBRERIA EN EL GRADLE DE SUPPORT DESIGN
        String[] array = new String[]{
                "elemento 1",
                "elemento 2",
                "elemento 3",
                "elemento 4",
                "elemento 5",
                "elemento 6",
                "elemento 7",
                "elemento 8",
                "elemento 9",
                "elemento 10",

        };

        ListAdapter listAdapter = new ArrayAdapter<String>(this, R.layout.fila, array);

        ListView listView = (ListView) findViewById(R.id.lista_cadenas);
        listView.setAdapter(listAdapter);

        ListenerFAB a = new ListenerFAB();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(a);
    }
}
