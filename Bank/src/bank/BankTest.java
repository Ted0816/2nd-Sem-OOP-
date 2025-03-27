/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author GERALDINO_CpE121
 */
public class BankTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
           BankAccount account1 = new BankAccount("1", 1000);
        BankAccount account2 = new BankAccount("2", 500);
        
        System.out.println("Before Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        Bank bank = new Bank();
        bank.transferMoney(account1, account2, 200.00);

        System.out.println("After Transfer:");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
    }
    

