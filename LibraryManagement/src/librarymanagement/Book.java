/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author GERALDINO_CpE121
 */
public class Book {

    private String title;
    private String authors;
    private int copies;

    public Book(String title, String authors, int copies) {
        this.title = title;
        this.authors = authors;
        this.copies = copies;
    }

    public void DisplayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Authors: " + authors);
        System.out.println("Copies: " + copies);
    }

    public String gettitle() {
        return title;
    }

    public String settitle(String title) {
        return title;
    }

    public String getcopies() {
        return title;
    }

    public String setcopies(String copies) {
        return title;
    }
}
