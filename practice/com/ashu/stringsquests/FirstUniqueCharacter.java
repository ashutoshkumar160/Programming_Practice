package com.ashu.stringsquests;

public class FirstUniqueCharacter
{
	public static void main(String[] args) 
	 {
		String str = "abbcddcafgg";
		System.out.println(str);
		char ch = ' ';
		char c1= ' ';
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++)
		 {
			for (int j = i + 1; j < str.length(); j++) 
			 {
				if (str.charAt(i) == str.charAt(j)) 
				 {
					System.out.print(ch = str.charAt(i));
				 }
			 }
			if (ch != str.charAt(i))
			{
				System.out.println(c[i]);
				break;
			}
			
		 }
	  }
}
