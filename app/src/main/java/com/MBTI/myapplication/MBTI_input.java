package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MBTI_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_mbti_input);

        //INTJ 버튼 클릭시 홈 화면으로 이동
        Button btn_intj = (Button)findViewById(R.id.btn_intj);
        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //INTJ = 0번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 0);
                startActivity(intent);
            }
        });

        //INTP 버튼 클릭시 홈 화면으로 이동
        Button btn_intp = (Button)findViewById(R.id.btn_intp);
        btn_intp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //INTP = 1번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 1);
                startActivity(intent);
            }
        });

        //ENTJ 버튼 클릭시 홈 화면으로 이동
        Button btn_entj = (Button)findViewById(R.id.btn_entj);
        btn_entj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ENTJ = 2번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 2);
                startActivity(intent);
            }
        });

        //ENTP 버튼 클릭시 홈 화면으로 이동
        Button btn_entp = (Button)findViewById(R.id.btn_entp);
        btn_entp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ENTP = 3번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 3);
                startActivity(intent);
            }
        });

        //INFJ 버튼 클릭시 홈 화면으로 이동
        Button btn_infj = (Button)findViewById(R.id.btn_infj);
        btn_infj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //INFJ = 4번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 4);
                startActivity(intent);
            }
        });

        //INFP 버튼 클릭시 홈 화면으로 이동
        Button btn_infp = (Button)findViewById(R.id.btn_infp);
        btn_infp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //INFP = 5번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 5);
                startActivity(intent);
            }
        });

        //ENFJ 버튼 클릭시 홈 화면으로 이동
        Button btn_enfj = (Button)findViewById(R.id.btn_enfj);
        btn_enfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ENFJ = 6번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 6);
                startActivity(intent);
            }
        });

        //ENFP 버튼 클릭시 홈 화면으로 이동
        Button btn_enfp = (Button)findViewById(R.id.btn_enfp);
        btn_enfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ENFP = 7번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 7);
                startActivity(intent);
            }
        });

        //ISTJ 버튼 클릭시 홈 화면으로 이동
        Button btn_istj = (Button)findViewById(R.id.btn_istj);
        btn_istj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ISTJ = 8번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 8);
                startActivity(intent);
            }
        });

        //ISTP 버튼 클릭시 홈 화면으로 이동
        Button btn_istp = (Button)findViewById(R.id.btn_istp);
        btn_istp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ISTP = 9번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 9);
                startActivity(intent);
            }
        });

        //ESTJ 버튼 클릭시 홈 화면으로 이동
        Button btn_estj = (Button)findViewById(R.id.btn_estj);
        btn_estj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ESTJ = 10번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 10);
                startActivity(intent);
            }
        });

        //ESTP 버튼 클릭시 홈 화면으로 이동
        Button btn_estp = (Button)findViewById(R.id.btn_estp);
        btn_estp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ESTP = 11번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 11);
                startActivity(intent);
            }
        });

        //ISFJ 버튼 클릭시 홈 화면으로 이동
        Button btn_isfj = (Button)findViewById(R.id.btn_isfj);
        btn_isfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ISFJ = 12번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 12);
                startActivity(intent);
            }
        });

        //ISFP 버튼 클릭시 홈 화면으로 이동
        Button btn_isfp = (Button)findViewById(R.id.btn_isfp);
        btn_isfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ISFP = 13번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 13);
                startActivity(intent);
            }
        });

        //ESFJ 버튼 클릭시 홈 화면으로 이동
        Button btn_esfj = (Button)findViewById(R.id.btn_esfj);
        btn_esfj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ESFJ = 14번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 14);
                startActivity(intent);
            }
        });

        //ESFP 버튼 클릭시 홈 화면으로 이동
        Button btn_esfp = (Button)findViewById(R.id.btn_esfp);
        btn_esfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ESFP = 15번
                Intent intent = new Intent(getApplicationContext(), home.class);
                //Home에다가 my_mbti로 id 전달
                intent.putExtra("my_mbti", 15);
                startActivity(intent);
            }
        });
    }
}