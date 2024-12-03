package com.vat.aoc;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class Dec2Runner {

	public static void main(String[] args) {

		List<List<Integer>> nums = new ArrayList<List<Integer> >();
		
		
		try {
		      File myObj = new File("./src/com/vat/aoc/input2.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		    	  
		        String data = myReader.nextLine();
	        	List<Integer> list = new ArrayList<Integer>();
		        int i=0;
		        while(i < data.length()) {
		        	String num1 = "";
		        	while(i < data.length() && data.charAt(i) != ' ' ) {
			        	num1 += data.charAt(i++);
			        }
		        	i++;
		        	list.add(Integer.parseInt(num1));
		        }
		        
		        nums.add(list);
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
//
		Dec2 first = new Dec2(nums);
		
		long ans1 = first.ans1();
		long ans2 = first.ans2();
		
		System.out.println("Ans of Puzzle 1 is: " + ans1 + " and Puzzle 2 is " +ans2);
		
	}

}
