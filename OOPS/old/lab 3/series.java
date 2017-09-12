/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author student
 */
import java.util.*;
public class series {
    public void sinseries(int x,int n)
    {
       
        int z=1;
        for(int i=1;i<=2*n-1;i=i+2)
        {
            int fact=1;
            for(int j=1;j<=i;j++)
            {
                fact=fact*j;}
            double a1=Math.pow(x,i)/fact;
            z=z+1;
            double sum1=Math.pow(-1, z);
                    System.out.println(a1*sum1);
            
            
        }
    }
    public void sum(int m)
    {
        int sum=0;
        for(int i=1;i<=m;i++)
             sum=sum+(1/i*i);
            System.out.println(m);
    }
    public static void main(String[] args) {
        series obj= new series();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.sinseries(a,b);
        obj.sum(b);
    }
    
    
}
