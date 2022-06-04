package com.MBTI.myapplication.list.entp;

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

public class entp_list extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entp_list);
        String page = "http://59.15.74.148/entp.php";
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

        listView = findViewById(R.id.entp_list);


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
                        intent = new Intent(getApplicationContext(), entp1.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), entp2.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), entp3.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), entp4.class);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), entp5.class);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), entp6.class);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), entp7.class);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), entp8.class);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), entp9.class);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), entp10.class);
                        break;
                }
                intent.putExtra("sVal", strArr);
                startActivity(intent);

            }
        });

    }
}