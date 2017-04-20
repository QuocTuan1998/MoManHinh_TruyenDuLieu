package com.example.quoctuan.momanhinh_truyendulieu.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quoctuan.momanhinh_truyendulieu.R;

import model.SinhVien;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void xuLyMoVaGuiDuLieu(View view) {

        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
//        truyền dữ liệu (Tên biến ,Giá trị của biến)
        intent.putExtra("KIEU_BOOLEAN",true);
        intent.putExtra("KIEU_CHAR",'x');
        intent.putExtra("KIEU_int",100);
        intent.putExtra("KIEU_DOUBLE",15.99);
        intent.putExtra("KIEU_CHUOI","NguyenQuocTuan");
//      Lớp phải implement Serializable
        SinhVien sv = new SinhVien(1,"Nguyễn Văn A");
        intent.putExtra("SINHVIEN",sv);

        startActivity(intent);

    }
}
