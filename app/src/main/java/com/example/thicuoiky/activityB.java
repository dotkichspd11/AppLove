package com.example.thicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activityB extends AppCompatActivity {
    TextView tvten,tvtuoi;
    Button btn1b,btn2b,btn3b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        tvten = (TextView)findViewById(R.id.tv_ten);
        tvtuoi = (TextView)findViewById(R.id.tv_tuoi);
        btn1b = (Button)findViewById(R.id.btn1b);
        btn2b = (Button)findViewById(R.id.btn2b);
        btn3b = (Button)findViewById(R.id.btn3b);

        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activityB.this, "Cảm ơn bạn đã sử dụng ứng dụng. Chúc 2 bạn hạnh phúc!", Toast.LENGTH_SHORT).show();
            }
        });
        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
        setDataByExtras();
    }
    public void setDataByExtras(){

        Intent intent= getIntent();
        String tenmot = intent.getStringExtra(activityA.TEN);
        String tuoimot = intent.getStringExtra(activityA.TUOI);

        tvten.setText(tenmot);
        tvtuoi.setText(tuoimot);
    }
}