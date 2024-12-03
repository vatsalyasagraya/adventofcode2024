package com.vat.aoc;

public class Dec3 {
	
	String input = "";
	
	public Dec3(String input) {
		this.input = input;		
	}
	
//	Puzzle Day2 - First
    
	public long ans1() {
		long ans = 0;
		int i = 0;
		while(i<input.length()) {
			if(input.charAt(i) == 'm' && input.charAt(i+1) == 'u' && input.charAt(i+2) == 'l' && input.charAt(i+3) == '('  ) {
				int j = i+4;
				String num1 ="", num2 ="";
				
				while(input.charAt(j) <= '9' && input.charAt(j) >= '0')
					num1+=input.charAt(j++);
				
				if(input.charAt(j) != ',') {i++;continue;}
				j++;
				
				while(input.charAt(j) <= '9' && input.charAt(j) >= '0')
					num2+=input.charAt(j++);
				
				if(input.charAt(j) != ')') {i++;continue;}
				
				
				ans += Integer.parseInt(num1) * Integer.parseInt(num2);
			}
			
			i++;					
		}
		
		return ans;
	}
	
	
	//	Puzzle Day2 - Second
	
	public long ans2() {
		long ans = 0;
		int i = 0;
		boolean check = true;
		while(i<input.length()) {
			if(input.charAt(i) == 'd' && input.charAt(i+1) == 'o' && input.charAt(i+2) == '(' && input.charAt(i+3) == ')' )
				check = true;
			if(input.charAt(i) == 'd' && input.charAt(i+1) == 'o' && input.charAt(i+2) == 'n' && input.charAt(i+3) == '\'' && input.charAt(i+4) == 't' && input.charAt(i+5) == '(' && input.charAt(i+6) == ')' )
				check = false;	
			if(check && input.charAt(i) == 'm' && input.charAt(i+1) == 'u' && input.charAt(i+2) == 'l' && input.charAt(i+3) == '('  ) {
				int j = i+4;
				String num1 ="", num2 ="";
				
				while(input.charAt(j) <= '9' && input.charAt(j) >= '0')
					num1+=input.charAt(j++);
				
				if(input.charAt(j) != ',') {i++;continue;}
				j++;
				
				while(input.charAt(j) <= '9' && input.charAt(j) >= '0')
					num2+=input.charAt(j++);
				
				if(input.charAt(j) != ')') {i++;continue;}
				
				
				ans += Integer.parseInt(num1) * Integer.parseInt(num2);
			}
			
			i++;					
		}
		
		return ans;
	}

}
