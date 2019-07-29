package com.amosespluralsight.calcengine;

public class Subtractor extends CalculateBase {
    public Subtractor(){}

    public Subtractor(double leftVal, double rightVal){
        super(leftVal, rightVal);
    }

    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }

}
