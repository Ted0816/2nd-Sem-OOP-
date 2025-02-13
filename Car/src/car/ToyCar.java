/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class ToyCar extends Vehicle{
    private int durability;
    
     public ToyCar(String make, String model, double RentalPrice, int durability) {
        super(make, model, RentalPrice);
        this.durability = durability;
}
  public void displayDetails(){
           super.displayDetail();
           System.out.println(" batteryCapacity :"+ durability);
}
      public void displayBatteryInfo() {
        System.out.println("This toy can only handle this amount og weight  " + durability + " KG.");
}
    public void performMaintenance() {
        System.out.println(" This toy is for Kids only .");
}
}
