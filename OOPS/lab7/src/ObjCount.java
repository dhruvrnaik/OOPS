/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */


class ObjCount{
	static int count;
	int x,y;
	ObjCount(){
		++count;	
	}
	public static void main(String[] args){
		ObjCount[] a = new ObjCount[5];
                for(int i=0;i<5;i++)
                    a[i] = new ObjCount();
		System.out.println("Count:"+ count);	
	}
}

                                                                                                                                                                                                                                                                                                                                                                                                                       