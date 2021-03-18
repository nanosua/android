package com.example.bookfood_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityMon4 extends AppCompatActivity {
    ImageView iconback;
    Button btnGoiGuiSMS4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon4);
        iconback =(ImageView) findViewById(R.id.imgBack4) ;
        btnGoiGuiSMS4=(Button) findViewById(R.id.btnGoiGuiSMS4);
        iconback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMon4.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnGoiGuiSMS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent1 = new Intent(ActivityMon4.this, smsActivity.class);
                startActivity(intent1);
            }
        });

    }
}