package com.example.thicuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activityA extends AppCompatActivity {
    Button btnChon,btnNhap,btnThoat;
    EditText edt_tenmot, edt_tuoimot;

    public static final String TEN = "TEN";
    public static final String TUOI = "TUOI";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        edt_tenmot = (EditText)findViewById(R.id.edt_tenmot);
        edt_tuoimot = (EditText)findViewById(R.id.edt_tuoimot);
        btnChon =(Button)findViewById(R.id.btnChon);
        btnNhap =(Button)findViewById(R.id.btnNhap);
        btnThoat =(Button)findViewById(R.id.btnThoat);

        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenmot = edt_tenmot.getText().toString();
                String tuoimot = edt_tuoimot.getText().toString();
                byExtras(tenmot,tuoimot);
            }
        });
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText deleteten = (EditText)findViewById(R.id.edt_tenmot);
                deleteten.setText("");
                EditText deletetuoi = (EditText)findViewById(R.id.edt_tuoimot);
                deletetuoi.setText("");

            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }
    public void byExtras(String tenmot,String tuoimot){
        Intent intent = new Intent(activityA.this, activityB.class);
        intent.putExtra(TEN,tenmot);
        intent.putExtra(TUOI,tuoimot + " tuổi");
        startActivity(intent);
    }
}