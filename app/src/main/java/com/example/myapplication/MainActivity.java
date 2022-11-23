package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RelativeLayout;

import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    ViewGroup.LayoutParams params;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)findViewById(R.id.button1);
        final MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.mine );
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
                mediaPlayer.start();


            }
        });
    } public void  openActivity2(){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);

    }
}
