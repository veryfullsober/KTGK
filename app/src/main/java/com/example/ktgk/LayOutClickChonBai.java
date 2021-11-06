package com.example.ktgk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LayOutClickChonBai extends AppCompatActivity {
    Button bai1,bai2,bai3,bai4,bai5,bai6;
    Button chondephat;
    MediaPlayer music1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutclickchonbaii);
    Intent intent=getIntent();
    music1=MediaPlayer.create(this,R.raw.bainhac1);
    bai1=(Button) findViewById(R.id.baiso1);
    bai1.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {

          }

    });
    bai2=(Button) findViewById(R.id.baiso2);
    bai2.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }
    });
    bai3=(Button) findViewById(R.id.baiso3);
    bai3.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view){

        }
    });
    bai4=(Button) findViewById(R.id.baiso4);
    bai4.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view){

        }
    });
    bai5=(Button) findViewById(R.id.baiso5);
    bai5.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }
    });
    bai6=(Button) findViewById(R.id.baiso6);
    bai6.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }
    });
    chondephat=(Button) findViewById(R.id.chon);
    chondephat.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view){

        }
    });
    }
}
