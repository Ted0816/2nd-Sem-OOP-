/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Car extends Vehicle {
    private int numberofwheels;
    
    public Car(String make, String model, double RentalPrice, int numberofwheels) {
        super(make, model, RentalPrice);
        this.numberofwheels = numberofwheels;
    }
    public void displaydetails(){
           super.displayDetail();
           System.out.println("numberofwheels" + numberofwheels);
    }
     public void displayDetails() {
        super.displayDetails();  // Call Vehicle's displayDetails
        System.out.println("Number of wheels " + numberofwheels);

    }
      public void performMaintenance() {
        System.out.println("Performing general car maintenance.");
      }
    }

