package com.android.unittest.s19145369;

public class Calculator {

    // Available operations
    public enum Operator {ADD, SUB, DIV, MUL,EXP,FAC,LOG}

    /**
     * Addition operation
     */
    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    /**
     * Subtract operation
     */
    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    /**
     * Divide operation
     */
    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    /**
     * Multiply operation
     */
    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    /**
     * Exponential operation
     */
    public double exp(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand,secondOperand);
    }
    /**
     * Factorial operation
     */
    public double fac(double firstOperand) {
        if (firstOperand > 0) {
            return firstOperand * fac(firstOperand - 1);
        } else {
            return 1;
        }
    }
    /**
     * Logarith operation
     */
    public double log(double firstOperand, double secondOperand)
    {
        return Math.log(firstOperand) / Math.log(secondOperand);
    }
}
