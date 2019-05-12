package com.example.tobiasschoch.tic;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends Activity implements OnClickListener {


    private TextView player1;
    private TextView player2;
    private TextView counter1;
    private TextView counter2;
    private TextView eins;
    private TextView zwei;
    private TextView drei;
    private TextView vier;
    private TextView fünf;
    private TextView sechs;
    private TextView sieben;
    private TextView acht;
    private TextView neun;
    private ImageView inc;

    int runde = 0;
    int modul = 0;
    int count1 = 0;
    int count2 = 0;
    int einfachso = 0;
    int streak1 = 0;
    int streak2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        counter1 = findViewById(R.id.counter1);
        counter2 = findViewById(R.id.counter2);
        eins = findViewById(R.id.eins);
        zwei = findViewById(R.id.zwei);
        drei = findViewById(R.id.drei);
        vier = findViewById(R.id.vier);
        fünf = findViewById(R.id.fünf);
        sechs = findViewById(R.id.sechs);
        sieben = findViewById(R.id.sieben);
        acht = findViewById(R.id.acht);
        neun = findViewById(R.id.neun);
        inc = findViewById(R.id.inc);

        eins.setOnClickListener(this);
        zwei.setOnClickListener(this);
        drei.setOnClickListener(this);
        vier.setOnClickListener(this);
        fünf.setOnClickListener(this);
        sechs.setOnClickListener(this);
        sieben.setOnClickListener(this);
        acht.setOnClickListener(this);
        neun.setOnClickListener(this);
        inc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        runde++;
        eins.setBackgroundColor(Color.parseColor("#cccccc"));
        zwei.setBackgroundColor(Color.parseColor("#cccccc"));
        drei.setBackgroundColor(Color.parseColor("#cccccc"));
        vier.setBackgroundColor(Color.parseColor("#cccccc"));
        fünf.setBackgroundColor(Color.parseColor("#cccccc"));
        sechs.setBackgroundColor(Color.parseColor("#cccccc"));
        sieben.setBackgroundColor(Color.parseColor("#cccccc"));
        acht.setBackgroundColor(Color.parseColor("#cccccc"));
        neun.setBackgroundColor(Color.parseColor("#cccccc"));
        modul = runde % 2;
        if (view == eins) {
            if (modul == 0 && eins.getText().toString() == "") {
                eins.setText("O");
            } else if (modul == 1 && eins.getText().toString() == "") {
                eins.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == zwei) {
            if (modul == 0 && zwei.getText().toString() == "") {
                zwei.setText("O");
            } else if (modul == 1 && zwei.getText().toString() == "") {
                zwei.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == drei) {
            if (modul == 0 && drei.getText().toString() == "") {
                drei.setText("O");
            } else if (modul == 1 && drei.getText().toString() == "") {
                drei.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == vier) {
            if (modul == 0 && vier.getText().toString() == "") {
                vier.setText("O");
            } else if (modul == 1 && vier.getText().toString() == "") {
                vier.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == fünf) {
            if (modul == 0 && fünf.getText().toString() == "") {
                fünf.setText("O");
            } else if (modul == 1 && fünf.getText().toString() == "") {
                fünf.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == sechs) {
            if (modul == 0 && sechs.getText().toString() == "") {
                sechs.setText("O");
            } else if (modul == 1 && sechs.getText().toString() == "") {
                sechs.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == sieben) {
            if (modul == 0 && sieben.getText().toString() == "") {
                sieben.setText("O");
            } else if (modul == 1 && sieben.getText().toString() == "") {
                sieben.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == acht) {
            if (modul == 0 && acht.getText().toString() == "") {
                acht.setText("O");
            } else if (modul == 1 && acht.getText().toString() == "") {
                acht.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == neun) {
            if (modul == 0 && neun.getText().toString() == "") {
                neun.setText("O");
            } else if (modul == 1 && neun.getText().toString() == "") {
                neun.setText("X");
            } else {
                runde = runde -  1;
            }
        } else if (view == inc) {
            einfachso = 0;
        }

        if ((eins.getText().toString() == "X" && zwei.getText().toString() == "X" && drei.getText().toString() == "X")
                || (vier.getText().toString() == "X" && fünf.getText().toString() == "X" && sechs.getText().toString() == "X")
                || (sieben.getText().toString() == "X" && acht.getText().toString() == "X" && neun.getText().toString() == "X")
                || (eins.getText().toString() == "X" && vier.getText().toString() == "X" && sieben.getText().toString() == "X")
                || (zwei.getText().toString() == "X" && fünf.getText().toString() == "X" && acht.getText().toString() == "X")
                || (drei.getText().toString() == "X" && sechs.getText().toString() == "X" && neun.getText().toString() == "X")
                || (eins.getText().toString() == "X" && fünf.getText().toString() == "X" && neun.getText().toString() == "X")
                || (drei.getText().toString() == "X" && fünf.getText().toString() == "X" && sieben.getText().toString() == "X")) {
            if (eins.getText().toString() == "X" && zwei.getText().toString() == "X" && drei.getText().toString() == "X") {
                eins.setBackgroundColor(Color.parseColor("#97B7E2"));
                zwei.setBackgroundColor(Color.parseColor("#97B7E2"));
                drei.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (vier.getText().toString() == "X" && fünf.getText().toString() == "X" && sechs.getText().toString() == "X") {
                vier.setBackgroundColor(Color.parseColor("#97B7E2"));
                fünf.setBackgroundColor(Color.parseColor("#97B7E2"));
                sechs.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (sieben.getText().toString() == "X" && acht.getText().toString() == "X" && neun.getText().toString() == "X") {
                sieben.setBackgroundColor(Color.parseColor("#97B7E2"));
                acht.setBackgroundColor(Color.parseColor("#97B7E2"));
                neun.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (eins.getText().toString() == "X" && vier.getText().toString() == "X" && sieben.getText().toString() == "X") {
                eins.setBackgroundColor(Color.parseColor("#97B7E2"));
                vier.setBackgroundColor(Color.parseColor("#97B7E2"));
                sieben.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (zwei.getText().toString() == "X" && fünf.getText().toString() == "X" && acht.getText().toString() == "X") {
                zwei.setBackgroundColor(Color.parseColor("#97B7E2"));
                fünf.setBackgroundColor(Color.parseColor("#97B7E2"));
                acht.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (drei.getText().toString() == "X" && sechs.getText().toString() == "X" && neun.getText().toString() == "X") {
                drei.setBackgroundColor(Color.parseColor("#97B7E2"));
                sechs.setBackgroundColor(Color.parseColor("#97B7E2"));
                neun.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (eins.getText().toString() == "X" && fünf.getText().toString() == "X" && neun.getText().toString() == "X") {
                eins.setBackgroundColor(Color.parseColor("#97B7E2"));
                fünf.setBackgroundColor(Color.parseColor("#97B7E2"));
                neun.setBackgroundColor(Color.parseColor("#97B7E2"));
            } else if (drei.getText().toString() == "X" && fünf.getText().toString() == "X" && sieben.getText().toString() == "X") {
                drei.setBackgroundColor(Color.parseColor("#97B7E2"));
                fünf.setBackgroundColor(Color.parseColor("#97B7E2"));
                sieben.setBackgroundColor(Color.parseColor("#97B7E2"));
            }
            eins.setText("");
            zwei.setText("");
            drei.setText("");
            vier.setText("");
            fünf.setText("");
            sechs.setText("");
            sieben.setText("");
            acht.setText("");
            neun.setText("");
            streak1++;
            streak2 = 0;
            count1++;
            counter1.setText(count1 + "        ▲" + streak1);
            counter2.setText(count2 + "");
        } else if ((eins.getText().toString() == "O" && zwei.getText().toString() == "O" && drei.getText().toString() == "O")
                || (vier.getText().toString() == "O" && fünf.getText().toString() == "O" && sechs.getText().toString() == "O")
                || (sieben.getText().toString() == "O" && acht.getText().toString() == "O" && neun.getText().toString() == "O")
                || (eins.getText().toString() == "O" && vier.getText().toString() == "O" && sieben.getText().toString() == "O")
                || (zwei.getText().toString() == "O" && fünf.getText().toString() == "O" && acht.getText().toString() == "O")
                || (drei.getText().toString() == "O" && sechs.getText().toString() == "O" && neun.getText().toString() == "O")
                || (eins.getText().toString() == "O" && fünf.getText().toString() == "O" && neun.getText().toString() == "O")
                || (drei.getText().toString() == "O" && fünf.getText().toString() == "O" && sieben.getText().toString() == "O")) {
            if (eins.getText().toString() == "O" && zwei.getText().toString() == "O" && drei.getText().toString() == "O") {
                eins.setBackgroundColor(Color.parseColor("#F6C2C9"));
                zwei.setBackgroundColor(Color.parseColor("#F6C2C9"));
                drei.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (vier.getText().toString() == "O" && fünf.getText().toString() == "O" && sechs.getText().toString() == "O") {
                vier.setBackgroundColor(Color.parseColor("#F6C2C9"));
                fünf.setBackgroundColor(Color.parseColor("#F6C2C9"));
                sechs.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (sieben.getText().toString() == "O" && acht.getText().toString() == "O" && neun.getText().toString() == "O") {
                sieben.setBackgroundColor(Color.parseColor("#F6C2C9"));
                acht.setBackgroundColor(Color.parseColor("#F6C2C9"));
                neun.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (eins.getText().toString() == "O" && vier.getText().toString() == "O" && sieben.getText().toString() == "O") {
                eins.setBackgroundColor(Color.parseColor("#F6C2C9"));
                vier.setBackgroundColor(Color.parseColor("#F6C2C9"));
                sieben.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (zwei.getText().toString() == "O" && fünf.getText().toString() == "O" && acht.getText().toString() == "O") {
                zwei.setBackgroundColor(Color.parseColor("#F6C2C9"));
                fünf.setBackgroundColor(Color.parseColor("#F6C2C9"));
                acht.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (drei.getText().toString() == "O" && sechs.getText().toString() == "O" && neun.getText().toString() == "O") {
                drei.setBackgroundColor(Color.parseColor("#F6C2C9"));
                sechs.setBackgroundColor(Color.parseColor("#F6C2C9"));
                neun.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (eins.getText().toString() == "O" && fünf.getText().toString() == "O" && neun.getText().toString() == "O") {
                eins.setBackgroundColor(Color.parseColor("#F6C2C9"));
                fünf.setBackgroundColor(Color.parseColor("#F6C2C9"));
                neun.setBackgroundColor(Color.parseColor("#F6C2C9"));
            } else if (drei.getText().toString() == "O" && fünf.getText().toString() == "O" && sieben.getText().toString() == "O") {
                drei.setBackgroundColor(Color.parseColor("#F6C2C9"));
                fünf.setBackgroundColor(Color.parseColor("#F6C2C9"));
                sieben.setBackgroundColor(Color.parseColor("#F6C2C9"));
            }


            eins.setText("");
            zwei.setText("");
            drei.setText("");
            vier.setText("");
            fünf.setText("");
            sechs.setText("");
            sieben.setText("");
            acht.setText("");
            neun.setText("");
            streak2++;
            streak1 = 0;
            count2++;
            counter2.setText(count2 + "        ▲" + streak2);
            counter1.setText(count1 + "");
        } else if ((eins.getText().toString() != "") &&
                (zwei.getText().toString() != "") &&
                (drei.getText().toString() != "") &&
                (vier.getText().toString() != "") &&
                (fünf.getText().toString() != "") &&
                (sechs.getText().toString() != "") &&
                (sieben.getText().toString() != "") &&
                (acht.getText().toString() != "") &&
                (neun.getText().toString() != "")) {
            eins.setText("");
            zwei.setText("");
            drei.setText("");
            vier.setText("");
            fünf.setText("");
            sechs.setText("");
            sieben.setText("");
            acht.setText("");
            neun.setText("");
        }
    }
}