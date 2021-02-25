package com.example.th5_createappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DoiNhietDo extends AppCompatActivity {
    Button btnC,btnF;
    EditText edtdoC,edtdoF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doi_nhiet_do);
        btnC =(Button) findViewById(R.id.btnCtoF);
        btnF =(Button) findViewById(R.id.btnFtoC);
        // convert to C to F
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtdoC = (EditText) findViewById(R.id.edtdoC);
                edtdoF = (EditText) findViewById(R.id.edtdoF);
                double doC = Double.parseDouble(edtdoC.getText().toString()) ;
                convert c = new convert();
                c.setDoC(doC);
                c.convertCtoF();
                double doF = c.getDoF();
                edtdoF.setText(String.valueOf(doF));
            }
        });
        //convert F to C
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtdoC = (EditText) findViewById(R.id.edtdoC);
                edtdoF= (EditText) findViewById(R.id.edtdoF);
                double doF = Double.parseDouble(edtdoF.getText().toString()) ;
                convert c = new convert();
                c.setDoC(doF);
                c.convertFtoC();
                double doC = c.getDoC();
                edtdoC.setText(String.valueOf(doC));
            }
        });
    }
}