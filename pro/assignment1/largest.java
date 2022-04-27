package assignment1;
import java.util.*;
public class largest {	
    public static void main(String[] args) 
    {
        Integer arr[] = new Integer[]{14, 84, 12, 57, 62, 63};
        int k=2;
		System.out.println("Array is: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k +" largest elemnts in array are:");
		 Arrays.sort(arr, Collections.reverseOrder());         
       for (int i = 0; i < k; i++) 
          System.out.print(arr[i] + " ");
      }      
  }
