package com.euniritter.LojaDeJogos;

import android.app.Application;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.ArrayList;

import static com.euniritter.LojaDeJogos.JogoDAO.jogos;


public class CriaJogos extends Application {

    JogoDAO dao = new JogoDAO();

    @Override
    public Context getApplicationContext() {

        return super.getApplicationContext();

        EditText editText = editText.findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                 filter(s.toString());

            }
        });

    }
    private void filter(String texts) {
        ArrayList<Jogo> filteredList = new ArrayList<>();

        for (Jogo item : dao.todos()){
            if (item.getTitulo()){
                filteredList.add(item);
            }
        }
        jogos.filterlist(filteredList);
    }

    public void criaJogoNintendo () {

        dao.insereNintendo(new Jogo(1, R.drawable.
                nintendogopikachu, "Pokemon", " Go Pikachu", "R$ 100,00", "2020","nintendo"));
        dao.insereNintendo(new Jogo(2, R.drawable.
                nintendolegosuperviloes, "Lego ", "Super Viloes da DC", "R$ 110,00", "2010","nintendo"));
        dao.insereNintendo(new Jogo(3, R.drawable.
                nintendolegowords, "Lego ", "Words", "R$ 150,00", "2003","nintendo"));
        dao.insereNintendo(new Jogo(4, R.drawable.
                nintendomariokart8, "Mario ", "Kart 8", "R$ 80,00", "2008","nintendo"));
        dao.insereNintendo(new Jogo(5, R.drawable.
                nintendomariomaker2, "Mario", " Maker 2", "R$ 15,00", "2014","nintendo"));
        dao.insereNintendo(new Jogo(6, R.drawable.
                nintendomarioodisey, "Mario ", "Odisey", "R$ 10,00", "2010","nintendo"));
        dao.insereNintendo(new Jogo(7, R.drawable.
                nintendomariosonicolimpic, "Mario VS Sonic ", "Olimpic", "R$ 100,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(8, R.drawable.
                nintendopokemonpikachu, "Pokemon ", "Detetice Pikachus", "R$ 101,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(9, R.drawable.
                nintendomedium, "Medium", "M", "R$ 120,00", "2010","nintendo"));
        dao.insereNintendo(new Jogo(10, R.drawable.
                nintendoultrastreet, "Street Figther", "Ultra ", "R$ 15,00", "2003","nintendo"));
    }

    public void criaJogosPlay () {

        dao.inserePlay(new Jogo(1, R.drawable.
                playdetroid, "Detroid", "id", "R$ 110,00", "2000", "play"));
        dao.inserePlay(new Jogo(2, R.drawable.
                playassasinscreed, "Assassins Creed", "Assassins", "R$ 150,00", "2020", "play"));
        dao.inserePlay(new Jogo(3, R.drawable.
                playbattlefild4, "Battlefild 4", "Best", "R$ 180,00", "2020", "play"));
        dao.inserePlay(new Jogo(4, R.drawable.
                playdoom, "DOOM", "45", "R$ 10,00", "1999", "play"));
        dao.inserePlay(new Jogo(5, R.drawable.
                playhorizonzero, "Horizon Zero", "Forza", "R$ 100,00", "2018", "play"));
        dao.inserePlay(new Jogo(6, R.drawable.
                playinjustice2, "Injustice 2", "Prision", "R$ 200,00", "2020", "play"));
        dao.inserePlay(new Jogo(7, R.drawable.
                playmafia_3, "Mafia 3", "Ades", "R$ 100,00", "2017", "play"));
        dao.inserePlay(new Jogo(8, R.drawable.
                playspiderman, "Spider-man", "3", "R$ 110,00", "2020", "play"));
        dao.inserePlay(new Jogo(9, R.drawable.
                playtombraider, "Tomb Raider", "Lara", "R$ 200,00", "2014", "play"));
        dao.inserePlay(new Jogo(10, R.drawable.
                playuncharted4, "Uncharted 4", "500", "R$ 103,00", "2003", "play"));
    }

    public void criaJogoXbox () {

        dao.insereXbox(new Jogo(1, R.drawable.
                xboxassasinscreedorigens, "Assassins Creed ", "Origens", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(2, R.drawable.
                xboxfortnite, "Fortnite", "Origens", "R$ 110,00", "2020","nintendo"));
        dao.insereXbox(new Jogo(3, R.drawable.
                xboxforzahorizon4, "Forza Horizon", "4", "R$ 100,00", "2020","nintendo"));
        dao.insereXbox(new Jogo(4, R.drawable.
                xboxgears2, "Gears 2", "Fat", "R$ 20,00", "1995","nintendo"));
        dao.insereXbox(new Jogo(5, R.drawable.
                xboxgta5, "GTA 5", "Rio", "R$ 300,00", "2020","nintendo"));
        dao.insereXbox(new Jogo(6, R.drawable.
                xboxjustcause4, "Just Cause 4", "Injustice", "R$ 101,00", "2010","nintendo"));
        dao.insereXbox(new Jogo(7, R.drawable.
                xboxmortalkombat11, "Mortal Kombat ", "Mortal", "R$ 180,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(8, R.drawable.
                xboxosincriveis, "Os Incriveis", "TT", "R$ 150,00", "2020","nintendo"));
        dao.insereXbox(new Jogo(9, R.drawable.
                xboxpugb, "PUGB", "ks", "R$ 130,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(10, R.drawable.
                xboxwatchdogs2, "Watch Dogs 2", "DWatchs", "R$ 100,00", "2000","nintendo"));
    }

}