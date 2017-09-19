/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class SquareTriangleInterface {
    public static void main(String[] args) {
        
        Square r = new Square(5);
        r.area();
        Triangle t = new Triangle(3,4);
        t.area();
    }
}
interface shape2{
    
    void area();
    
}
class square implements shape2{
    double a,area;
    public void area(){
        area=a*a;
        System.out.println("Area of Square is: "+area);
    }
    square(double i){
        a=i;
    }
}

class triangle2 implements shape2{
    double b,h,area;
    public void area(){
        area = .5*b*h;
        System.out.println("The area of Triangle: "+area);
    }
    triangle2(double i, double j){
        b=i;
        h=j;
    }
}
