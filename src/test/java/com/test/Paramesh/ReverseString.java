package com.test.Paramesh;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sai Teja";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}
		System.out.println(r);
		System.out.println("Working the code");
	}

}
