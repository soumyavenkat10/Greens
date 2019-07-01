package com.greens.corejava;

public class StringReverse {

	public static void main(String[] args) {

		String name="Greens";
		String res="";
		for (int i = name.length()-1; i >=0; i++) {
			char ch=name.charAt(i);
			res=res+ch;
		}
	}

}
