package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class all_mbti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_mbti);

        //INTJ 버튼
        Button btn_intj = (Button)findViewById(R.id.btn_intj);
        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), intj_intro.class);
                startActivity(intent);
            }
        });

        //INTP 버튼
        Button btn_intp = (Button)findViewById(R.id.btn_intp);
        btn_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), intp_intro.class);
                startActivity(intent);
            }
        });

        //ENTJ 버튼
        Button btn_entj = (Button)findViewById(R.id.btn_entj);
        btn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entj_intro.class);
                startActivity(intent);
            }
        });

        //ENTP 버튼
        Button btn_entp = (Button)findViewById(R.id.btn_entp);
        btn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entp_intro.class);
                startActivity(intent);
            }
        });

        //INFJ 버튼
        Button btn_infj = (Button)findViewById(R.id.btn_infj);
        btn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), infj_intro.class);
                startActivity(intent);
            }
        });

        //INFP 버튼
        Button btn_infp = (Button)findViewById(R.id.btn_infp);
        btn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), infp_intro.class);
                startActivity(intent);
            }
        });

        //ENFJ 버튼
        Button btn_enfj = (Button)findViewById(R.id.btn_enfj);
        btn_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfj_intro.class);
                startActivity(intent);
            }
        });

        //ENFP 버튼
        Button btn_enfp = (Button)findViewById(R.id.btn_enfp);
        btn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfp_intro.class);
                startActivity(intent);
            }
        });

        //ISTJ 버튼
        Button btn_istj = (Button)findViewById(R.id.btn_istj);
        btn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), istj_intro.class);
                startActivity(intent);
            }
        });

        //ISTP 버튼
        Button btn_istp = (Button)findViewById(R.id.btn_istp);
        btn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), istp_intro.class);
                startActivity(intent);
            }
        });

        //ESTJ 버튼
        Button btn_estj = (Button)findViewById(R.id.btn_estj);
        btn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), estj_intro.class);
                startActivity(intent);
            }
        });

        //ESTP 버튼
        Button btn_estp = (Button)findViewById(R.id.btn_estp);
        btn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), estp_intro.class);
                startActivity(intent);
            }
        });

        //ISFJ 버튼
        Button btn_isfj = (Button)findViewById(R.id.btn_isfj);
        btn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), isfj_intro.class);
                startActivity(intent);
            }
        });

        //ISFP 버튼
        Button btn_isfp = (Button)findViewById(R.id.btn_isfp);
        btn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), isfp_intro.class);
                startActivity(intent);
            }
        });

        //ESFJ 버튼
        Button btn_esfj = (Button)findViewById(R.id.btn_esfj);
        btn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfj_intro.class);
                startActivity(intent);
            }
        });

        //ESFP 버튼
        Button btn_esfp = (Button)findViewById(R.id.btn_esfp);
        btn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfp_intro.class);
                startActivity(intent);
            }
        });
    }
}