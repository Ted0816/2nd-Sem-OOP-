/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmeticseriessum;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Sum {
      private int a;

    public Sum(int n) {
        this.a = n;
    }

    public int ArithmeticSeriesSum() {
        int sum = 0;
        for (int i = 1; i <= a; i++){
        sum += i;
        }
        return sum;
    }

    public void displayResult() {
       int sum = ArithmeticSeriesSum ();
        System.out.println("The sum of this arithmetic series from 1 to "+a+"\nis "+sum);
    }
}
