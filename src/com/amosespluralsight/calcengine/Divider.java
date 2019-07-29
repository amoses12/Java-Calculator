package com.amosespluralsight.calcengine;

public class Divider extends CalculateBase {
    public Divider() {}

    public Divider (double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    public void calculate(){
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
