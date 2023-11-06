package com.example.recycle_mio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycle_mio.adapter.CazadorAdapter;
import com.example.recycle_mio.models.Cazador;
import com.example.recycle_mio.models.Espada;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        List<Cazador> cazadors = new ArrayList<>();
        cazadors.add(new Cazador("Tanjiro", "cazador", new Espada("Negra")));
        cazadors.add(new Cazador("Inosuke", "cazador", new Espada("Gris")));
        cazadors.add(new Cazador("Zenitsu", "cazador", new Espada("Amarilla")));
        cazadors.add(new Cazador("Kanao", "cazador", new Espada("Morada")));
        cazadors.add(new Cazador("Genya", "cazador", new Espada("Cafe")));
        cazadors.add(new Cazador("Gyomei", "pilar", new Espada("Negra")));
        cazadors.add(new Cazador("Sanemi", "pilar", new Espada("Verde")));
        cazadors.add(new Cazador("Obanai", "Pilar", new Espada("Gris")));

        CazadorAdapter caza = new CazadorAdapter(cazadors);
        RecyclerView rv = findViewById(R.id.rvcazador);
        rv.setAdapter(caza);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);
    }
}