/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author student
 */
class Game{
    void type(){
        System.out.println("Indoor and Outdoor Games");
                
    }
}
class Cricket extends Game{
    void type(){
        System.out.println("Cricket is an outdoor game");
    }
}
class Chess extends Game{
    void type(){
        System.out.println("Chess is an indoor game");
    }
}


public class TestGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
    }
            
}
