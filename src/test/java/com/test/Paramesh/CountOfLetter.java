package com.test.Paramesh;

public class CountOfLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "saitejaiiii";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='i') {
				count++;
			}
		}
		System.out.println(count);

	}

}
