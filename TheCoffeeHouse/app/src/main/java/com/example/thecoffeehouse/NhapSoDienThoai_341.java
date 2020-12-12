package com.example.thecoffeehouse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NhapSoDienThoai_341 extends AppCompatActivity {
    ImageView quaylai_nhapsodienthoai_341;
    EditText nhapsodienthoai3_341;
    Button btntieptuc_341;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhap_so_dien_thoai_341);

        quaylai_nhapsodienthoai_341 = (ImageView) findViewById(R.id.quaylai_nhapsodienthoai_341);
        quaylai_nhapsodienthoai_341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        nhapsodienthoai3_341 = (EditText) findViewById(R.id.nhapsodienthoai3_341);
        btntieptuc_341 = (Button) findViewById(R.id.btntieptuc_341);
        btntieptuc_341.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = nhapsodienthoai3_341.getText().toString();
                if(str1.length()==0){
                    Toast.makeText(NhapSoDienThoai_341.this, "Bạn chưa điền. Mời nhập lại",Toast.LENGTH_LONG).show();
                }else if(str1.length()>10){
                    Toast.makeText(NhapSoDienThoai_341.this, "Không được nhập trên 10 kí tự",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(NhapSoDienThoai_341.this, "Tiếp tục",Toast.LENGTH_LONG).show();
                    openNhapMaXacThuc();
                }
//                String str1 = nhapsodienthoai3_341.getText().toString();
//                if (isNumeric(str1)== true) {
//                     if (str1.length() == 0) {
//                         Toast.makeText(NhapSoDienThoai.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG).show();
//                     } else if (str1.length() > 10) {
//                         Toast.makeText(NhapSoDienThoai.this, "Không được nhập trên 10 kí tự", Toast.LENGTH_LONG).show();
//                     } else {
//                         Toast.makeText(NhapSoDienThoai.this, "Tiếp tục", Toast.LENGTH_LONG).show();
//                         openNhapMaXacThuc();
//                     }
//            } else {
//                Toast.makeText(NhapSoDienThoai.this, "Không được nhập chữ", Toast.LENGTH_LONG).show();
//            }
            }
        });
    }

    //    public static boolean isNumeric(String str1) {
//        try {
//            Integer.parseInt(str1);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
    public void openLogin() {
        Intent intent = new Intent(this, Login_341.class);
        startActivity(intent);
        finish();
    }
    public void openNhapMaXacThuc(){
        Intent intent = new Intent(this, NhapMaXacThuc_341.class);
        startActivity(intent);
        finish();
    }

}

