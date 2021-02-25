package com.example.th5_createappnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button btnChangeTemp,btnLunarYear,btnIbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btnChangeTemp =( Button) findViewById(R.id.btnChangeTemp);
            btnLunarYear =(Button) findViewById(R.id.btnLunarYear);
            btnIbm =(Button) findViewById(R.id.btnIbm);
            btnChangeTemp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentChangeTemp = new Intent(MainActivity.this,DoiNhietDo.class);
                    startActivity(intentChangeTemp);
                }
            });
            btnLunarYear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentLunarYear = new Intent(MainActivity.this,NamAmLich.class);
                    startActivity(intentLunarYear);
                }
            });
            btnIbm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentIbm = new Intent(MainActivity.this,BMI.class);
                    startActivity(intentIbm);
                }
            });
    }
}