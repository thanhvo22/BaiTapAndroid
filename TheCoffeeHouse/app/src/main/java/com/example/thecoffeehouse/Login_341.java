package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login_341 extends AppCompatActivity {
    EditText nhapsodienthoai2_341;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_341);

        nhapsodienthoai2_341 = (EditText) findViewById(R.id.nhapsodienthoai2_341);
        nhapsodienthoai2_341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
    }
    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, NhapSoDienThoai_341.class);
        startActivity(intent);
        finish();
    }
}

