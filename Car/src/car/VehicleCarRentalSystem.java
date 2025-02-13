/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class VehicleCarRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Vehicle[] vehicles = new Vehicle[5];
       
        vehicles[0] = new Car(": Moon", ": Camry", 50.0, 4);
        vehicles[1] = new Truck(": Ford", ": F-150", 70.0, 2.5);
        vehicles[2] = new Motorcycle(": Harley-Davidson", ": Street 750", 40.0, true);
        vehicles[3] = new ElectricCar(": Tesla", ": model 2", 700.0, 10.0);
        vehicles[4] = new ToyCar(": Ferrari", ": F80", 100.0, 25);


        int rentalDays = 3;
        double discount =10.0; // 10.0% discount
        
        // Loop through each vehicle and display its details and rental cost
        for (Vehicle v : vehicles) {
            v.displayDetail();
            System.out.println("Rental Cost for " + rentalDays + " days: $" + v.CalculateRentalPrice(rentalDays));
            System.out.println("Discounted Rental Cost (10% off): $" + v.CalculateDiscountedRentalCost(rentalDays, discount));
            v.performMaintenance();
            System.out.println("-----------------------------");
        }
    }

}
