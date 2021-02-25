package com.example.th5_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.Manifest.permission;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smsActivity extends AppCompatActivity {
    private EditText edtPhone,edtNoiDung;
    private Button btnGui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        AnhXa();
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                composeSMSMessage(edtPhone.getText().toString(),edtNoiDung.getText().toString());
            }
        });
    }
    private void AnhXa()
    {
        edtPhone =(EditText) findViewById(R.id.edtPhone);
        edtNoiDung =(EditText) findViewById(R.id.edtNoiDung);
        btnGui =(Button) findViewById(R.id.btnGui);
    }
    public void composeSMSMessage(String to, String message){
        if(!TextUtils.isEmpty(to) && !TextUtils.isEmpty(message)){
                if(checkPermission(Manifest.permission.SEND_SMS)){
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(to.toString(),null,message.toString(),null,null);

                }
        }else{
            Toast.makeText(this, "Nhập số điện thoại và nội dung", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkPermission(String sendSms) {
        int check = ContextCompat.checkSelfPermission(this,sendSms);
        return check == PackageManager.PERMISSION_GRANTED;
    }
}