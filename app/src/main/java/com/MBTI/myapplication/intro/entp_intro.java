package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entj.entj_list;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.weather.enfj_weather;
import com.MBTI.myapplication.weather.entp_weather;

public class entp_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_entp_intro);

        Button btn_entp_list = (Button)findViewById(R.id.btn_entp_list);
        btn_entp_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entp_list.class);
                startActivity(intent);
            }
        });

        Button btn_entp_weather = (Button)findViewById(R.id.btn_entp_weather);
        btn_entp_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), entp_weather.class);
                startActivity(intent);
            }
        });
    }
}