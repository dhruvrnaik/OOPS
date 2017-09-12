/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;
public class student_details {
    Scanner sc=new Scanner(System.in);
    static String clg="MIT";
    String name;
    int id;
    public void getdata(){
    name=sc.nextLine();
    id=sc.nextInt();
    
    
}
    public void display(student_details obj)
    {
        System.out.println("name is "+obj.name+"\nid is "+obj.id+"\ncollege name "+clg);
    }
    public static void main(String[] args) {
      Scanner sc1=new Scanner(System.in);
        System.out.println("enter number of students");
        int n=sc1.nextInt();
        student_details obj1[]=new student_details[n];
        for(int i=0;i<n;i++)
        {
            obj1[i]=new student_details();
            obj1[i].getdata();
            obj1[i].display(obj1[i]);
        }
        
    }
}
      
        
    
    
    

