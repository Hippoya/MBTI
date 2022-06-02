package com.MBTI.myapplication.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import com.MBTI.myapplication.R;

public class estj_weather extends AppCompatActivity {

    Timer timer;

    TextView weather_text;
    TextView home_text;
    String weather_data;
    String home_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weather_text = (TextView)findViewById(R.id.weather_text);

        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub

                // 아래 메소드를 호출하여 XML data를 파싱해서 String 객체로 얻어오기
                // 날씨 API
                weather_data= getWeatherXmlData();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        weather_text.setText(weather_data); //TextView에 문자열  data 출력
                    }
                });
            }
        }).start();
    }


    String getWeatherXmlData(){
        StringBuffer buffer=new StringBuffer();

        String serviceKey = "duHMQZOKZGzTIv5g53NZWvrm9Bk6wilKzrxDX4DJwKcusk4PB38LrjMur7o9fNzJzdJPtLsU9qgEegTekYUCjw==";
        String numOfRows = "7";
        String pageNo = "1";

        SimpleDateFormat real_time = new SimpleDateFormat("yyyyMMdd");
        Date time = new Date();
        String base_date = real_time.format(time);

        String base_time = "0500";
        String nx = "55";
        String ny = "127";

        String queryUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst?serviceKey="+serviceKey+
                "&numOfRows="+numOfRows+"&pageNo="+pageNo+"&base_date="+base_date+"&base_time="+base_time+"&nx="+nx+"&ny="+ny;

        try {
            URL url= new URL(queryUrl);//문자열로 된 요청 url을 URL 객체로 생성.
            InputStream is= url.openStream(); //url위치로 입력스트림 연결

            XmlPullParserFactory factory= XmlPullParserFactory.newInstance();
            XmlPullParser xpp= factory.newPullParser();
            xpp.setInput( new InputStreamReader(is, "UTF-8") ); //inputstream 으로부터 xml 입력받기

            String tag;
            int i =0;
            xpp.next();
            int eventType= xpp.getEventType();

            while(eventType != XmlPullParser.END_DOCUMENT){
                switch(eventType){
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        tag= xpp.getName();//태그 이름 얻어오기

                        if(tag.equals("item")) ; // 첫번째 검색결과
                        else if(tag.equals("fcstValue")) {
                            i++;
                            if (i == 1) {
                                buffer.append("강수확률 : ");
                                xpp.next();
                                buffer.append(xpp.getText()+"%");
                                buffer.append("\n");
                            }
                            if (i == 2) {
                                buffer.append("강수형태 : ");
                                xpp.next();
                                if(xpp.getText().equals("0")){
                                    buffer.append("없음");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("1")){
                                    buffer.append("비");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("2")){
                                    buffer.append("비+눈(진눈개비)");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("3")){
                                    buffer.append("눈");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("4")){
                                    buffer.append("소나기");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("5")){
                                    buffer.append("빗방울");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("6")){
                                    buffer.append("빗방울+눈날림");
                                    buffer.append("\n");
                                }
                                else if(xpp.getText().equals("7")){
                                    buffer.append("눈날림");
                                    buffer.append("\n");
                                }
                            }
                            if(i==3){
                                buffer.append("6시간 강수량 : ");
                                xpp.next();
                                buffer.append(xpp.getText()+"mm");
                                buffer.append("\n");
                            }
                            if(i==4){
                                buffer.append("습도 : ");
                                xpp.next();
                                buffer.append(xpp.getText()+"%");
                                buffer.append("\n");
                            }
                            if(i==5){
                                buffer.append("6시간 신적설 : ");
                                xpp.next();
                                buffer.append(xpp.getText()+"cm");
                                //   buffer.append("\n");
                            }
                            if(i==7){
                                buffer.append("3시간 기온 : ");
                                xpp.next();
                                buffer.append(xpp.getText()+"℃");
                                buffer.append("\n");
                            }
                        }
                        break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                        tag= xpp.getName(); //태그 이름 얻어오기
                        if(tag.equals("item")) buffer.append("\n");
                        break;
                }
                eventType= xpp.next();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch blocke.printStackTrace();
        }
        return buffer.toString();//StringBuffer 문자열 객체 반환
    }
}