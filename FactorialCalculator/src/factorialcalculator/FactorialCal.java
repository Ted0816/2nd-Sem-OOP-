/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorialcalculator;

/**
 *
 * @author GERALDINO_CpE121
 */
public class FactorialCal {
    
    private int a;

    public FactorialCal(int n) {
        this.a = n;
    }

    public long calculateFactorial() {
        if (a == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void displayResult() {
        System.out.println("The factorial of: " + a + "\nis: " + calculateFactorial());
    }

}

