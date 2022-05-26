package com.MBTI.myapplication.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.enfj.enfj_list;
import com.MBTI.myapplication.list.enfp.enfp_list;

public class enfp_intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfp_intro);

        Button btn_enfp_list = (Button)findViewById(R.id.btn_enfp_list);
        btn_enfp_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), enfp_list.class);
                startActivity(intent);
            }
        });
    }
}