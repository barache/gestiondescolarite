package test;

import java.util.Arrays;

public class Demo {

	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}

	public static void main(String args[]){
		Demo obj = null;
		System.out.println(obj.foo());
	}
}
