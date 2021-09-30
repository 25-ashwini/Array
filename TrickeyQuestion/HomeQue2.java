package Assignment;

import java.util.Scanner;

public class HomeQue2 {
	public static void main(String[] args)   
	{  
	int n, num, flag=0;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();  
		int[] array = new int[10]; 
		if(n>0) {
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<10; i++)  
		{    
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		  
		for (int i=0; i<10; i++)   
		{  
		System.out.print(array[i]+" ");  
		}  
		System.out.println("\n"+"Enter the Number");
		num=sc.nextInt();
	    for(int i=0;i<10;i++)
	    {
	        if(array[i]==num)
	        {
	            System.out.println("Element "+num+" found at "+i+" position");
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	        System.out.println("Element "+num+" not found");
	    }
		}  
	else {
		System.out.println("Enter valid array");
	}
	}

}
