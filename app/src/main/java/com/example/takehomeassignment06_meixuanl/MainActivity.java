package com.example.takehomeassignment06_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mAmount;
    EditText mTipPercentage;
    EditText mTaxPercentage;
    double amount;
    double tipPercentage;
    double taxPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAmount = (EditText) findViewById(R.id.amount);
        mTipPercentage = (EditText) findViewById(R.id.tip_percentage);
        mTaxPercentage = (EditText) findViewById(R.id.tax_percentage);

    }

    public void submit(View view){
        Intent i = new Intent(this,Main2Activity.class);
        CheckInfo c = new CheckInfo(amount,tipPercentage,taxPercentage);

        String sAmount = mAmount.getText().toString();
        amount = Double.parseDouble(sAmount);
        c.setAmount(amount);

        String sTipPercentage = mTipPercentage.getText().toString();
        tipPercentage = Double.parseDouble(sTipPercentage);
        c.setTipPercentage(tipPercentage);

        String sTaxPercentage = mTaxPercentage.getText().toString();
        taxPercentage = Double.parseDouble(sTaxPercentage);
        c.setTaxPercentage(taxPercentage);

        /*if(amount<=0 || tipPercentage<0 || taxPercentage<0){
            Toast.makeText(MainActivity.this,"Please enter a valid number!",Toast.LENGTH_SHORT);
        }else {*/
            i.putExtra(Keys.CHECKINFO, c);
            startActivity(i);
        

    }
}
