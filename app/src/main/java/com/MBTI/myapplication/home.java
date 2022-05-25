package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //모든 MBTI 버튼 클릭시 테스트 화면 이동
        Button btn_all_mbti = (Button)findViewById(R.id.btn_all_mbti);
        btn_all_mbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), all_mbti.class);
                startActivity(intent);
            }
        });


    }
}