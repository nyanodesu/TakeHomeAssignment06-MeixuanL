package com.example.takehomeassignment06_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        CheckInfo c = (CheckInfo) i.getSerializableExtra(Keys.CHECKINFO);

        double total = c.getAmount();
        double tax = c.getTaxPercentage()*c.getAmount();
        double tip = c.getTipPercentage()*c.getAmount();
        double grandTotal = total + tax +tip;

        mText = (TextView) findViewById(R.id.text);
        mText.setText("Total: "+String.format("%.2f",total)+"\nSales Tax: "+String.format("%.2f",tax)+"\nTip: " + String.format("%.2f",tip)+"\nGrand Total: " +String.format("%.2f",grandTotal));





    }
}
