package assignment1;
import java.util.Scanner;
public class equal {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
System.out.print("Enter first number:");
int num1=in.nextInt();
System.out.print("Enter Second number:");
int num2=in.nextInt();
System.out.print("Enter Third number:");
int num3=in.nextInt();
System.out.print("Enter fourth number:");
int num4=in.nextInt();
if(num1 == num2 && num2 == num3 && num3==num4)
{
	System.out.print("Numbers are equal");
}
else {
	System.out.print("Numbers are not equal");
}
}
}
