package com.euniritter.LojaDeJogos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JogoDAO{
    final static List<Jogo> jogos = new ArrayList<>();
    private static int contadorDeId = 1;

    public void salvar(Jogo jogo) {
        jogo.setId(contadorDeId);
        jogos.add(jogo);
        contadorDeId++;
    }
    public void insereNintendo(Jogo jogos){
        JogoDAO.jogos.addAll(Arrays.asList(jogos));
    }
    public void inserePlay(Jogo jogos){
        JogoDAO.jogos.addAll(Arrays.asList(jogos));
    }
    public void insereXbox(Jogo jogos){
        JogoDAO.jogos.addAll(Arrays.asList(jogos));
    }

    public List<Jogo> todos() {
        return new ArrayList<>(jogos);
    }
}