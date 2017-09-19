/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
abstract class shape{
    double area;
    abstract void area();
    
}
class Square extends shape{
    double a;
    void area(){
        area=a*a;
        System.out.println("Area of Square is: "+area);
    }
    Square(double i){
        a=i;
    }
}

class triangle extends shape{
    double b,h;
    void area(){
        area = .5*b*h;
        System.out.println("The area of Triangle: "+area);
    }
    triangle(double i, double j){
        b=i;
        h=j;
    }
}
public class SquareTriangleAbstract {
        public static void main(String[] args) {
        
        Square r = new Square(5);
        r.area();
        Triangle t = new Triangle(3,4);
        t.area();
    }
}
