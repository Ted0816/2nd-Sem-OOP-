/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Motorcycle extends Vehicle {

    private boolean hasHelmetRental;

    // Constructor override: calls super constructor and initializes hasHelmetRental
    public Motorcycle(String make, String model, double rentalPrice, boolean hasHelmetRental) {
        super(make, model, rentalPrice);
        this.hasHelmetRental = hasHelmetRental;
    }

    // Method override: extend displayDetails to include helmet rental info
    public void displayDetails() {
        super.displayDetail();
        System.out.println("Helmet Rental Available: " + (hasHelmetRental ? "Yes" : "No"));

    }
      public void performMaintenance() {
        System.out.println("Inspecting brakes and tire pressure for the motorcycle.");
    }
}
