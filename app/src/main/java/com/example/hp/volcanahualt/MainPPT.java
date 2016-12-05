package com.example.hp.volcanahualt;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by hp on 04/12/2016.
 */
public class MainPPT extends AppCompatActivity {


    Button b_rock, b_paper, b_scissor;
    ImageView iv_cpu, iv_me;


    String myChoise, cpuChoise, result;
    Random r;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppt);


        r = new Random();

        iv_cpu = (ImageView) findViewById(R.id.iv_cpu);
        iv_me =(ImageView) findViewById(R.id.iv_me);

        b_rock = (Button) findViewById(R.id.b_rock);
        b_paper = (Button) findViewById(R.id.b_paper);
        b_scissor = (Button) findViewById(R.id.b_scissors);

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoise = "rock";
                iv_me.setImageResource(R.drawable.rock);
                calculate();
            }
        });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoise = "paper";
                iv_me.setImageResource(R.drawable.paper);
                calculate();
            }
        });


        b_scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myChoise = "scissors";
                iv_me.setImageResource(R.drawable.scissors);
                calculate();
            }
        });


    }

    public void calculate(){
        int cpu = r.nextInt(3);
        if (cpu == 0){
            cpuChoise = "rock";
            iv_cpu.setImageResource(R.drawable.rock);
        } else if (cpu == 1){
            cpuChoise = "paper";
            iv_cpu.setImageResource(R.drawable.paper);
        } else if (cpu == 2){
            cpuChoise = "scissors";
            iv_cpu.setImageResource(R.drawable.scissors);
        }

        if (myChoise.equals("rock") && cpuChoise.equals("paper")){
            result = "Perdiste";
        } else
        if (myChoise.equals("rock") && cpuChoise.equals("scissors")){
            result = "Ganaste";
        } else
        if (myChoise.equals("paper") && cpuChoise.equals("rock")){
            result = "Ganaste";
        } else
        if (myChoise.equals("paper") && cpuChoise.equals("scissors")){
            result = "Perdiste";
        } else
        if (myChoise.equals("scissors") && cpuChoise.equals("paper")){
            result = "Ganaste";
        } else
        if (myChoise.equals("scissors") && cpuChoise.equals("rock")){
            result = "Perdiste";
        } else
        if (myChoise.equals("scissors") && cpuChoise.equals("scissors")){
            result = "Empate";
        } else
        if (myChoise.equals("paper") && cpuChoise.equals("paper")){
            result = "Empate";
        } else
        if (myChoise.equals("rock") && cpuChoise.equals("rock")){
            result = "Empate";
        }




        Toast.makeText(MainPPT.this, result, Toast.LENGTH_SHORT).show();





    }

    }
