package com.example.bookfood_sms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smsActivity extends AppCompatActivity {
EditText edtNum, edtContent;
Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        edtNum = (EditText) findViewById(R.id.edtNum);
        edtContent =(EditText) findViewById(R.id.edtContent);
        btnSend =(Button) findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeSmsMessage(edtNum.getText().toString(),
                edtContent.getText().toString());
            }
        });
    }
    public void composeSmsMessage(String to, String message) {
        if (!TextUtils.isEmpty(to) && !TextUtils.isEmpty(message)) {
            if (checkPermission(Manifest.permission.SEND_SMS)) {
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(to.toString(), null, message.toString(), null, null);
            }
        }    else
                {
            Toast.makeText(this, "Nhập số điện thoại và nội dung", Toast.LENGTH_SHORT).show();
        }
    }
    private boolean checkPermission(String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return  check == PackageManager.PERMISSION_GRANTED;
    }
}