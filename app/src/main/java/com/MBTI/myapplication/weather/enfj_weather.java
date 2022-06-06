package com.MBTI.myapplication.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import com.MBTI.myapplication.R;

public class enfj_weather extends AppCompatActivity {

    String weather_data;
    TextView weather_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enfj_weather);

        weather_text = (TextView)findViewById(R.id.text2_enfj_weather);


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

        String rain_percent = null;
        String rain_form = null;
        String humidity = null;
        String sky = null;
        String min = null;
        String max = null;
        String wind = null;


        String serviceKey = "duHMQZOKZGzTIv5g53NZWvrm9Bk6wilKzrxDX4DJwKcusk4PB38LrjMur7o9fNzJzdJPtLsU9qgEegTekYUCjw==";
        String numOfRows = "200";
        String pageNo = "1";

        SimpleDateFormat real_time = new SimpleDateFormat("yyyyMMdd");
        LocalDate korea = LocalDate.now(ZoneId.of("Asia/Seoul"));
        String base_date = korea.format(DateTimeFormatter.BASIC_ISO_DATE);

        String base_time = "0200";
        String nx = "54";
        String ny = "38";

        String queryUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst?serviceKey="+serviceKey+
                "&numOfRows="+numOfRows+"&pageNo="+pageNo+"&base_date="+base_date+"&base_time="+base_time+"&nx="+nx+"&ny="+ny;
//        System.out.println(queryUrl);
        try {
            URL url= new URL(queryUrl);//문자열로 된 요청 url을 URL 객체로 생성.
            InputStream is= url.openStream(); //url위치로 입력스트림 연결

            XmlPullParserFactory factory= XmlPullParserFactory.newInstance();
            XmlPullParser xpp= factory.newPullParser();
            xpp.setInput( new InputStreamReader(is, "UTF-8") ); //inputstream 으로부터 xml 입력받기

            String tag;
            xpp.next();
            int eventType= xpp.getEventType();

            while(eventType != XmlPullParser.END_DOCUMENT){
                switch(eventType){
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        tag= xpp.getName();//태그 이름 얻어오기

                        if(tag.equals("item")) ; // 첫번째 검색결과
                        else if (tag.equals("category"))
                        {
                            xpp.next();

                            if (xpp.getText().equals("TMN"))
                            {
                                for (int n = 0; n < 9; n++)
                                    xpp.next();
                                min = xpp.getText();
                            }
                            else if (xpp.getText().equals("TMX"))
                            {
                                for (int n = 0; n < 9; n++)
                                    xpp.next();
                                max = xpp.getText();
                            }
                            else if (xpp.getText().equals("POP"))
                            {
                                for (int n = 0; n < 6; n++)
                                    xpp.next();
                                if (xpp.getText().equals("1400"))
                                {
                                    for (int n = 0; n < 3; n++)
                                        xpp.next();
                                    rain_percent = xpp.getText();
                                }
                            }
                            else if (xpp.getText().equals("PTY"))
                            {
                                for (int n = 0; n < 6; n++)
                                    xpp.next();
                                if (xpp.getText().equals("1400"))
                                {
                                    for (int n = 0; n < 3; n++)
                                        xpp.next();
                                    rain_form = xpp.getText();
                                }
                            }
                            else if (xpp.getText().equals("REH"))
                            {
                                for (int n = 0; n < 6; n++)
                                    xpp.next();
                                if (xpp.getText().equals("1400"))
                                {
                                    for (int n = 0; n < 3; n++)
                                        xpp.next();
                                    humidity = xpp.getText();
                                }
                            }
                            else if (xpp.getText().equals("SKY"))
                            {
                                for (int n = 0; n < 6; n++)
                                    xpp.next();
                                if (xpp.getText().equals("1400"))
                                {
                                    for (int n = 0; n < 3; n++)
                                        xpp.next();
                                    sky = xpp.getText();
                                }
                            }
                            else if (xpp.getText().equals("WSD"))
                            {
                                for (int n = 0; n < 6; n++)
                                    xpp.next();
                                if (xpp.getText().equals("1400"))
                                {
                                    for (int n = 0; n < 3; n++)
                                        xpp.next();
                                    wind = xpp.getText();
                                }
                            }

                        }

                    case XmlPullParser.TEXT:
                        break;
                }
                eventType= xpp.next();
            }

        } catch (Exception e) {
            // TODO Auto-generated catch blocke.printStackTrace();
        }

        if (sky == null || min == null || max == null || rain_percent == null || rain_form == null || humidity == null || wind == null)
        {
            buffer.append("기상청 홈페이지 오류\n잠시 후 다시 시도해주세요");
        }
        else {
            if (sky.equals("0") || sky.equals("1") || sky.equals("2") || sky.equals("3") || sky.equals("4") || sky.equals("5"))
                buffer.append("하늘 상태  :   " + "맑음" + "\n\n");
            else if (sky.equals("6") || sky.equals("7") || sky.equals("8"))
                buffer.append("하늘 상태  :   " + "구름 많음" + "\n\n");
            else if (sky.equals("9") || sky.equals("10"))
                buffer.append("하늘 상태  :   " + "흐림" + "\n\n");
            buffer.append("일 최저 기온  :   " + min + " 도\n\n");
            buffer.append("일 최고 기온  :   " + max + " 도\n\n");
            buffer.append("강수 확률  :   " + rain_percent + " %\n\n");

            if (rain_form.equals("0"))
                buffer.append("강수 형태  :   " + "없음" + "\n\n");
            else if (rain_form.equals("1"))
                buffer.append("강수 형태  :   " + "비" + "\n\n");
            else if (rain_form.equals("2"))
                buffer.append("강수 형태  :   " + "비+눈(진눈깨비)" + "\n\n");
            else if (rain_form.equals("3"))
                buffer.append("강수 형태  :   " + "눈" + "\n\n");
            else if (rain_form.equals("4"))
                buffer.append("강수 형태  :   " + "소나기" + "\n\n");
            else if (rain_form.equals("5"))
                buffer.append("강수 형태  :   " + "빗방울" + "\n\n");
            else if (rain_form.equals("6"))
                buffer.append("강수 형태  :   " + "빗방울+눈날림" + "\n\n");
            else if (rain_form.equals("7"))
                buffer.append("강수 형태  :   " + "눈날림" + "\n\n");

            buffer.append("습도  :   " + humidity + " %\n\n");
            buffer.append("풍속  :   " + wind + " m/s\n\n");
        }
        return buffer.toString();//StringBuffer 문자열 객체 반환
    }
}