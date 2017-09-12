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
public class Box {
    double width;
    double height;
    double depth;
    Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double vol(){
        double vol = width*height*depth;
        return vol;
    }
    
    public static void main(String[] args) {
        
        Box b = new Box(2,5,2);
        System.out.println("Volume of box is: " + b.vol());
    }
    
}
