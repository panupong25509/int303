/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.model;

/**
 *
 * @author INT303
 */
public class SimpleCalculator {

    double x;
    double y;
    private String operator;

    public SimpleCalculator(double x, double y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }
   
    public double getResult() {
        if (operator.equalsIgnoreCase("+")) {
            return x + y;
        } else if (operator.equalsIgnoreCase("-")) {
            return x - y;
        } else if (operator.equalsIgnoreCase("*")) {
            return x * y;
        } else if (operator.equalsIgnoreCase("/")) {
            return x / y;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "x = "+x+", y = "+y+" result => x "+operator+" y = "+getResult();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
