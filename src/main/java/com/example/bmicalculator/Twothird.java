package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Twothird extends AppCompatActivity {

    TextView w,h,result,report;
    String bmires,cal;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twothird);

        w= (TextView) findViewById(R.id.w);
        h= (TextView) findViewById(R.id.h);
        result= (TextView) findViewById(R.id.res);
        report= (TextView) findViewById(R.id.rep);
        button3 =(Button) findViewById(R.id.ttbutt);
        w.setText("YOUR WEIGHT \t"+getIntent().getStringExtra("WEIGHT(KGS)")+"\tKGS");
        h.setText("YOUR HEIGHT \t"+getIntent().getStringExtra("HEIGHT(CMS)")+"\tCMS");
        result.setText("YOUR BMI "+getIntent().getStringExtra("BMI")+"\tKG/M²");
        report.setText("YOUR REPORT IS\n"+getIntent().getStringExtra("result"));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentwothree();
            }
        });

    }

    public void opentwothree() {
        Intent intent= new Intent(Twothird.this,Third.class);
        startActivity(intent);
    }
}