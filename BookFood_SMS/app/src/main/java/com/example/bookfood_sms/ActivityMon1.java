package com.example.bookfood_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityMon1 extends AppCompatActivity {
    ImageView iconback;
    Button btnGoiGuiSMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon1);
        iconback =(ImageView) findViewById(R.id.imgBack) ;
        btnGoiGuiSMS =(Button) findViewById(R.id.btnGoiGuiSMS);
        iconback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMon1.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnGoiGuiSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                new AlertDialog.Builder(ActivityMon1.this)
                        .setTitle("Exit")
                        .setMessage("Bạn chắc chắn muốn  đặt món")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent1 = new Intent(ActivityMon1.this, smsActivity.class);
                                startActivity(intent1);
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intentMain = new Intent(ActivityMon1.this, MainActivity.class);
                        startActivity(intentMain);
                    }
                }).show();

            }
        });
    }
}