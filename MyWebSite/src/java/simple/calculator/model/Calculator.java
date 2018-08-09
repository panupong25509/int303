/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculator.model;

/**
 *
 * @author Joknoi
 */
public class Calculator {

    private double x;
    private double y;
    private String operator;

    public Calculator(double x, double y, String operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
    }

    public double getResult() {
        double result = 0;
        switch (this.operator) {
            case "+":
                result = this.x + this.y;
                break;
            case "-":
                result = this.x - this.y;
                break;
            case "*":
                result = this.x * this.y;
                break;
            case "/":
                result = this.x / this.y;
                break;
        }
        return result;
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
