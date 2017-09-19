/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

abstract class Shape{
    double area;
    abstract void area();
    
}
class Rectangle extends Shape{
    double l,b;
    void area(){
        area = l*b;
        System.out.println("Area of Rectangle is : "+area);
             
    }
    Rectangle(double i,double j){
        l=i;
        b=j;
    }
}
class Triangle extends Shape{
    double base,height;
    void area(){
        area = .5*base*height;
        System.out.println("Area of Triangle  is : "+area);
    }
    Triangle(double i, double j){
        base   = i;
        height = j;
    }
}



public class RectCircleAbstract {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(1,2);
        r.area();
        Triangle t = new Triangle(3,4);
        t.area();
    }
}
