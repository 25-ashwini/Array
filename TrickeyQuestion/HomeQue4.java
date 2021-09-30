package Assignment;

import java.util.Scanner;

public class HomeQue4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<10; i++)  
		{    
		a[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		  
		for (int i=0; i<10; i++)   
		{  
		System.out.print(a[i]+" ");  
		}  
		int j=0;
		for(int i = b.length-1;i>=0;i--) {
			b[i]=a[j];
			j++;
		}
		System.out.println("\n"+"New array elements in reverse order");
		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		}
	}


