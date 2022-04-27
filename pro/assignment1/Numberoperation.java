package assignment1;
import java.util.Scanner;

public class Numberoperation
{
	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		
		double num1,num2,sum,difference,product,average,distance,maximum, minimum;
		
		System.out.print("Please enter the 1st number: ");
		num1 = input.nextDouble();
		
		System.out.print("Please enter the 2nd number: ");
		num2 = input.nextDouble();
		
		input.close();
		
		sum = num1 + num2;
		difference = num1 - num2;
		product = num1 * num2;
		average = (num1 + num2) / 2;
		distance = Math.abs(difference);
		maximum = Math.max(num1, num2);
		minimum = Math.min(num1, num2);
		
		System.out.printf("\nSum: %.2f\n", sum);
				
		System.out.printf("Difference: %.2f\n",difference);
		
		System.out.printf("Product: %.2f\n", product);
		
		System.out.printf("Average: %.2f\n", average);
		
		System.out.printf("Distance: %.2f\n", distance);
		
		System.out.printf("Maximum: %.2f\n", maximum);
		
		System.out.printf("Minimum: %.2f", minimum);
	}
}
 
