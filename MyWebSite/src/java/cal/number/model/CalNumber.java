/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cal.number.model;

/**
 *
 * @author INT303
 */
public class CalNumber {
    private int number;

    public CalNumber(int number) {
        this.number = number;
    }
    
    public int[] getResult() {
        int[] result = new int[12];
        for(int i=0;i<result.length;i++){
            result[i] = this.number*(i+1);
        }
        return result;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
