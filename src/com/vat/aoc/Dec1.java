package com.vat.aoc;

import java.util.*;


public class Dec1 {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public Dec1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		this.list1 = list1;
		this.list2 = list2;
	}
	
	// Puzzle Day1 - First
	
	public long ans1() {
		Collections.sort(list1);
		Collections.sort(list2);
		
		long ans = 0;
		for(int i=0;i<list1.size();i++){
	        ans += Math.abs(list1.get(i) - list2.get(i));
	    }
	    return ans;
		
	}	
	
	

	// Puzzle Day1 - Second
	
	public long ans2(){
		
		ArrayList<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer> >();
		
		long ans =0;
		
		for(int i=0; i<list1.size();i++){
	        int count =0;
	        for(int j = 0; j<list2.size();j++){
	            if(list1.get(i).equals(list2.get(j))) count++;
	        }
//	        System.out.println(count);
	        ArrayList<Integer> a = new ArrayList<Integer>();
	        a.add(list1.get(i));
	        a.add(count);
	        nums.add(a);
	    }
		
		for(int i=0; i<1000; i++) {
//			System.out.println(nums.get(i).get(0)+ " " + nums.get(i).get(1));
			ans += nums.get(i).get(0) * nums.get(i).get(1);
		}
		
		return ans;
		 
		
	}

}
