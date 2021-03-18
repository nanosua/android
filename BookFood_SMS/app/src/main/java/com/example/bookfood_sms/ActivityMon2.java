package com.example.bookfood_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityMon2 extends AppCompatActivity {
    ImageView iconback;
    Button btnGoiGuiSMS2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon2);
        iconback =(ImageView) findViewById(R.id.imgBack2) ;
        btnGoiGuiSMS2 =(Button) findViewById(R.id.btnGoiGuiSMS2);
        iconback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMon2.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnGoiGuiSMS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent1 = new Intent(ActivityMon2.this, smsActivity.class);
                startActivity(intent1);
            }
        });
    }
}