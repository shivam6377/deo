package assignment1;
import java.util.*;
public class Readdigits 
{
	public static void main(String args[]) 
	{ 
	Scanner s=new Scanner(System.in); 
	System.out.print("Enter the digit:");
	int number=s.nextInt(); 
	int sum=0;  
	while(number!=0) 
	{ 
	 	sum=sum+(number%10); 
		number=number/10; 
	}  
	//System.out.println(sum); 
	 System.out.println("The sum of all digits is " + sum);
	} 
	}  

