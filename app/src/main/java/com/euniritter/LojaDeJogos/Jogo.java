package com.euniritter.LojaDeJogos;

import java.io.Serializable;

public class Jogo  implements Serializable {
    private int id = 0;
    private int imagemId;
    private String titulo;
    private String descricao;
    private String valor;
    private String ano;
    private String console;

    public Jogo(int id, int imagemId, String titulo, String descricao, String valor, String ano, String console) {
        this.id = id;
        this.imagemId = imagemId;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.ano = ano;
        this.console = console;
    }


    public int getImagemId() { return imagemId;}

    public String getTitulo() { return titulo;}

    public String getDescricao() { return descricao;}

    public String getValor() { return valor;}

    public String getAno() { return ano;}

    public String getConsole() {return console;}

    public void setId(int id) { this.id = id;}

    public int getId() {return id;}

    public boolean temIdValido() { return id > 0;}



}
