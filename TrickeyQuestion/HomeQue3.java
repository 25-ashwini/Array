//Program for finding Positive, Negative, Odd, Even and no of Zeros in the array.
package Assignment;
import java.util.Scanner;
public class HomeQue3 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int[] array=new int[20];
	  int PosNum=0;
	  int NegNum=0;
	  int OddNum=0;
	  int EvenNum=0;
	  int ZeroNum=0;
	  for(int i=0;i<array.length;i++) {
		  System.out.println("Enter elements:");
		  array[i]=sc.nextInt();
		  if(array[i]>0) {
			  PosNum++;
		  }
		  else if(array[i]<0) {
			  NegNum++;
		  }
		  else {
			  ZeroNum++;
		  }
		  if(array[i]%2==0) {
			  EvenNum++;
		  }
		  else {
			  OddNum++;
		  }
	  }
	  System.out.println("Positive Numbers:" +PosNum);
	  System.out.println("Negative Numbers:" +NegNum);
	  System.out.println("Even Numbers:" +EvenNum);
	  System.out.println("Odd Numbers:" +OddNum);
	  System.out.println("0 Numbers:" +ZeroNum);
  }
  
}
