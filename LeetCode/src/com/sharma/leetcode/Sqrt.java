package com.sharma;

public class Sqrt {
	public static void main(String[] args) {
		int x = 8;
		System.out.println(mySqrt(x));
	}
	
	public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        
        
       return mySqrt(x/2);
        
    }

}
