package com.encryption.Cryptography;

import java.util.Scanner;

public class StringDivision 
{
	public String[] divide(String s)
	{
		String[] arr = {"", ""};
		for(int i = 0 ; i < s.length() ; i += 2)    //Odd positions
		{
			arr[0] += s.charAt(i);
		}
		for(int i = 1 ; i < s.length() ; i += 2)    //Odd positions
		{
			arr[1] += s.charAt(i);
		}
		return arr;
	}
	
	public String merge(String s1, String s2)
	{
		String s = "";
		if(s1.length() == s2.length())
		{
			for(int i = 0 ; i < s1.length() ; i++)
			{
				s += s1.charAt(i);
				s += s2.charAt(i);
			}
		}
		else
		{
			if(s1.length() > s2.length())
			{
				for(int i = 0 ; i < s2.length() ; i++)
				{
					s += s1.charAt(i);
					s += s2.charAt(i);
				}
				s += s1.charAt(s1.length() - 1);
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		StringDivision division = new StringDivision();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ob = division.divide(s);
		System.out.println(ob[0].length() + " " + ob[0]);
		System.out.println(ob[1].length() + " " +ob[1]);
		String concat = division.merge(ob[0], ob[1]);
		System.out.println(s.equals(concat));
	}
}
