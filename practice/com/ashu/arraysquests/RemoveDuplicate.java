package com.ashu.arraysquests;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) 
	 {
	int a[] = {1, 8, 3, 8, 5, 7, 1, 5, 10};
	int p = 0;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			{
				a[j]=a[0];
			}
		}
		if(a[i]!=a[0])
		{
			p++;
			a[p]=a[i];
		}
	}
	for(int i=0; i<=p; i++)
	{
		System.out.print(" " + a[i]);
	}
		
		
	 }

}
