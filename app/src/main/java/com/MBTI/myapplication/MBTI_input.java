package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MBTI_input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_input);

        //INTJ 버튼 클릭시 테스트 화면 이동
        Button btn_intj = (Button)findViewById(R.id.btn_intj);
        btn_intj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), home.class);
                    startActivity(intent);
            }
        });





        //잘모르겠어요 버튼 클릭시 테스트 화면 이동
        Button btn_unknown = (Button)findViewById(R.id.btn_unknown);
        btn_unknown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), unknown.class);
                    startActivity(intent);
            }
        });


    }
}