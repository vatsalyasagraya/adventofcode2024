package com.vat.aoc;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; 

public class Dec1Runner {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		
		try {
		      File myObj = new File("./src/com/vat/aoc/input1.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String num1 = "",num2 = "";
		        int i=0;
		        while(data.charAt(i) != ' ') {
		        	num1 += data.charAt(i++);
		        }
		        while(data.charAt(i) == ' ') {
		        	i++;
		        }
		        while(i < data.length()) {
		        	num2 += data.charAt(i++);
		        }
		        list1.add(Integer.parseInt(num1));  
		        list2.add(Integer.parseInt(num2));
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		Dec1 first = new Dec1(list1,list2);
		
		long ans1 = first.ans1();
		long ans2 = first.ans2();
		
		System.out.println("Ans of Puzzle 1 is " + ans1 + " and Puzzle 2 is " + ans2);
		
	}

}
