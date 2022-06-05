package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.list.esfj.esfj_list;
import com.MBTI.myapplication.weather.enfj_weather;
import com.MBTI.myapplication.weather.esfj_weather;

public class esfj_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_esfj_intro);

        Button btn_esfj_list = (Button)findViewById(R.id.btn_esfj_list);
        btn_esfj_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfj_list.class);
                startActivity(intent);
            }
        });

        Button btn_esfj_weather = (Button)findViewById(R.id.btn_esfj_weather);
        btn_esfj_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfj_weather.class);
                startActivity(intent);
            }
        });
    }
}