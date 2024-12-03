package com.vat.aoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dec3Runner {

	public static void main(String[] args) {
		
		String input = "";
		
		
		try {
		      File myObj = new File("./src/com/vat/aoc/input3.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      while (myReader.hasNextLine()) {
		    	  
		        String data = myReader.nextLine();
		        input += data;
	        	
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
//		System.out.print(input);
		
		Dec3 solve = new Dec3(input);
		
		long ans1 = solve.ans1();
		long ans2 = solve.ans2();
		
		System.out.println("Ans of Puzzle 1 is: " + ans1 + " and Puzzle 2 is " +ans2);

	}

}
