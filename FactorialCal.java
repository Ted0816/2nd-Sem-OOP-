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
    
    private int n;

    public FactorialCal(int n) {
        this.n = n;
    }

    public long calculateFactorial() {
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void displayResult() {
        System.out.println("The factorial of: " + n + "\nis: " + calculateFactorial());
    }

}

