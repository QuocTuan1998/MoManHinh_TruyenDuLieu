package com.example.quoctuan.momanhinh_truyendulieu.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quoctuan.momanhinh_truyendulieu.R;

import model.SinhVien;

public class ManHinh2Activity extends AppCompatActivity {

    TextView txtKQ;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);
        
        addConTrols();
    }

    private void addConTrols() {

        txtKQ = (TextView) findViewById(R.id.txtKQ);
//        trả về Intent mở màn hình
        Intent intent = getIntent();
//      khởi tạo biến để lấy giá trị từ intent bên kia (têm biến giống bên truyền,
//                                                      giá trị trả về khi không tìm thấy biến)
        boolean kieuBoolean = intent.getBooleanExtra("KIEU_BOOLEAN",false);
        char kieuChar = intent.getCharExtra("KIEU_CHAR",'w');
        int kieuInt = intent.getIntExtra("KIEU_int",0);
        double kieuD = intent.getDoubleExtra("KIEU_DOUBLE",0);
        String kieuChuoi = intent.getStringExtra("KIEU_CHUOI");
//      muốn lấy được đối tượng thì lớp đó bắt buộc phải implement serializable
        SinhVien sv = (SinhVien) intent.getSerializableExtra("SINHVIEN");

//      Đưa dữ liệu lên TextView
        txtKQ.setText(
                "kiểu boolean = " + kieuBoolean + "\n" +
                "kiểu char = " + kieuChar + "\n" +
                "kiểu int = " + kieuInt + "\n" +
                "kiểu double = " + kieuD + "\n" +
                "kiểu chuỗi = " + kieuChuoi + "\n" +
                "Kiểu đối tượng = " + sv
        );
    }
}
