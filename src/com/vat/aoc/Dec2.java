package com.vat.aoc;

import java.util.*;
import java.util.List;

public class Dec2 {
	List<List<Integer>> nums = new ArrayList<List<Integer> >();
	
	public Dec2(List<List<Integer>> nums){
		this.nums = nums;
	}

    public boolean helper(List<Integer> a) {
		boolean inc =true, dec =true;
		for(int j=0; j<a.size()-1;j++) {
			if(a.get(j) >= a.get(j+1) || Math.abs(a.get(j) - a.get(j+1)) > 3 ) {
				inc = false;
				break;
			}
			
		}
		for(int j=0; j<a.size()-1;j++) {
			if(a.get(j) <= a.get(j+1) || Math.abs(a.get(j) - a.get(j+1)) > 3) {
				dec = false;
				break;
			}
			
		}
		return (inc || dec);
}
    
	public int ans1() {
		int ans = 0;
		for(int i=0;i<nums.size();i++) {
			boolean check =false;
			if (helper(nums.get(i)) == true) 
				check = true;
			if(check)
				ans++;
			}
		return ans;
	}
	
	public int ans2() {
		int ans = 0;
		for(int i=0;i<nums.size();i++) {
			boolean check =false;
			if (helper(nums.get(i)) == true) {
				check = true;
	        }
	        for (int j = 0; j < nums.get(i).size(); j++) {
	            List<Integer> modifiedArr = new ArrayList<>(nums.get(i));
	            
	            modifiedArr.remove(j); 
	            if (helper(modifiedArr)) {
	                check = true;
	            }
	        }
			if(check)
				ans++;	
		}
		
		return ans;
	}

}
