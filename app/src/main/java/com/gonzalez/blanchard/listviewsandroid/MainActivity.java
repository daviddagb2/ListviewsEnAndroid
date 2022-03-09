package com.gonzalez.blanchard.listviewsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listview1;
    private ArrayList<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview1 = findViewById(R.id.listview1);

        nombres = new ArrayList<String>();
        nombres.add("Iron Man");
        nombres.add("Vision");
        nombres.add("Capitan America");
        nombres.add("Viuda Negra");
        nombres.add("Thor");
        nombres.add("Ojo de Halcon");
        nombres.add("Bruja Escarlata");
        nombres.add("Dr. Strange");

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, nombres);
        MyAdapter adapter = new MyAdapter(MainActivity.this, R.layout.list_item, nombres);
        listview1.setAdapter(adapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Has pulsado: " + nombres.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}