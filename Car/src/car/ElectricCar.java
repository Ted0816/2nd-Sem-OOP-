/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class ElectricCar extends Vehicle{
    private double batteryCapacity;

    public ElectricCar(String make, String model, double RentalPrice, double batteryCapacity ) {
        super(make, model, RentalPrice);
        this.batteryCapacity=batteryCapacity;
    }
     public void displayDetails(){
           super.displayDetail();
           System.out.println(" batteryCapacity :"+ batteryCapacity);
}
      public void displayBatteryInfo() {
        System.out.println("This electric car has a battery capacity of " + batteryCapacity + " kWh.");
}
    public void performMaintenance() {
        System.out.println("Checking battery health and charging system.");
}
    
}