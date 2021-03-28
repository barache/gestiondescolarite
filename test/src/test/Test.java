package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Test {

	public static void main(String [] args)	{
		
		List<Integer> list2 = Arrays.asList(-9,-18, 0, 25, 4);
		  
        System.out.println("The sorted stream is : ");
  
        // displaying the stream with elements
        // sorted in natural order
        //list2.stream().sorted().forEach(System.out::println);
		
        Optional<Integer> answer = list2.stream().findAny();
        System.out.println(answer);
        
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("ABC");
		list1.add("10");
		list1.add("2");
		list1.add("0");
		
		//list1.stream().sorted().forEach(System.out::println);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(8);
		list.add(15);
		int sum = list.stream().mapToInt(i -> i).sum();

		//System.out.println(sum);
	}

}