/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author GERALDINO_CpE121
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a Library instance
        Library library = new Library();

        // Create and add Book objects to the library
        Book book1 = new Book("1984", "George Orwell", 5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 3);
        library.addBook(book1);
        library.addBook(book2);

        // Display library details before updates
        System.out.println("Before update:");
        library.displayLibrary();

        // Task A: Update the title of book1 by passing the object
        library.UpdateTitle(book1, "Nineteen Eighty-Four");
         library.UpdateTitle(book2, "Four Season");

        // Display library details after updating book title
        System.out.println("\nAfter updating book title:");
        library.displayLibrary();

        // Task B: Demonstrate passing a primitive (int)
        int originalNumber = 123;
        System.out.println("\nOriginal number before method call: " + originalNumber);
        library.attemptPrimitiveChange(originalNumber);
        System.out.println("Original number after method call: " + originalNumber);
    }
}

    
    

