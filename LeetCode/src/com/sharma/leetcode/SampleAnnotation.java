package com.sharma;



@interface Todo {
	public enum Priority {LOW,MEDIUM,HIGH};
	public enum Status {STARTED,NOTSTARTED};
	public String author() default "Raj";
	
}

public class SampleAnnotation {

}
