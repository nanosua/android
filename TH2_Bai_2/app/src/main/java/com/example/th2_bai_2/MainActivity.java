package com.example.th2_bai_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
            EditText edtHoTen,edtCMND;
            Button btnGuiDi;
            RadioButton rdTrungCap,rdCaoDang,rdDaiHoc,rdDocBao,rdDocSach,rdDocCoding;
                RadioGroup rdgTrinhDo,rdgSoThich ;
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        btnGuiDi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    HienThiThongTin();
            }
        });
    }
    private void AnhXa(){
        edtHoTen =(EditText) findViewById(R.id.edtHoTen);
        edtCMND =(EditText) findViewById(R.id.edtCMND);
        rdTrungCap =(RadioButton) findViewById(R.id.rdTrungCap);
        rdDaiHoc =(RadioButton ) findViewById(R.id.rdDaiHoc);
        rdCaoDang =(RadioButton) findViewById(R.id.rdCaoDang);
        rdDocBao =(RadioButton) findViewById(R.id.rdDocBao);
        rdDocSach =(RadioButton) findViewById(R.id.rdDocSach);
        rdDocCoding =( RadioButton) findViewById(R.id.rdDocCoding);
        rdgTrinhDo =(RadioGroup) findViewById(R.id.rdgTrinhDo);
        rdgSoThich =(RadioGroup) findViewById(R.id.rdgSoThich);
        btnGuiDi =(Button) findViewById(R.id.btnGuiDi);
    }
    private void HienThiThongTin(){
        thongtinClass tt;
        String _hoTen = edtHoTen.getText().toString();
        String _cmnd = edtCMND.getText().toString();
        String  _trinhDo ="";
        String _soThich ="";
            switch (rdgTrinhDo.getCheckedRadioButtonId()){
                case R.id.rdTrungCap: _trinhDo ="Trung cấp"; break;
                case R.id.rdDaiHoc: _trinhDo ="Đại học"; break;
                case R.id.rdCaoDang: _trinhDo ="Cao đẳng"; break;
            }
        switch (rdgSoThich.getCheckedRadioButtonId()){
            case R.id.rdDocSach: _soThich ="Đọc sách"; break;
            case R.id.rdDocBao: _soThich ="Đọc báo"; break;
            case R.id.rdDocCoding: _soThich ="Đọc coding"; break;
        }
        tt = new thongtinClass(_hoTen,_cmnd,_soThich,_trinhDo);
        Toast.makeText(this, tt.toString(), Toast.LENGTH_SHORT).show();
    }
}