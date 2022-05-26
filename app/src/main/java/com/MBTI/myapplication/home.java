package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.MBTI.myapplication.intro.enfj_intro;
import com.MBTI.myapplication.intro.enfp_intro;
import com.MBTI.myapplication.intro.entj_intro;
import com.MBTI.myapplication.intro.entp_intro;
import com.MBTI.myapplication.intro.esfj_intro;
import com.MBTI.myapplication.intro.esfp_intro;
import com.MBTI.myapplication.intro.estj_intro;
import com.MBTI.myapplication.intro.estp_intro;
import com.MBTI.myapplication.intro.infj_intro;
import com.MBTI.myapplication.intro.infp_intro;
import com.MBTI.myapplication.intro.intj_intro;
import com.MBTI.myapplication.intro.intp_intro;
import com.MBTI.myapplication.intro.isfj_intro;
import com.MBTI.myapplication.intro.isfp_intro;
import com.MBTI.myapplication.intro.istj_intro;
import com.MBTI.myapplication.intro.istp_intro;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //데이터 받아오기
        Intent intent = getIntent();
        int my_mbti = intent.getExtras().getInt("my_mbti");

        Button btn_my_mbti = (Button)findViewById(R.id.btn_my_mbti);
        btn_my_mbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(my_mbti == 0){ //INTJ
                    Intent intent = new Intent(getApplicationContext(), intj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 1){ //INTP
                    Intent intent = new Intent(getApplicationContext(), intp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 2) { //ENTJ
                    Intent intent = new Intent(getApplicationContext(), entj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 3) { //ENTP
                    Intent intent = new Intent(getApplicationContext(), entp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 4) { //INFJ
                    Intent intent = new Intent(getApplicationContext(), infj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 5) { //INFP
                    Intent intent = new Intent(getApplicationContext(), infp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 6) { //ENFJ
                    Intent intent = new Intent(getApplicationContext(), enfj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 7) { //ENFP
                    Intent intent = new Intent(getApplicationContext(), enfp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 8) { //ISTJ
                    Intent intent = new Intent(getApplicationContext(), istj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 9) { //ISTP
                    Intent intent = new Intent(getApplicationContext(), istp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 10) { //ESTJ
                    Intent intent = new Intent(getApplicationContext(), estj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 11) { //ESTP
                    Intent intent = new Intent(getApplicationContext(), estp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 12) { //ISFJ
                    Intent intent = new Intent(getApplicationContext(), isfj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 13) { //ISFP
                    Intent intent = new Intent(getApplicationContext(), isfp_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 14) { //ESFJ
                    Intent intent = new Intent(getApplicationContext(), esfj_intro.class);
                    startActivity(intent);
                }
                else if(my_mbti == 15) { //ESFP
                    Intent intent = new Intent(getApplicationContext(), esfp_intro.class);
                    startActivity(intent);
                }
            }
        });

        //모든 MBTI 버튼 클릭시 테스트 화면 이동
        Button btn_all_mbti = (Button)findViewById(R.id.btn_all_mbti);
        btn_all_mbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), all_mbti.class);
                startActivity(intent);
            }
        });

    }

    // 홈 화면에서 뒤로 가기 버튼을 2초 이내에 2번 누르면 어플 종료
    private long backKeyPressedTime = 0;
    private Toast toast;

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast = Toast.makeText(this, "종료하시겠습니까?", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            toast.cancel();
            finishAffinity();
            System.runFinalization();
            System.exit(0);
        }
    }
}