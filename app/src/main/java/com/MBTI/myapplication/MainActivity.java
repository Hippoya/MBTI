package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_main);

        Handler x = new Handler();
        x.postDelayed(new SplashHandler(), 2000);
    }

    public class SplashHandler implements Runnable {
        public void run(){
            Intent intent = new Intent(getApplicationContext(),
                    MBTI_input.class);
            startActivity(intent);
            finish();
        }
    }
}