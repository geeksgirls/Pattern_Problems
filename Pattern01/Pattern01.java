package com.kedari.pattern;

public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		
		char c ='A';
		int len =0;
		StringBuilder sb = new StringBuilder("");
		
		
		
		for(int i = num; i>=1; i--){
			
			if(i < num){
			System.out.println("");
			}
			for(int j=2*(num-i); j>0; j--) 
            { 
                // printing spaces 
                sb.append(" ");
            } 
			for(int k = 1; k<=i; k++){
				
				sb.append(c);
				sb.append(" ");
				
				c +=1;
			}
			
			sb.delete((sb.length()-1),sb.length());
			System.out.print(sb.toString());
			c ='A';
			len = sb.length();
			sb.delete(0,len);
			
			
		}
		

	}

}
