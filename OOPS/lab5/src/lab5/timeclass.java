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

    
    class Time{
        int hrs;
        int mins;
        int sec;
        Time(){
            hrs=0;
            mins =0;
            sec=0;
        }
        Time(int hrs,int mins,int sec){
            this.hrs = hrs;
            this.mins = mins;
            this.sec = sec;
        }
        void disp(){
            System.out.println("Hours:" + hrs);
            System.out.println("Minutes:" + mins);
            System.out.println("Seconds:" + sec);
        }
        Time add(Time a, Time b){
            Time c = new Time();
            c.hrs = (a.hrs + b.hrs) +(((a.mins + b.mins) + (a.sec + b.sec)/60)/60);
            c.mins = ((a.mins + b.mins) + (a.sec + b.sec)/60)%60   ;
            c.sec = ((a.sec + b.sec)%60 );
            return c;
        }
        
      
    public static void main(String[] args) {
        Time a = new Time(1,50,39);
        Time b = new Time(2,15,30);
        Time c = new Time();
        c = c.add(a, b);
        c.disp();    
    }
}


