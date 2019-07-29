package com.amosespluralsight.calcengine;

public class Multiplyer extends CalculateBase {

    public Multiplyer() {}

    public Multiplyer(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    public void calculate(){
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
