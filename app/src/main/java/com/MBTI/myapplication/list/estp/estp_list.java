package com.MBTI.myapplication.list.estp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.URLConnector;
import com.MBTI.myapplication.list.enfj.enfj1;
import com.MBTI.myapplication.list.enfj.enfj10;
import com.MBTI.myapplication.list.enfj.enfj2;
import com.MBTI.myapplication.list.enfj.enfj3;
import com.MBTI.myapplication.list.enfj.enfj4;
import com.MBTI.myapplication.list.enfj.enfj5;
import com.MBTI.myapplication.list.enfj.enfj6;
import com.MBTI.myapplication.list.enfj.enfj7;
import com.MBTI.myapplication.list.enfj.enfj8;
import com.MBTI.myapplication.list.enfj.enfj9;
import com.MBTI.myapplication.list.infp.infp1;
import com.MBTI.myapplication.list.infp.infp10;
import com.MBTI.myapplication.list.infp.infp2;
import com.MBTI.myapplication.list.infp.infp3;
import com.MBTI.myapplication.list.infp.infp4;
import com.MBTI.myapplication.list.infp.infp5;
import com.MBTI.myapplication.list.infp.infp6;
import com.MBTI.myapplication.list.infp.infp7;
import com.MBTI.myapplication.list.infp.infp8;
import com.MBTI.myapplication.list.infp.infp9;
import com.MBTI.myapplication.list.intj.intj1;
import com.MBTI.myapplication.list.intj.intj10;
import com.MBTI.myapplication.list.intj.intj2;
import com.MBTI.myapplication.list.intj.intj3;
import com.MBTI.myapplication.list.intj.intj4;
import com.MBTI.myapplication.list.intj.intj5;
import com.MBTI.myapplication.list.intj.intj6;
import com.MBTI.myapplication.list.intj.intj7;
import com.MBTI.myapplication.list.intj.intj8;
import com.MBTI.myapplication.list.intj.intj9;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class estp_list extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estp_list);
        String page = "http://59.15.74.148/estp.php";
        URLConnector task = new URLConnector(page);

        task.start();

        try {
            task.join();
        } catch (InterruptedException e) {
        }

        JSONObject jo = null;
        ArrayList<String> strArr = new ArrayList<>();

        String result = task.getResult();
        try {
            JSONObject root = new JSONObject(result);
            JSONArray ja = root.getJSONArray("result");


            for (int i = 0; i < ja.length(); i++) {
                jo = ja.getJSONObject(i);

                strArr.add(jo.getString("attraction_name"));
                strArr.add(jo.getString("image_address"));
                strArr.add(jo.getString("attraction_address"));
                strArr.add(jo.getString("attraction_explain"));
                strArr.add(jo.getString("attraction_page_address"));

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        listView = findViewById(R.id.estp_list);


        // 추가

        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArr.size(); i += 5) {
            list.add(strArr.get(i));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_font, list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), estp1.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), estp2.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), estp3.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), estp4.class);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), estp5.class);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), estp6.class);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), estp7.class);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), estp8.class);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), estp9.class);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), estp10.class);
                        break;
                }
                intent.putExtra("sVal", strArr);
                startActivity(intent);

            }
        });

    }
}