package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.entp.entp_list;
import com.MBTI.myapplication.list.estj.estj_list;

public class estj_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estj_intro);

        Button btn_estj_list = (Button)findViewById(R.id.btn_estj_list);
        btn_estj_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), estj_list.class);
                startActivity(intent);
            }
        });
    }
}