package com.MBTI.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

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
import com.MBTI.myapplication.list.enfp.enfp1;
import com.MBTI.myapplication.list.enfp.enfp10;
import com.MBTI.myapplication.list.enfp.enfp2;
import com.MBTI.myapplication.list.enfp.enfp3;
import com.MBTI.myapplication.list.enfp.enfp4;
import com.MBTI.myapplication.list.enfp.enfp5;
import com.MBTI.myapplication.list.enfp.enfp6;
import com.MBTI.myapplication.list.enfp.enfp7;
import com.MBTI.myapplication.list.enfp.enfp8;
import com.MBTI.myapplication.list.enfp.enfp9;
import com.MBTI.myapplication.list.entj.entj1;
import com.MBTI.myapplication.list.entj.entj10;
import com.MBTI.myapplication.list.entj.entj2;
import com.MBTI.myapplication.list.entj.entj3;
import com.MBTI.myapplication.list.entj.entj4;
import com.MBTI.myapplication.list.entj.entj5;
import com.MBTI.myapplication.list.entj.entj6;
import com.MBTI.myapplication.list.entj.entj7;
import com.MBTI.myapplication.list.entj.entj8;
import com.MBTI.myapplication.list.entj.entj9;
import com.MBTI.myapplication.list.entp.entp1;
import com.MBTI.myapplication.list.entp.entp10;
import com.MBTI.myapplication.list.entp.entp2;
import com.MBTI.myapplication.list.entp.entp3;
import com.MBTI.myapplication.list.entp.entp4;
import com.MBTI.myapplication.list.entp.entp5;
import com.MBTI.myapplication.list.entp.entp6;
import com.MBTI.myapplication.list.entp.entp7;
import com.MBTI.myapplication.list.entp.entp8;
import com.MBTI.myapplication.list.entp.entp9;
import com.MBTI.myapplication.list.esfj.esfj1;
import com.MBTI.myapplication.list.esfj.esfj10;
import com.MBTI.myapplication.list.esfj.esfj2;
import com.MBTI.myapplication.list.esfj.esfj3;
import com.MBTI.myapplication.list.esfj.esfj4;
import com.MBTI.myapplication.list.esfj.esfj5;
import com.MBTI.myapplication.list.esfj.esfj6;
import com.MBTI.myapplication.list.esfj.esfj7;
import com.MBTI.myapplication.list.esfj.esfj8;
import com.MBTI.myapplication.list.esfj.esfj9;
import com.MBTI.myapplication.list.esfp.esfp1;
import com.MBTI.myapplication.list.esfp.esfp10;
import com.MBTI.myapplication.list.esfp.esfp2;
import com.MBTI.myapplication.list.esfp.esfp3;
import com.MBTI.myapplication.list.esfp.esfp4;
import com.MBTI.myapplication.list.esfp.esfp5;
import com.MBTI.myapplication.list.esfp.esfp6;
import com.MBTI.myapplication.list.esfp.esfp7;
import com.MBTI.myapplication.list.esfp.esfp8;
import com.MBTI.myapplication.list.esfp.esfp9;
import com.MBTI.myapplication.list.estj.estj1;
import com.MBTI.myapplication.list.estj.estj10;
import com.MBTI.myapplication.list.estj.estj11;
import com.MBTI.myapplication.list.estj.estj2;
import com.MBTI.myapplication.list.estj.estj3;
import com.MBTI.myapplication.list.estj.estj4;
import com.MBTI.myapplication.list.estj.estj5;
import com.MBTI.myapplication.list.estj.estj6;
import com.MBTI.myapplication.list.estj.estj7;
import com.MBTI.myapplication.list.estj.estj8;
import com.MBTI.myapplication.list.estj.estj9;
import com.MBTI.myapplication.list.estp.estp1;
import com.MBTI.myapplication.list.estp.estp10;
import com.MBTI.myapplication.list.estp.estp2;
import com.MBTI.myapplication.list.estp.estp3;
import com.MBTI.myapplication.list.estp.estp4;
import com.MBTI.myapplication.list.estp.estp5;
import com.MBTI.myapplication.list.estp.estp6;
import com.MBTI.myapplication.list.estp.estp7;
import com.MBTI.myapplication.list.estp.estp8;
import com.MBTI.myapplication.list.estp.estp9;
import com.MBTI.myapplication.list.infj.infj1;
import com.MBTI.myapplication.list.infj.infj10;
import com.MBTI.myapplication.list.infj.infj2;
import com.MBTI.myapplication.list.infj.infj3;
import com.MBTI.myapplication.list.infj.infj4;
import com.MBTI.myapplication.list.infj.infj5;
import com.MBTI.myapplication.list.infj.infj6;
import com.MBTI.myapplication.list.infj.infj7;
import com.MBTI.myapplication.list.infj.infj8;
import com.MBTI.myapplication.list.infj.infj9;
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
import com.MBTI.myapplication.list.intp.intp1;
import com.MBTI.myapplication.list.intp.intp10;
import com.MBTI.myapplication.list.intp.intp2;
import com.MBTI.myapplication.list.intp.intp3;
import com.MBTI.myapplication.list.intp.intp4;
import com.MBTI.myapplication.list.intp.intp5;
import com.MBTI.myapplication.list.intp.intp6;
import com.MBTI.myapplication.list.intp.intp7;
import com.MBTI.myapplication.list.intp.intp8;
import com.MBTI.myapplication.list.intp.intp9;
import com.MBTI.myapplication.list.isfj.isfj1;
import com.MBTI.myapplication.list.isfj.isfj10;
import com.MBTI.myapplication.list.isfj.isfj2;
import com.MBTI.myapplication.list.isfj.isfj3;
import com.MBTI.myapplication.list.isfj.isfj4;
import com.MBTI.myapplication.list.isfj.isfj5;
import com.MBTI.myapplication.list.isfj.isfj6;
import com.MBTI.myapplication.list.isfj.isfj7;
import com.MBTI.myapplication.list.isfj.isfj8;
import com.MBTI.myapplication.list.isfj.isfj9;
import com.MBTI.myapplication.list.isfp.isfp1;
import com.MBTI.myapplication.list.isfp.isfp10;
import com.MBTI.myapplication.list.isfp.isfp2;
import com.MBTI.myapplication.list.isfp.isfp3;
import com.MBTI.myapplication.list.isfp.isfp4;
import com.MBTI.myapplication.list.isfp.isfp5;
import com.MBTI.myapplication.list.isfp.isfp6;
import com.MBTI.myapplication.list.isfp.isfp7;
import com.MBTI.myapplication.list.isfp.isfp8;
import com.MBTI.myapplication.list.isfp.isfp9;
import com.MBTI.myapplication.list.istj.istj1;
import com.MBTI.myapplication.list.istj.istj10;
import com.MBTI.myapplication.list.istj.istj2;
import com.MBTI.myapplication.list.istj.istj3;
import com.MBTI.myapplication.list.istj.istj4;
import com.MBTI.myapplication.list.istj.istj5;
import com.MBTI.myapplication.list.istj.istj6;
import com.MBTI.myapplication.list.istj.istj7;
import com.MBTI.myapplication.list.istj.istj8;
import com.MBTI.myapplication.list.istj.istj9;
import com.MBTI.myapplication.list.istp.istp1;
import com.MBTI.myapplication.list.istp.istp10;
import com.MBTI.myapplication.list.istp.istp2;
import com.MBTI.myapplication.list.istp.istp3;
import com.MBTI.myapplication.list.istp.istp4;
import com.MBTI.myapplication.list.istp.istp5;
import com.MBTI.myapplication.list.istp.istp6;
import com.MBTI.myapplication.list.istp.istp7;
import com.MBTI.myapplication.list.istp.istp8;
import com.MBTI.myapplication.list.istp.istp9;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.MBTI.myapplication.databinding.ActivityAllMapBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class all_map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityAllMapBinding binding;
    public ArrayList<Integer> type = new ArrayList<>();
    public ArrayList<String> name = new ArrayList<>();
    public ArrayList<String> address = new ArrayList<>();
    public ArrayList<Double> latitude = new ArrayList<>();
    public ArrayList<Double> longitude = new ArrayList<>();
    ArrayList<String> strArr0 = new ArrayList<>();
    ArrayList<String> strArr1 = new ArrayList<>();
    ArrayList<String> strArr2 = new ArrayList<>();
    ArrayList<String> strArr3 = new ArrayList<>();
    ArrayList<String> strArr4 = new ArrayList<>();
    ArrayList<String> strArr5 = new ArrayList<>();
    ArrayList<String> strArr6 = new ArrayList<>();
    ArrayList<String> strArr7 = new ArrayList<>();
    ArrayList<String> strArr8 = new ArrayList<>();
    ArrayList<String> strArr9 = new ArrayList<>();
    ArrayList<String> strArr10 = new ArrayList<>();
    ArrayList<String> strArr11 = new ArrayList<>();
    ArrayList<String> strArr12 = new ArrayList<>();
    ArrayList<String> strArr13 = new ArrayList<>();
    ArrayList<String> strArr14 = new ArrayList<>();
    ArrayList<String> strArr15 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAllMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        String page = "http://59.15.74.148/map.php";
        URLConnector task = new URLConnector(page);

        task.start();

        try{
            task.join();
        }
        catch(InterruptedException e)
        {
        }

        JSONObject jo = null;

        String result = task.getResult();
        try{
            JSONObject root = new JSONObject(result);
            JSONArray ja = root.getJSONArray("result");


            for (int i = 0; i < ja.length(); i++)
            {
                jo = ja.getJSONObject(i);
                if (jo.getInt("mbti_type") == 0)
                {
                    strArr0.add(jo.getString("attraction_name"));
                    strArr0.add(jo.getString("image_address"));
                    strArr0.add(jo.getString("attraction_address"));
                    strArr0.add(jo.getString("attraction_explain"));
                    strArr0.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 1)
                {
                    strArr1.add(jo.getString("attraction_name"));
                    strArr1.add(jo.getString("image_address"));
                    strArr1.add(jo.getString("attraction_address"));
                    strArr1.add(jo.getString("attraction_explain"));
                    strArr1.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 2)
                {
                    strArr2.add(jo.getString("attraction_name"));
                    strArr2.add(jo.getString("image_address"));
                    strArr2.add(jo.getString("attraction_address"));
                    strArr2.add(jo.getString("attraction_explain"));
                    strArr2.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 3)
                {
                    strArr3.add(jo.getString("attraction_name"));
                    strArr3.add(jo.getString("image_address"));
                    strArr3.add(jo.getString("attraction_address"));
                    strArr3.add(jo.getString("attraction_explain"));
                    strArr3.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 4)
                {
                    strArr4.add(jo.getString("attraction_name"));
                    strArr4.add(jo.getString("image_address"));
                    strArr4.add(jo.getString("attraction_address"));
                    strArr4.add(jo.getString("attraction_explain"));
                    strArr4.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 5)
                {
                    strArr5.add(jo.getString("attraction_name"));
                    strArr5.add(jo.getString("image_address"));
                    strArr5.add(jo.getString("attraction_address"));
                    strArr5.add(jo.getString("attraction_explain"));
                    strArr5.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 6)
                {
                    strArr6.add(jo.getString("attraction_name"));
                    strArr6.add(jo.getString("image_address"));
                    strArr6.add(jo.getString("attraction_address"));
                    strArr6.add(jo.getString("attraction_explain"));
                    strArr6.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 7)
                {
                    strArr7.add(jo.getString("attraction_name"));
                    strArr7.add(jo.getString("image_address"));
                    strArr7.add(jo.getString("attraction_address"));
                    strArr7.add(jo.getString("attraction_explain"));
                    strArr7.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 8)
                {
                    strArr8.add(jo.getString("attraction_name"));
                    strArr8.add(jo.getString("image_address"));
                    strArr8.add(jo.getString("attraction_address"));
                    strArr8.add(jo.getString("attraction_explain"));
                    strArr8.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 9)
                {
                    strArr9.add(jo.getString("attraction_name"));
                    strArr9.add(jo.getString("image_address"));
                    strArr9.add(jo.getString("attraction_address"));
                    strArr9.add(jo.getString("attraction_explain"));
                    strArr9.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 10)
                {
                    strArr10.add(jo.getString("attraction_name"));
                    strArr10.add(jo.getString("image_address"));
                    strArr10.add(jo.getString("attraction_address"));
                    strArr10.add(jo.getString("attraction_explain"));
                    strArr10.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 11)
                {
                    strArr11.add(jo.getString("attraction_name"));
                    strArr11.add(jo.getString("image_address"));
                    strArr11.add(jo.getString("attraction_address"));
                    strArr11.add(jo.getString("attraction_explain"));
                    strArr11.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 12)
                {
                    strArr12.add(jo.getString("attraction_name"));
                    strArr12.add(jo.getString("image_address"));
                    strArr12.add(jo.getString("attraction_address"));
                    strArr12.add(jo.getString("attraction_explain"));
                    strArr12.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 13)
                {
                    strArr13.add(jo.getString("attraction_name"));
                    strArr13.add(jo.getString("image_address"));
                    strArr13.add(jo.getString("attraction_address"));
                    strArr13.add(jo.getString("attraction_explain"));
                    strArr13.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 14)
                {
                    strArr14.add(jo.getString("attraction_name"));
                    strArr14.add(jo.getString("image_address"));
                    strArr14.add(jo.getString("attraction_address"));
                    strArr14.add(jo.getString("attraction_explain"));
                    strArr14.add(jo.getString("attraction_page_address"));
                }
                else if (jo.getInt("mbti_type") == 15)
                {
                    strArr15.add(jo.getString("attraction_name"));
                    strArr15.add(jo.getString("image_address"));
                    strArr15.add(jo.getString("attraction_address"));
                    strArr15.add(jo.getString("attraction_explain"));
                    strArr15.add(jo.getString("attraction_page_address"));
                }

                type.add(jo.getInt("mbti_type"));
                name.add(jo.getString("attraction_name"));
                address.add(jo.getString("attraction_address"));
                latitude.add(jo.getDouble("latitude"));
                longitude.add(jo.getDouble("longitude"));

            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }




    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng attractions = null;


        for (int i = 0; i < 161; i++)
        {
            attractions = new LatLng(latitude.get(i), longitude.get(i));
            mMap.addMarker(new MarkerOptions()
                    .position(attractions)
                    .title(name.get(i))
                    .snippet(address.get(i))
            );
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.5, 128), 6.5f));


        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(@NonNull Marker marker) {
                Intent intent = null;


                // INTJ 0 ~ 9
                if (marker.getId().equals("m0")) {
                    intent = new Intent(getApplicationContext(), intj1.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m1")) {
                    intent = new Intent(getApplicationContext(), intj2.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m2")){
                    intent = new Intent(getApplicationContext(), intj3.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m3")){
                    intent = new Intent(getApplicationContext(), intj4.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m4")){
                    intent = new Intent(getApplicationContext(), intj5.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m5")){
                    intent = new Intent(getApplicationContext(), intj6.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m6")){
                    intent = new Intent(getApplicationContext(), intj7.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m7")){
                    intent = new Intent(getApplicationContext(), intj8.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m8")){
                    intent = new Intent(getApplicationContext(), intj9.class);
                    intent.putExtra("sVal", strArr0);
                }
                if (marker.getId().equals("m9")){
                    intent = new Intent(getApplicationContext(), intj10.class);
                    intent.putExtra("sVal", strArr0);
                }

                // INTP 10 ~ 19
                if (marker.getId().equals("m10")){
                    intent = new Intent(getApplicationContext(), intp1.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m11")){
                    intent = new Intent(getApplicationContext(), intp2.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m12")){
                    intent = new Intent(getApplicationContext(), intp3.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m13")){
                    intent = new Intent(getApplicationContext(), intp4.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m14")){
                    intent = new Intent(getApplicationContext(), intp5.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m15")){
                    intent = new Intent(getApplicationContext(), intp6.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m16")){
                    intent = new Intent(getApplicationContext(), intp7.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m17")){
                    intent = new Intent(getApplicationContext(), intp8.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m18")){
                    intent = new Intent(getApplicationContext(), intp9.class);
                    intent.putExtra("sVal", strArr1);
                }
                if (marker.getId().equals("m19")){
                    intent = new Intent(getApplicationContext(), intp10.class);
                    intent.putExtra("sVal", strArr1);
                }

                // ENTJ 20 ~ 29
                if (marker.getId().equals("m20")){
                    intent = new Intent(getApplicationContext(), entj1.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m21")){
                    intent = new Intent(getApplicationContext(), entj2.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m22")){
                    intent = new Intent(getApplicationContext(), entj3.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m23")){
                    intent = new Intent(getApplicationContext(), entj4.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m24")){
                    intent = new Intent(getApplicationContext(), entj5.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m25")){
                    intent = new Intent(getApplicationContext(), entj6.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m26")){
                    intent = new Intent(getApplicationContext(), entj7.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m27")){
                    intent = new Intent(getApplicationContext(), entj8.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m28")){
                    intent = new Intent(getApplicationContext(), entj9.class);
                    intent.putExtra("sVal", strArr2);
                }
                if (marker.getId().equals("m29")){
                    intent = new Intent(getApplicationContext(), entj10.class);
                    intent.putExtra("sVal", strArr2);
                }

                // ENTP 30 ~ 39
                if (marker.getId().equals("m30")){
                    intent = new Intent(getApplicationContext(), entp1.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m31")){
                    intent = new Intent(getApplicationContext(), entp2.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m32")){
                    intent = new Intent(getApplicationContext(), entp3.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m33")){
                    intent = new Intent(getApplicationContext(), entp4.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m34")){
                    intent = new Intent(getApplicationContext(), entp5.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m35")){
                    intent = new Intent(getApplicationContext(), entp6.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m36")){
                    intent = new Intent(getApplicationContext(), entp7.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m37")){
                    intent = new Intent(getApplicationContext(), entp8.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m38")){
                    intent = new Intent(getApplicationContext(), entp9.class);
                    intent.putExtra("sVal", strArr3);
                }
                if (marker.getId().equals("m39")){
                    intent = new Intent(getApplicationContext(), entp10.class);
                    intent.putExtra("sVal", strArr3);
                }

                // INFJ 40 ~ 49
                if (marker.getId().equals("m40")){
                    intent = new Intent(getApplicationContext(), infj1.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m41")){
                    intent = new Intent(getApplicationContext(), infj2.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m42")){
                    intent = new Intent(getApplicationContext(), infj3.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m43")){
                    intent = new Intent(getApplicationContext(), infj4.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m44")){
                    intent = new Intent(getApplicationContext(), infj5.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m45")){
                    intent = new Intent(getApplicationContext(), infj6.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m46")){
                    intent = new Intent(getApplicationContext(), infj7.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m47")){
                    intent = new Intent(getApplicationContext(), infj8.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m48")){
                    intent = new Intent(getApplicationContext(), infj9.class);
                    intent.putExtra("sVal", strArr4);
                }
                if (marker.getId().equals("m49")){
                    intent = new Intent(getApplicationContext(), infj10.class);
                    intent.putExtra("sVal", strArr4);
                }

                // INFP 50 ~ 59
                if (marker.getId().equals("m50")){
                    intent = new Intent(getApplicationContext(), infp1.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m51")){
                    intent = new Intent(getApplicationContext(), infp2.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m52")){
                    intent = new Intent(getApplicationContext(), infp3.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m53")){
                    intent = new Intent(getApplicationContext(), infp4.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m54")){
                    intent = new Intent(getApplicationContext(), infp5.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m55")){
                    intent = new Intent(getApplicationContext(), infp6.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m56")){
                    intent = new Intent(getApplicationContext(), infp7.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m57")){
                    intent = new Intent(getApplicationContext(), infp8.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m58")){
                    intent = new Intent(getApplicationContext(), infp9.class);
                    intent.putExtra("sVal", strArr5);
                }
                if (marker.getId().equals("m59")){
                    intent = new Intent(getApplicationContext(), infp10.class);
                    intent.putExtra("sVal", strArr5);
                }

                // ENFJ 60 ~ 69
                if (marker.getId().equals("m60")){
                    intent = new Intent(getApplicationContext(), enfj1.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m61")){
                    intent = new Intent(getApplicationContext(), enfj2.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m62")){
                    intent = new Intent(getApplicationContext(), enfj3.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m63")){
                    intent = new Intent(getApplicationContext(), enfj4.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m64")){
                    intent = new Intent(getApplicationContext(), enfj5.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m65")){
                    intent = new Intent(getApplicationContext(), enfj6.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m66")){
                    intent = new Intent(getApplicationContext(), enfj7.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m67")){
                    intent = new Intent(getApplicationContext(), enfj8.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m68")){
                    intent = new Intent(getApplicationContext(), enfj9.class);
                    intent.putExtra("sVal", strArr6);
                }
                if (marker.getId().equals("m69")){
                    intent = new Intent(getApplicationContext(), enfj10.class);
                    intent.putExtra("sVal", strArr6);
                }

                // ENFP 70 ~ 79
                if (marker.getId().equals("m70")){
                    intent = new Intent(getApplicationContext(), enfp1.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m71")){
                    intent = new Intent(getApplicationContext(), enfp2.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m72")){
                    intent = new Intent(getApplicationContext(), enfp3.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m73")){
                    intent = new Intent(getApplicationContext(), enfp4.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m74")){
                    intent = new Intent(getApplicationContext(), enfp5.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m75")){
                    intent = new Intent(getApplicationContext(), enfp6.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m76")){
                    intent = new Intent(getApplicationContext(), enfp7.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m77")){
                    intent = new Intent(getApplicationContext(), enfp8.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m78")){
                    intent = new Intent(getApplicationContext(), enfp9.class);
                    intent.putExtra("sVal", strArr7);
                }
                if (marker.getId().equals("m79")){
                    intent = new Intent(getApplicationContext(), enfp10.class);
                    intent.putExtra("sVal", strArr7);
                }

                // ISTJ 80 ~ 89
                if (marker.getId().equals("m80")){
                    intent = new Intent(getApplicationContext(), istj1.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m81")){
                    intent = new Intent(getApplicationContext(), istj2.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m82")){
                    intent = new Intent(getApplicationContext(), istj3.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m83")){
                    intent = new Intent(getApplicationContext(), istj4.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m84")){
                    intent = new Intent(getApplicationContext(), istj5.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m85")){
                    intent = new Intent(getApplicationContext(), istj6.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m86")){
                    intent = new Intent(getApplicationContext(), istj7.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m87")){
                    intent = new Intent(getApplicationContext(), istj8.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m88")){
                    intent = new Intent(getApplicationContext(), istj9.class);
                    intent.putExtra("sVal", strArr8);
                }
                if (marker.getId().equals("m89")){
                    intent = new Intent(getApplicationContext(), istj10.class);
                    intent.putExtra("sVal", strArr8);
                }

                // ISTP 90 ~ 99
                if (marker.getId().equals("m90")){
                    intent = new Intent(getApplicationContext(), istp1.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m91")){
                    intent = new Intent(getApplicationContext(), istp2.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m92")){
                    intent = new Intent(getApplicationContext(), istp3.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m93")){
                    intent = new Intent(getApplicationContext(), istp4.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m94")){
                    intent = new Intent(getApplicationContext(), istp5.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m95")){
                    intent = new Intent(getApplicationContext(), istp6.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m96")){
                    intent = new Intent(getApplicationContext(), istp7.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m97")){
                    intent = new Intent(getApplicationContext(), istp8.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m98")){
                    intent = new Intent(getApplicationContext(), istp9.class);
                    intent.putExtra("sVal", strArr9);
                }
                if (marker.getId().equals("m99")){
                    intent = new Intent(getApplicationContext(), istp10.class);
                    intent.putExtra("sVal", strArr9);
                }

                // ESTJ 100 ~ 110.
                if (marker.getId().equals("m100")){
                    intent = new Intent(getApplicationContext(), estj1.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m101")){
                    intent = new Intent(getApplicationContext(), estj2.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m102")){
                    intent = new Intent(getApplicationContext(), estj3.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m103")){
                    intent = new Intent(getApplicationContext(), estj4.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m104")){
                    intent = new Intent(getApplicationContext(), estj5.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m105")){
                    intent = new Intent(getApplicationContext(), estj6.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m106")){
                    intent = new Intent(getApplicationContext(), estj7.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m107")){
                    intent = new Intent(getApplicationContext(), estj8.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m108")){
                    intent = new Intent(getApplicationContext(), estj9.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m109")){
                    intent = new Intent(getApplicationContext(), estj10.class);
                    intent.putExtra("sVal", strArr10);
                }
                if (marker.getId().equals("m110")){
                    intent = new Intent(getApplicationContext(), estj11.class);
                    intent.putExtra("sVal", strArr10);
                }

                // ESTP 111 ~ 120
                if (marker.getId().equals("m111")){
                    intent = new Intent(getApplicationContext(), estp1.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m112")){
                    intent = new Intent(getApplicationContext(), estp2.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m113")){
                    intent = new Intent(getApplicationContext(), estp3.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m114")){
                    intent = new Intent(getApplicationContext(), estp4.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m115")){
                    intent = new Intent(getApplicationContext(), estp5.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m116")){
                    intent = new Intent(getApplicationContext(), estp6.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m117")){
                    intent = new Intent(getApplicationContext(), estp7.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m118")){
                    intent = new Intent(getApplicationContext(), estp8.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m119")){
                    intent = new Intent(getApplicationContext(), estp9.class);
                    intent.putExtra("sVal", strArr11);
                }
                if (marker.getId().equals("m120")){
                    intent = new Intent(getApplicationContext(), estp10.class);
                    intent.putExtra("sVal", strArr11);
                }

                // ISFJ 121 ~ 130
                if (marker.getId().equals("m121")){
                    intent = new Intent(getApplicationContext(), isfj1.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m122")){
                    intent = new Intent(getApplicationContext(), isfj2.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m123")){
                    intent = new Intent(getApplicationContext(), isfj3.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m124")){
                    intent = new Intent(getApplicationContext(), isfj4.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m125")){
                    intent = new Intent(getApplicationContext(), isfj5.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m126")){
                    intent = new Intent(getApplicationContext(), isfj6.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m127")){
                    intent = new Intent(getApplicationContext(), isfj7.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m128")){
                    intent = new Intent(getApplicationContext(), isfj8.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m129")){
                    intent = new Intent(getApplicationContext(), isfj9.class);
                    intent.putExtra("sVal", strArr12);
                }
                if (marker.getId().equals("m130")){
                    intent = new Intent(getApplicationContext(), isfj10.class);
                    intent.putExtra("sVal", strArr12);
                }

                // ISFP 131 ~ 140
                if (marker.getId().equals("m131")){
                    intent = new Intent(getApplicationContext(), isfp1.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m132")){
                    intent = new Intent(getApplicationContext(), isfp2.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m133")){
                    intent = new Intent(getApplicationContext(), isfp3.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m134")){
                    intent = new Intent(getApplicationContext(), isfp4.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m135")){
                    intent = new Intent(getApplicationContext(), isfp5.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m136")){
                    intent = new Intent(getApplicationContext(), isfp6.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m137")){
                    intent = new Intent(getApplicationContext(), isfp7.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m138")){
                    intent = new Intent(getApplicationContext(), isfp8.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m139")){
                    intent = new Intent(getApplicationContext(), isfp9.class);
                    intent.putExtra("sVal", strArr13);
                }
                if (marker.getId().equals("m140")){
                    intent = new Intent(getApplicationContext(), isfp10.class);
                    intent.putExtra("sVal", strArr13);
                }

                // ESFJ 141 ~ 150
                if (marker.getId().equals("m141")){
                    intent = new Intent(getApplicationContext(), esfj1.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m142")){
                    intent = new Intent(getApplicationContext(), esfj2.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m143")){
                    intent = new Intent(getApplicationContext(), esfj3.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m144")){
                    intent = new Intent(getApplicationContext(), esfj4.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m145")){
                    intent = new Intent(getApplicationContext(), esfj5.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m146")){
                    intent = new Intent(getApplicationContext(), esfj6.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m147")){
                    intent = new Intent(getApplicationContext(), esfj7.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m148")){
                    intent = new Intent(getApplicationContext(), esfj8.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m149")){
                    intent = new Intent(getApplicationContext(), esfj9.class);
                    intent.putExtra("sVal", strArr14);
                }
                if (marker.getId().equals("m150")){
                    intent = new Intent(getApplicationContext(), esfj10.class);
                    intent.putExtra("sVal", strArr14);
                }

                // ESFP 151 ~ 160
                if (marker.getId().equals("m151")){
                    intent = new Intent(getApplicationContext(), esfp1.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m152")){
                    intent = new Intent(getApplicationContext(), esfp2.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m153")){
                    intent = new Intent(getApplicationContext(), esfp3.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m154")){
                    intent = new Intent(getApplicationContext(), esfp4.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m155")){
                    intent = new Intent(getApplicationContext(), esfp5.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m156")){
                    intent = new Intent(getApplicationContext(), esfp6.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m157")){
                    intent = new Intent(getApplicationContext(), esfp7.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m158")){
                    intent = new Intent(getApplicationContext(), esfp8.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m159")){
                    intent = new Intent(getApplicationContext(), esfp9.class);
                    intent.putExtra("sVal", strArr15);
                }
                if (marker.getId().equals("m160")){
                    intent = new Intent(getApplicationContext(), esfp10.class);
                    intent.putExtra("sVal", strArr15);
                }



                // intent 실행
                startActivity(intent);
            }
        });

    }
}