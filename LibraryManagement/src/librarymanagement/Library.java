/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Library {
    private List<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void UpdateTitle(Book book, String NewTitle) {
        System.out.println("Update Book Title" + book.gettitle() + "\" to \"" + NewTitle);
        book.settitle(NewTitle);
    }

    public void attemptPrimitiveChange(int number) {
        System.out.println("Inside method before change: " + number);
        number = 999;
        System.out.println("Inside method after change: " + number);
    }

    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.DisplayInfo();

        }
    }
}
