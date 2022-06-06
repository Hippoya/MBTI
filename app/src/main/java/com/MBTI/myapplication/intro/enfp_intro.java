package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.enfj.enfj_list;
import com.MBTI.myapplication.list.enfp.enfp_list;
import com.MBTI.myapplication.weather.enfj_weather;
import com.MBTI.myapplication.weather.enfp_weather;

public class enfp_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_enfp_intro);

        Button btn_enfp_list = (Button)findViewById(R.id.btn_enfp_list);
        btn_enfp_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfp_list.class);
                startActivity(intent);
            }
        });

        Button btn_enfp_weather = (Button)findViewById(R.id.btn_enfp_weather);
        btn_enfp_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfp_weather.class);
                startActivity(intent);
            }
        });
    }
}