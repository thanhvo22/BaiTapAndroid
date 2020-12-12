package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class KhoiDong_341 extends AppCompatActivity {
    private static  int SPLASH_SCREEN = 5000;
    ImageView logo_coffehouse,text_coffehouse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_khoi_dong_341);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(KhoiDong_341.this, Login_341.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}