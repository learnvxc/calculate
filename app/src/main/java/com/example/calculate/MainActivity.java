package com.example.calculate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // khai báo biến
    EditText edtA,edtB,edtKQ  ;
    Button btncong,btntru,btnnhan,btnchia,btnchiadu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        edtKQ = findViewById(R.id.edtKQ);
        btncong=findViewById(R.id.btncong);
        btnnhan = findViewById(R.id.btnnhan);
        btntru=findViewById(R.id.btntru);
        btnchia=findViewById(R.id.btnchia);
        btnchiadu=findViewById(R.id.btnchiadu);
        // xử lí click
        //cộng
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c= a + b;
                edtKQ.setText(c+ "");
            }
        });
        //trừ
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c=a-b;
                edtKQ.setText(c+ "");
            }
        });
        //nhân
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c=a*b;
                edtKQ.setText(c+ "");
            }
        });
        //chia
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c=a/b;
                edtKQ.setText(c+ "");
            }
        });
        //chia dư
        btnchiadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edtA.getText().toString());
                int b = Integer.parseInt(edtB.getText().toString());
                int c= a % b;
                edtKQ.setText(c+ "");
            }
        });
    }
}