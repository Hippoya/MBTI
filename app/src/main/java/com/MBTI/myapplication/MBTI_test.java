package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MBTI_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbti_test);

        Handler x = new Handler();
        x.postDelayed(new MBTI_test.SplashHandler(), 2000);
    }

    public class SplashHandler implements Runnable {
        public void run(){
            Intent intent = new Intent(getApplicationContext(),
                    what_mbti.class);
            startActivity(intent);
            finish();
        }
    }
}