package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TestColle {

	public static void main(String[] args) {
		
		List<String> Names = Arrays.asList("Saket", "Trevor", "Franklin", "Michael");
		 
        List<String> UpperCase = Names.stream().map(String::toUpperCase).collect(Collectors.toList());
        // Changed the characters into upper case after converting it into Stream
 
        UpperCase.forEach(System.out::println);
        // Printed using forEach Terminal Operation
		

	}

}
