package com.example.th5_createappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BMI extends AppCompatActivity {
    EditText edtCanNang,edtChieuCao,edtBMI,edtChanDoan;
    Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i);
        Mapping();

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinh();
            }
        });
    }
    private void Mapping(){
        edtChieuCao =(EditText) findViewById(R.id.edtChieuCao);
        edtCanNang =(EditText) findViewById(R.id.edtCanNang);
        btnTinh =(Button) findViewById(R.id.btnTinh);
        edtBMI =(EditText) findViewById(R.id.edtBMI);
        edtChanDoan =(EditText) findViewById(R.id.edtChanDoan);
    }

    private void tinh(){
        Double canNang = Double.parseDouble(edtCanNang.getText().toString());
        Double chieuCao = Double.parseDouble(edtChieuCao.getText().toString());
        bmiclass bmi = new bmiclass(chieuCao,canNang);
        edtBMI.setText(String.valueOf(bmi.getBMI()) );
        edtChanDoan.setText(bmi.getChanDoan());

    }

}