package com.example.th4_lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
        EditText edtMessage;
        Button btnExit;
        ConstraintLayout myscreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMessage =(EditText) findViewById(R.id.edtColor);
        btnExit =(Button) findViewById(R.id.btnMessage) ;
        myscreen =(ConstraintLayout) findViewById(R.id.myScreen);
        edtMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String color = s.toString().toLowerCase(Locale.US);
                changeBackground(color,myscreen);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });
        Toast.makeText(this, "on Create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    public void exit(){
        finish();
    }
    public void changeBackground(String color , ConstraintLayout myscreen){
        if(color.contains("red")){
            myscreen.setBackgroundColor(Color.RED);
        }else if( color.contains("green")){
            myscreen.setBackgroundColor(Color.GREEN);
        }else if(color.contains("blue")){
            myscreen.setBackgroundColor(Color.BLUE);
        }else if(color.contains("white")){
            myscreen.setBackgroundColor(Color.WHITE);
        }else{
            Toast.makeText(this, "Bạn nhập tên màu không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}