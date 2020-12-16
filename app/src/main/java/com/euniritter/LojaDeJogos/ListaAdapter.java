package com.euniritter.LojaDeJogos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter{
    private final List<Jogo> jogos;
    private final Context context;


    public ListaAdapter(Context context, List<Jogo> jogos) {
        this.context = context;
        this.jogos = jogos;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_jogo, parent, false);
        return new NotaViewHolder(viewCriada);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        Jogo jogo = jogos.get(position);
        TextView titulo = holder.itemView.findViewById(R.id.item_teste);
        titulo.setText(jogo.getTitulo());
        TextView descricao = holder.itemView.findViewById(R.id.item_descricao);
        descricao.setText(jogo.getDescricao());
        TextView ano = holder.itemView.findViewById(R.id.item_ano);
        ano.setText(jogo.getAno());
        TextView valor = holder.itemView.findViewById(R.id.item_valor);
        valor.setText(jogo.getValor());
        ImageView imagem = holder.itemView.findViewById(R.id.imagem_teste);
        imagem.setImageResource(jogo.getImagemId());

    }

    public int getItemCount() {
        return jogos.size();
    }

    class NotaViewHolder extends RecyclerView.ViewHolder{
        public NotaViewHolder(View itemView) {
            super(itemView);
        }
    }
    public void atualiza(List<Jogo> jogos){
        this.jogos.clear();
        this.jogos.addAll(jogos);
        notifyDataSetChanged();
    }
public void filterList(ArrayList<Jogo> filteredList){
    dao = filteredList;
    notifyDataSetChanged();
}
}
