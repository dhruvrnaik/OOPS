/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Book {
    Scanner sc = new Scanner(System.in);
    String Title;
    String Author;
    int Edition;
    Book(){
        System.out.println("Enter Book Title: ");
        Title = sc.next();
        System.out.println("Enter Author Name: ");
        Author = sc.next();
        System.out.println("Enter Edition: ");
        Edition = sc.nextInt();
    }
    void disp(){
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Edition: " + Edition);
    }
    public static void main(String[] args) {
        Book e = new Book();
        e.disp();
        
    }
    
}
