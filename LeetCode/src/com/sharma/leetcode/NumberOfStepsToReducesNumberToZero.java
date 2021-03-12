package com.sharma;

public class NumberOfStepsToReducesNumberToZero {
	public static void main(String[] args) {
		int num = 123;
		numberOfSteps(num);
	}
	
	 public static int numberOfSteps (int num) {
		 int count = 0;
		 if (num ==0)
			 return num;
		
		 
		 while(num > 0) {
			 if (num % 2 ==0)
				  num = num / 2;
			 else  if (num % 2 !=0){
				 num = num -1;				 
			 }
			 count++;
		 }
		 
		
			 
		 
		return count;
	        
	    }

}
