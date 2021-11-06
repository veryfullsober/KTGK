package com.example.ktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button chonbai;
    Button play;
    Button pause;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.bainhac1);

        chonbai = (Button) findViewById(R.id.chonbai);
        chonbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickchonbai(view);
            }
        });
    }
    public void musicplay(View view){
        music.start();
        }
    public void musicpause(View view){
    music.pause();}
    void clickchonbai(View view){
            Intent intent =new Intent(this,LayOutClickChonBai.class);
            startActivity(intent);

    }}
