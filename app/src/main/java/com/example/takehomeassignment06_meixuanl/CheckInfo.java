package com.example.takehomeassignment06_meixuanl;

import java.io.Serializable;

public class CheckInfo implements Serializable {
    private double amount;
    private double tipPercentage;
    private double taxPercentage;

    public CheckInfo(double amount,double tipPercentage,double taxPercentage){
        this.amount = amount;
        this.tipPercentage = tipPercentage;
        this.taxPercentage = taxPercentage;
    }

    public double getAmount() {
        return amount;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
