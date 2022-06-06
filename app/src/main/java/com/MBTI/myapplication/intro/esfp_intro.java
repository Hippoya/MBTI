package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.list.esfp.esfp_list;
import com.MBTI.myapplication.weather.enfj_weather;
import com.MBTI.myapplication.weather.esfp_weather;

public class esfp_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_esfp_intro);

        Button btn_esfp_list = (Button)findViewById(R.id.btn_esfp_list);
        btn_esfp_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfp_list.class);
                startActivity(intent);
            }
        });

        Button btn_esfp_weather = (Button)findViewById(R.id.btn_esfp_weather);
        btn_esfp_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), esfp_weather.class);
                startActivity(intent);
            }
        });
    }
}