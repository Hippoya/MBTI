package com.MBTI.myapplication.list.intj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.MBTI.myapplication.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class intj9 extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intj9);
        int n = 40;

        Intent intent = getIntent();
        ArrayList<String> info = (ArrayList<String>)intent.getSerializableExtra("sVal");

        image = findViewById(R.id.image_intj9);

        new intj9.DownloadFilesTask().execute(info.get(1+n));

        TextView text0 = (TextView) findViewById(R.id.text_name_intj9);
        text0.setText(info.get(0+n));

        TextView text1 = (TextView) findViewById(R.id.text_address_intj9);
        text1.setText(info.get(2+n));

        TextView text2 = (TextView) findViewById(R.id.text_intj9);
        text2.setText(info.get(3+n));

        Button btn1 = (Button) findViewById(R.id.btn_intj9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = info.get(4+n);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    private class DownloadFilesTask extends AsyncTask<String,Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... strings) {
            Bitmap bmp = null;
            try {
                String img_url = strings[0]; //url of the image
                URL url = new URL(img_url);
                bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bmp;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


        @Override
        protected void onPostExecute(Bitmap result) {
            // doInBackground ?????? ????????? total ??? ?????? ??????
            image.setImageBitmap(result);
        }
    }
}