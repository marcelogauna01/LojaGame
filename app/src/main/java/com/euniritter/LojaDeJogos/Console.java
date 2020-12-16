package com.euniritter.LojaDeJogos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Console extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console);

    }

    public void irnintendo (View view) { startActivity(new Intent(this, Nintendo.class));}
    public void irplay (View view) { startActivity(new Intent(this, Play.class));}
    public void irxbox (View view) { startActivity(new Intent(this, Xbox.class));}

}
