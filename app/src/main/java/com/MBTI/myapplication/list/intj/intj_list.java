package com.MBTI.myapplication.list.intj;

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

public class intj_list extends AppCompatActivity {

    // 추가
//    String myJSON;
//
//    public static final String TAG_RESULTS="result";
//    public static final String TAG_0="0";
//    public static final String TAG_1="1";
//    public static final String TAG_2="2";
//
//    JSONArray peoples=null;
//
//    ArrayList<HashMap<String,String>> personList;
    ListView listView;

    // 끝
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intj_list);

        String page = "http://59.15.92.92/PHP_connection.php";
        URLConnector task = new URLConnector(page);

        task.start();

        try{
            task.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("X");

        }
        int t1 = 0;
        String t2 = null;

        String result = task.getResult();
        try{
            JSONObject root = new JSONObject(result);
            JSONArray ja = root.getJSONArray("result");


            for (int i = 0; i < ja.length(); i++)
            {
                JSONObject jo = ja.getJSONObject(i);
                t1 = jo.getInt("1");
                t2 = jo.getString("2");
            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }


        System.out.println("MBTI : " + t1 + ", name : " + t2);


//        System.out.println(result);
        listView = findViewById(R.id.intj_list);





        // 추가

//        personList = new ArrayList<HashMap<String,String>>();
//        getData("http://59.15.92.92/PHP_connection.php");


        List<String> list = new ArrayList<>();
        list.add(t2);
//        list.add("불국사");
//
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

//        showList();




//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, personList[]);


//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
////                String data = (String) adapterView.getItemAtPosition(position);
//
//                Intent intent;
//
//                switch(position)
//                {
//                    case 0:
//                        intent = new Intent(getApplicationContext(), intj1.class);
//                        startActivity(intent);
//                        break;
//                }
//
//
//
//            }
//        });
    }

//    public void showList() {
//        try{
//            JSONObject jsonObj = new JSONObject(myJSON);
//            peoples = jsonObj.getJSONArray(TAG_RESULTS);
//
//            for (int i = 0; i < peoples.length(); i++)
//            {
//                JSONObject c = peoples.getJSONObject(i);
//                String temp1 = c.getString(TAG_0);
//                String temp2 = c.getString(TAG_1);
//                String temp3 = c.getString(TAG_2);
//
//                HashMap<String, String> persons = new HashMap<>();
//                persons.put(TAG_0, temp1);
//                persons.put(TAG_1, temp2);
//                persons.put(TAG_2, temp3);
//
//                personList.add(persons);
//
//            }
//        } catch (Exception e) {
//            return;
//        }
//
//        ListAdapter adapter = new SimpleAdapter(this, personList
//                , android.R.layout.simple_list_item_1, new String[]{TAG_0}, new int[]{R.id.intj_list});
//
//        listView.setAdapter(adapter);
//    }
//
//
//
//    private void getData(String url) {
//        class GetDataJSON extends AsyncTask<String, Void, String> {
//
//            @Override
//            public String doInBackground(String... params) {
//                String uri = params[0];
//
//                BufferedReader bufferedReader=null;
//                try{
//                    URL url=new URL(uri);
//                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
//                    StringBuilder sb = new StringBuilder();
//
//                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
//
//                    String json;
//                    while ((json = bufferedReader.readLine()) != null)
//                        sb.append(json+"\n");
//
//                    return sb.toString().trim();
//                } catch (Exception e) {
//                    return null;
//                }
//
//            }
//
//            @Override
//            public void onPostExecute(String result) {
//                myJSON = result;
//                showList();
//            }
//        }
//        GetDataJSON g = new GetDataJSON();
//        g.execute(url);
//    }
}