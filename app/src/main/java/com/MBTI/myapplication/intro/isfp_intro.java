package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.list.isfp.isfp_list;

public class isfp_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_isfp_intro);

        Button btn_isfp_list = (Button)findViewById(R.id.btn_isfp_list);
        btn_isfp_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), isfp_list.class);
                startActivity(intent);
            }
        });
    }
}