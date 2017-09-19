/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

interface Shape2{
    abstract void area();
    
}
class Rectangle2 implements Shape2{
    double l,b,area;
    public void area(){
        area = l*b;
        System.out.println("Area of Rectangle is : "+area);
             
    }
    Rectangle2(double i,double j){
        l=i;
        b=j;
    }
}
class Triangle2 implements Shape2{
    double base,height,area;
    public void area(){
        area = .5*base*height;
        System.out.println("Area of Triangle  is : "+area);
    }
    Triangle2(double i, double j){
        base   = i;
        height = j;
    }
}




public class RectCircleInterface {
        public static void main(String[] args) {
        
        Rectangle r = new Rectangle(1,2);
        r.area();
        Triangle t = new Triangle(3,4);
        t.area();
    }
}
