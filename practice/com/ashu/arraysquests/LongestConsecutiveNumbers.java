//koi array h jisme lagatar no ko find karna h ex-{23,42,5,6,32,54,7,8,12,81}-isme {5,6,7,8} ye lagatar 

package com.ashu.arraysquests;

public class LongestConsecutiveNumbers 
 {
 public static void main(String[] args) 
  {
	int a[] = {23,42,5,6,32,54,7,8,12,81};
	int t;
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
   }
	for(int i=0; i<a.length; i++)
	{
		System.out.print(a[i]+ ", ");
	}
   }
  }