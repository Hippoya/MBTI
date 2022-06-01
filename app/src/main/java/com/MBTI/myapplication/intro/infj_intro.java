package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.list.infj.infj_list;

public class infj_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_infj_intro);

        Button btn_infj_list = (Button)findViewById(R.id.btn_infj_list);
        btn_infj_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), infj_list.class);
                startActivity(intent);
            }
        });
    }
}