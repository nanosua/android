package com.example.th5_createappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NamAmLich extends AppCompatActivity {
    Button btnXem;
    EditText edtAmLich;
    TextView txtAmLich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nam_am_lich);
        edtAmLich = (EditText) findViewById(R.id.edtAmLich);
        btnXem =(Button) findViewById(R.id.btnXem);
        txtAmLich =(TextView) findViewById(R.id.txtAmLich);
        btnXem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nam = Integer.parseInt(edtAmLich.getText().toString());
                AmLich al = new AmLich(nam);
                txtAmLich.setText(al.getNamAL());

            }
        });
    }
}