package com.MBTI.myapplication.list.intj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.MBTI.myapplication.R;
import com.MBTI.myapplication.list.intj.intj1;

import java.util.List;
import java.util.ArrayList;

public class intj_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intj_list);

        ListView listView = findViewById(R.id.intj_list);

        List<String> list = new ArrayList<>();
        list.add("석굴암");
        list.add("불국사");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String data = (String) adapterView.getItemAtPosition(position);

                Intent intent;

                switch(position)
                {
                    case 0:
                        intent = new Intent(getApplicationContext(), intj1.class);
                        startActivity(intent);
                        break;
                }



            }
        });
    }
}