/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Truck extends Vehicle{
    private double payloadcapacity;
    
    public Truck(String make, String model, double RentalPrice, double payloadcapacity) {
        super(make, model, RentalPrice);
        this.payloadcapacity = payloadcapacity;
    }
   
     public void displaydetails(){
           super.displayDetail();
           System.out.println("payload capacity:"+ payloadcapacity + "tons");
}
      public void displayDetails() {
        super.displayDetails();  // Call Vehicle's displayDetails
        System.out.println(" Payload Capacity: " + payloadcapacity);

}
      public double CalculateDiscountedRentalCost(int days, double discountPercentage) {
        double finalDiscount = discountPercentage;
        if (days > 2) {
            finalDiscount += 5.0;
        }
        return super.CalculateDiscountedRentalCost(days, finalDiscount);
}
      public void performMaintenance() {
        System.out.println("Checking payload systems and engine oil for the truck.");
    }
}