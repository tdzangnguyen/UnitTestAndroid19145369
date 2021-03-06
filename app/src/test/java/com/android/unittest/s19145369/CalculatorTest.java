package com.android.unittest.s19145369;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
//@SmallTest
//public class  ExampleUnitTest{
//    public Calculator mcalculator;
//
//}
public class CalculatorTest {
    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    //  Case 1:
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }
    //  Case 2:
    @Test
    public void addOneNumbersNegative() {
        double resultAdd=mCalculator.add(-1d,2d);
        assertThat(resultAdd,is(equalTo(1d)));
    }
    //  Case 3:
    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, -2d);
        assertThat(resultAdd, is(equalTo(-3d)));
    }
    //  Case 4:
    @Test
    public void addTwoNumbersNegativeFloats() {
        double resultAdd = mCalculator.add(-1.1111f, -1.1111d);
        assertThat(resultAdd, is(closeTo(-2.22222f,0.1d)));
    }
    //  Case 5:
    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222d,0.1d)));
    }
    /**
     * Test for simple subtraction
     */
    //  Case 1:
    @Test
    public void subTwoNumbers() {
        double resultAdd = mCalculator.sub(1d, 1d);
        assertThat(resultAdd, is(equalTo(0d)));
    }
    //  Case 2:
    @Test
    public void subOneNumbersNegative() {
        double resultAdd=mCalculator.sub(-1d,2d);
        assertThat(resultAdd,is(equalTo(-3d)));
    }
    //  Case 3:
    @Test
    public void subTwoNumbersNegative() {
        double resultAdd = mCalculator.sub(-1d, -2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }
    //  Case 4:
    @Test
    public void subTwoNumbersNegativeFloats() {
        double resultAdd = mCalculator.sub(-2.22222f, -1.1111d);
        assertThat(resultAdd, is(closeTo(-1.11111f,0.1d)));
    }
    //  Case 5:
    @Test
    public void subTwoNumbersFloats() {
        double resultAdd = mCalculator.sub(1.111f, 2.222d);
        assertThat(resultAdd, is(closeTo(-1.1111d,0.1d)));
    }
    /**
     * Test for simple Multiplication
     */
    //  Case 1:
    @Test
    public void mulTwoNumbers() {
        double resultAdd = mCalculator.mul(21d, 3d);
        assertThat(resultAdd, is(equalTo(63d)));
    }
    //  Case 2:
    @Test
    public void mulOneNumbersNegative() {
        double resultAdd=mCalculator.mul(-2d,3d);
        assertThat(resultAdd,is(equalTo(-6d)));
    }
    //  Case 3:
    @Test
    public void mulTwoNumbersNegative() {
        double resultAdd = mCalculator.mul(-3d, -2d);
        assertThat(resultAdd, is(equalTo(6d)));
    }
    //  Case 4:
    @Test
    public void mulWithZero() {
        double resultAdd = mCalculator.mul(0d, -4d);
        assertThat(resultAdd, is(closeTo(0d,0.0001)));
    }
    //  Case 5:
    @Test
    public void mulTwoNumberFloat() {
        double resultAdd = mCalculator.mul(1.5f, 2.56f);
        assertThat(resultAdd, is(closeTo(3.84d,0.001)));
    }
    //  Case 6:
    @Test
    public void mulOneNumberNegativeFloat() {
        double resultAdd = mCalculator.mul(-1.5f, 2.56f);
        assertThat(resultAdd, is(closeTo(-3.84d,0.001)));
    }
    /**
     * Test for simple Division
     */
    //  Case 1:
    @Test
    public void divTwoNumbers() {
        double resultAdd = mCalculator.div(12d,2d);
        assertThat(resultAdd,  is(equalTo(6d)));
    }
    //  Case 2:
    @Test
    public void divOneNumberNegative() {
        double resultAdd = mCalculator.div(-12d,2d);
        assertThat(resultAdd,  is(equalTo(-6d)));
    }
    //  Case 3:
    @Test
    public void divOneNumberFloatNegative() {
        double resultAdd = mCalculator.div(-12d,3.2f);
        assertThat(resultAdd,  is(closeTo(-3.75d,0.001)));
    }
    //  Case 4:
    @Test
    public void divTwoNumberWithFloat() {
        double resultAdd = mCalculator.div(6.2f,3.1f);
        assertThat(resultAdd,  is(closeTo(2,0.0001)));
    }
    //  Case 5:
    @Test
    public void divOneNumberWithZero() {
        double resultAdd = mCalculator.div(12d,0d);
        assertThat(resultAdd,  is(equalTo(Double.POSITIVE_INFINITY)));
    }

    /**
     * Test for simple Exponential
     */
    //  Case 1:
    @Test
    public void expTwoNumber() {
        double resultAdd = mCalculator.exp(3d,2d);
        assertThat(resultAdd,  is(equalTo(9d)));
    }
    //  Case 2:
    @Test
    public void expFirstNumberNegative() {
        double resultAdd = mCalculator.exp(-3d,2d);
        assertThat(resultAdd,  is(equalTo(9d)));
    }
    //  Case 3:
    @Test
    public void expSecondNumberNegative() {
        double resultAdd = mCalculator.exp(4d,-2d);
        assertThat(resultAdd,  is(closeTo(0,0.1)));
    }
    //  Case 4:
    @Test
    public void expSecondNumberFloat() {
        double resultAdd = mCalculator.exp(4d,2.5f);
        assertThat(resultAdd,  is(equalTo(32d)));
    }
    //  Case 5:
    @Test
    public void expSecondNumberZero() {
        double resultAdd = mCalculator.exp(4d,0d);
        assertThat(resultAdd,  is(equalTo(1d)));
    }
    /**
     * Test for simple Factorial
     */
    //  Case 1:
    @Test
    public void facNumber() {
        double resultAdd = mCalculator.fac(4d);
        assertThat(resultAdd,  is(equalTo(24d)));
    }
    //  Case 2:
    @Test
    public void facNumberZero() {
        double resultAdd = mCalculator.fac(0d);
        assertThat(resultAdd,  is(equalTo(1d)));
    }
    //  Case 3:
    @Test
    public void facNumberWithFirstZero() {
        double resultAdd = mCalculator.fac(06d);
        assertThat(resultAdd,  is(equalTo(720d)));
    }
    //  Case 4:
    @Test
    public void facNumberOne() {
        double resultAdd = mCalculator.fac(1d);
        assertThat(resultAdd,  is(equalTo(1d)));
    }
    //  Case 5:
    @Test
    public void facNumberWithPlus() {
        double resultAdd = mCalculator.fac(+4d);
        assertThat(resultAdd,  is(equalTo(24d)));
    }
    /**
     * Test for simple Logarit
     */
    //  Case 1:
    @Test
    public void logTwoNumber() {
        double resultAdd = mCalculator.log(4d,2d);
        assertThat(resultAdd,  is(equalTo(2d)));
    }
    //  Case 2:
    @Test
    public void logOneNumberFloat() {
        double resultAdd = mCalculator.log(9.2f,2d);
        assertThat(resultAdd,  is(closeTo(3.2f,0.01)));
    }
    //  Case 3:
    @Test
    public void logTwoNumberFloat() {
        double resultAdd = mCalculator.log(9.2f,4.6d);
        assertThat(resultAdd,  is(closeTo(1.4542f,0.001)));
    }
    //  Case 4:
    @Test
    public void logSameTwoNumber() {
        double resultAdd = mCalculator.log(3d,3d);
        assertThat(resultAdd,  is(equalTo(1d)));
    }
    //  Case 5:
    @Test
    public void logAlwaysZero() {
        double resultAdd = mCalculator.log(1d,3d);
        assertThat(resultAdd,  is(equalTo(0d)));
    }
}
