package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.enfj.enfj_list;
import com.MBTI.myapplication.weather.enfj_weather;

public class enfj_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_enfj_intro);

        Button btn_enfj_list = (Button)findViewById(R.id.btn_enfj_list);
        btn_enfj_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfj_list.class);
                startActivity(intent);
            }
        });

        Button btn_enfj_weather = (Button)findViewById(R.id.btn_enfj_weather);
        btn_enfj_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfj_weather.class);
                startActivity(intent);
            }
        });
    }
}
