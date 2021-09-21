package X.OOP;

public class LameCalculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}

/*
The LameCalculator class has instance methods that can do simple math
operations on two numbers. Create the methods: plus, minus, multiply and divide.

All the methods get two ints then the method does the required math operation and
returns the result as an int.

Example:

LameCalculator lc = new LameCalculator();

lc.plus(1,1)
returns:2

lc.minus(1,1)
returns:0

lc.multiply(2,1)
returns:2

lc.divide(10,2)
returns:5
 */
