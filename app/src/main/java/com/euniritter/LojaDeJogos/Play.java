package com.euniritter.LojaDeJogos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class Play extends AppCompatActivity {

    private ListaAdapter adapter;
    private JogoDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);
        CriaJogos criaJogos = new CriaJogos();
        criaJogos.criaJogosPlay();

        RecyclerView listaJogos = findViewById(R.id.recycle_view);

        dao = new JogoDAO();
        List<Jogo> todosJogos = dao.todos();
        listaJogos.setAdapter(new ListaAdapter(this, todosJogos));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listaJogos.setLayoutManager(layoutManager);


    }


}
