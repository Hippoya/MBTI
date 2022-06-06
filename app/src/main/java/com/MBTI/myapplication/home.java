package com.MBTI.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
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
import com.MBTI.myapplication.weather.intj_weather;

public class home extends AppCompatActivity {

    //MBTI 이름, 이미지 변수 추가
    TextView mbti_name;
    ImageView mbti_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //상태바 제거
        setContentView(R.layout.activity_home);

        // 연습 시작
//        String test = "http://59.15.92.92/MediumServer/SelectAllPost.php";
//        URLConnector task = new URLConnector(test);
//
//        task.start();
//
//        try{
//            task.join();
//            System.out.println("waiting... for result");
//        }
//        catch(InterruptedException e){
//
//        }
//
//        String result = task.getResult();
//
//        System.out.println(result);


        // 끝

        //데이터 받아오기
        Intent intent = getIntent();
        int my_mbti = intent.getExtras().getInt("my_mbti");

        mbti_name = (TextView)findViewById(R.id.textView);
        mbti_image = (ImageView)findViewById(R.id.imageView);
        Typeface typeface = getResources().getFont(R.font.bmjua); //폰트 설정

        //mbti별 텍스트&이미지 동적 생성
        if(my_mbti == 0){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< INTJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.intj);
        }
        else if(my_mbti == 1){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< INTP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.intp);
        }
        else if(my_mbti == 2){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ENTJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.entj);
        }
        else if(my_mbti == 3){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ENTP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.entp);
        }
        else if(my_mbti == 4){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< INFJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.infj);
        }
        else if(my_mbti == 5){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< INFP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.infp);
        }
        else if(my_mbti == 6){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ENFJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.enfj);
        }
        else if(my_mbti == 7){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ENFP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.enfp);
        }
        else if(my_mbti == 8){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ISTJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.istj);
        }
        else if(my_mbti == 9){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ISTP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.istp);
        }
        else if(my_mbti == 10){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ESTJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.estj);
        }
        else if(my_mbti == 11){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ESTP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.estp);
        }
        else if(my_mbti == 12){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ISFJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.isfj);

        }
        else if(my_mbti == 13){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ISFP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.isfp);
        }
        else if(my_mbti == 14){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ESFJ >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.esfj);
        }
        else if(my_mbti == 15){
            mbti_name.setTypeface(typeface);
            mbti_name.setText("<< ESFP >>");
            mbti_name.setTextColor(Color.parseColor("#000000"));
            mbti_name.setTextSize(25);
            mbti_image.setImageResource(R.drawable.esfp);
        }

        //mbti 종류별 날씨
        Button btn_weather = (Button)findViewById(R.id.btn_weather);
        btn_weather.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(my_mbti == 0){ //INTJ
                    Intent intent = new Intent(getApplication(), intj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 1){ //INTP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.intp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 2) { //ENTJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.entj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 3) { //ENTP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.entp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 4) { //INFJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.infj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 5) { //INFP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.infp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 6) { //ENFJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.enfj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 7) { //ENFP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.enfp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 8) { //ISTJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.istj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 9) { //ISTP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.istp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 10) { //ESTJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.estj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 11) { //ESTP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.estp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 12) { //ISFJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.isfj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 13) { //ISFP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.isfp_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 14) { //ESFJ
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.esfj_weather.class);
                    startActivity(intent);
                }
                else if(my_mbti == 15) { //ESFP
                    Intent intent = new Intent(getApplication(), com.MBTI.myapplication.weather.esfp_weather.class);
                    startActivity(intent);
                }
            }
        });

        //mbti 종류별 데이터 간단하게 저장
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

        //모든 MBTI 버튼 클릭시
        Button btn_all_mbti = (Button)findViewById(R.id.btn_all_mbti);
        btn_all_mbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), all_mbti.class);
                startActivity(intent);
            }
        });

        //지도 버튼 클릭시
        Button btn_allmap = (Button)findViewById(R.id.btn_allmap);
        btn_allmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), all_map.class);
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