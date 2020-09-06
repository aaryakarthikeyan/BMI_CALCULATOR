package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    private Button button1;
    EditText weight,height;
    String bmiresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        weight= (EditText) findViewById(R.id.weight);
        height= (EditText) findViewById(R.id.height);

        button1 =(Button) findViewById(R.id.bmibutt);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openthird();
            }
        });

        }

    public void openthird() {

        String s1= weight.getText().toString();
        String s2= height.getText().toString();
        float wv=Float.parseFloat(s1);
        float hv=Float.parseFloat(s2)/100;
        float bmi= wv/ (hv*hv) ;
        String bmii= "IS\t"+bmi;
        if (bmi <16 )
        {
            bmiresult="SEVERELY UNDER WEIGHT";
        }
        else if(bmi < 18.5)
        {
            bmiresult= "UNDER WEIGHT";
        }
        else if(bmi>=18.5 && bmi<= 24.9 ){
            bmiresult="NORMAL WEIGHT";
        }
        else if(bmi>=25 && bmi<=29.9)
        {
            bmiresult="OVER WEIGHT";
        }
        else if(bmi>=30 && bmi<=34.9)
        {
            bmiresult="OBESE";
        }
        else
        {
            bmiresult="EXTREMELY OBESE";
        }
        Intent intent= new Intent(Second.this,Twothird.class);
        intent.putExtra("WEIGHT(KGS)",s1);
        intent.putExtra("HEIGHT(CMS)",s2);
        intent.putExtra("BMI",bmii);
        intent.putExtra("result",bmiresult);
        startActivity(intent);
    }

    }
