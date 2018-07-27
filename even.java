 java.util.*;
 java.lang.*;
 java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("enter a number:");
		int num =reader.nextInt();
		if (num % 2 == 0)
		System.out.print("Even");
		else if (num % 2!=0)
		System.out.print("Odd");
		else
		System.out.print("Invalid");
	}
}
