/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author student
 */
import java.util.*;
public class operations {
    private double num;
    Scanner sc=new Scanner(System.in);
    
    public boolean isZero()
    {
        num=sc.nextInt();
        if(num<1&& num>-1)
            return true;
        else 
            return false;
    }
    public boolean isPositive()
    {num=sc.nextInt();
        
        if(num>0)
            return true;
        else 
            return false;
    }
    public boolean isNegative()
    {
        num=sc.nextInt();
        if(num<0)
            return true;
        else
            return false;
    }
    public boolean isOdd()
    {
        num=sc.nextInt();
        if(num%2==0)
            return false;
        else 
            return true;
        
    }
    public boolean isEven()
    {
        num=sc.nextInt();
        if(num%2==0)
            return true;
        else
            return false;
    }
    public boolean isArmstrong()
    {num=sc.nextInt();
    int n=(int)num;
        
        int rem; int sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
            
        }
        if(sum==num)
            return true;
        else
            return false;
            
        
    }
    public static void main(String[] args) {
        operations obj=new operations();
        System.out.println("isZero"+obj.isZero());
        System.out.println("isPositive"+obj.isPositive());
        System.out.println("isNegative"+obj.isNegative());
        System.out.println("isodd"+obj.isOdd());
        System.out.println("isEven"+obj.isEven());
        System.out.println("isArmstrong"+obj.isArmstrong());
        
    }
    
    
    
}
