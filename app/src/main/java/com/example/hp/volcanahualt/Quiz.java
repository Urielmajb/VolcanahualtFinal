package com.example.hp.volcanahualt;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hp.volcanahualt.R;

import org.w3c.dom.Text;


public class Quiz extends AppCompatActivity {

    private int currentQuestion;
    private String[] questions;
    private String[] answers;
    private Button answerButton;
    private Button NextQuestionButton;
    private TextView questionView;
    private TextView answerView;
    private EditText answerText;

    TextView question;
    TextView answer;
    TextView next;
    TextView res;
    TextView responder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        init();

        question = (TextView)findViewById(R.id.QuestionTextView);
        String font_path = "fonts/ComicNeueSansID.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        question.setTypeface(TF);

        answer = (TextView)findViewById(R.id.AnswerButton);
        String fontpath = "fonts/ComicNeueSansID.ttf";
        Typeface TFw = Typeface.createFromAsset(getAssets(),font_path);
        answer.setTypeface(TFw);

        next = (TextView)findViewById(R.id.NextQuetionButton);
        String font_pat = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),font_path);
        next.setTypeface(T);

        res = (TextView)findViewById(R.id.AnswerText);
        String font_pa = "fonts/ComicNeueSansID.ttf";
        Typeface Ta = Typeface.createFromAsset(getAssets(),font_path);
        res.setTypeface(Ta);

        responder = (TextView)findViewById(R.id.AnswerTextView);
        String font_p = "fonts/ComicNeueSansID.ttf";
        Typeface Tl = Typeface.createFromAsset(getAssets(),font_path);
        responder.setTypeface(Tl);
    }

    public void init(){
        questions = new String[]{"¿Cuantos volcanes tiene Nicaragua?","¿Cuantos volcanes estan activos en Nicaragua?", "¿Cuantos Volcanes estan Inactivos en Nicaragua?","¿Cual es el volcan mas alto de Nicaragua?"};
        answers = new String[]{"15","7","6","San Cristobal"};
        currentQuestion = -1;
        answerButton= (Button) findViewById(R.id.AnswerButton);
        NextQuestionButton = (Button) findViewById(R.id.NextQuetionButton);
        questionView = (TextView) findViewById(R.id.QuestionTextView);
        answerView = (TextView) findViewById(R.id.AnswerTextView);
        answerText= (EditText) findViewById(R.id.AnswerText);
        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });

        NextQuestionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showQuestion();
            }
        });
    }

    public void showQuestion() {
        currentQuestion++;
        if(currentQuestion == questions.length)
            currentQuestion =0;
        questionView.setText(questions[currentQuestion]);
        answerView.setText("");
        answerText.setText(""); }


    public boolean isCorrect(String answer) {
        return (answer.equalsIgnoreCase(answers[currentQuestion])); }

    /* public boolean isCorrect(String answer){
        return (answer.equalsIgnoreCase(answers[currentQuestion]));

    }*/

    public void checkAnswer() {
        String answer = answerText.getText().toString();
        if(isCorrect(answer))
            answerView.setText("Correcto");
        else
            answerView.setText("Lo siento, la respuesta es "+answers[currentQuestion]); }}
