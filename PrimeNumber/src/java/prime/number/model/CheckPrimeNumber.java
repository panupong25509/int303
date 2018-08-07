/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number.model;

/**
 *
 * @author Joknoi
 */
public class CheckPrimeNumber {

    private int number;

    public CheckPrimeNumber(int number) {
        this.number = number;
    }

    public String check() {
        int count = 0;
        if (this.number != 1) {
            for (int i = this.number; i > 0; i--) {
                if ((this.number % i) == 0) {
                    count++;
                }
            }
        } else {
            count++;
        }
        if(count==2){return "Prime number";}
        else{return "Not Prime number";}
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "This is "+check();
    }

}
