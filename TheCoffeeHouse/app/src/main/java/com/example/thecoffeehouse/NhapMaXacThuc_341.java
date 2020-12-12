package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NhapMaXacThuc_341 extends AppCompatActivity {
    ImageView quaylai2_nhapsodienthoai_341;
    EditText nhapmaxacthuc_341;
    Button btnmaxacthuc_341;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_ma_xac_thuc_341);
        //1. Nút quay lại
        ImageView quaylai2_nhapsodienthoai_341=(ImageView) findViewById(R.id.quaylai2_nhapsodienthoai_341);
        quaylai2_nhapsodienthoai_341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
        //2. Nút button
        nhapmaxacthuc_341=(EditText) findViewById(R.id.nhapmaxacthuc_341);
        btnmaxacthuc_341=(Button) findViewById(R.id.btnmaxacthuc_341);
        btnmaxacthuc_341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str2 = nhapmaxacthuc_341.getText().toString();
                if(str2.length()==0) {
                    Toast.makeText(NhapMaXacThuc_341.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(NhapMaXacThuc_341.this, "Tiếp tục",Toast.LENGTH_LONG).show();
                    openMainActivity();
                }
            }
        });





//        btnmaxacthuc = (Button) findViewById(R.id.btnmaxacthuc);
//        btnmaxacthuc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openMainActivity();
//            }
//        });
    }
    //1.
    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, NhapSoDienThoai_341.class);
        startActivity(intent);
        finish();
    }
    //2.
    public void openMainActivity() {
        Intent intent = new Intent(this, Home_341.class);
        startActivity(intent);
        finish();
    }
}

