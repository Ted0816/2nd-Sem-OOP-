/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public abstract class Vehicle {
   protected String make;
   protected String model;
   protected double RentalPrice;
    
    public Vehicle (String make, String model, double RentalPrice) {
    this.make = make;
    this.model = model;
    this.RentalPrice = RentalPrice;
    
    }
    public void displayDetail(){
    
        System.out.println("Vehicle Detail");
        System.out.println("make"+make);
        System.out.println("model"+model);
        System.out.println("RentalPrice of the vehivle per Day: "+RentalPrice);
    }
    public double CalculateRentalPrice(int days){

        return RentalPrice * days;
    }

    String RentalPrice(int rentalDays) {
        return null;
    }

    void displayDetails() {
    }
     public double CalculateDiscountedRentalCost(int days, double discountPercentage) {
        double discountAmount = (discountPercentage / 100) * (RentalPrice * days);
        return (RentalPrice * days) - discountAmount;
     }
     public abstract void performMaintenance();
}
