package com.example.hi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//app을 실행했을 때 처음 사용자를 대면하는 MainActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}