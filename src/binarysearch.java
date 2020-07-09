import java.util.Scanner;
import java.io.*;
public class binarysearch {
 
	public static void main(String[] args) {
		System.out.println("Enter number of elements of array");
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		int[] arr=new int[100];
		int[] array=new int[100];

		for(int i=0;i<n;i++) {
			System.out.println("Enter number: ");
			arr[i]=Integer.parseInt(s.nextLine());
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		array=selectionSort(arr);
		System.out.println("Enter element to search");
		int number=Integer.parseInt(s.nextLine());
		binarySearch(array,n,number);
	}
	
	public static int[] selectionSort(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        int minId = i;
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < min) {
	                min = array[j];
	                minId = j;
	            }
	        }
	        // swapping
	        int temp = array[i];
	        array[i] = min;
	        array[minId] = temp;
	        return array;
	    }
	}
   public static void binarySearch(int[] array, int n, int number) {
	   int high,mid,low;
	   low=0;
	   high=n-1;
	   mid=(low+high)/2;
	   while(low<=high) {
		   if(number==array[mid]) {
			   System.out.print("Found");
			   return;
		   }
		   else if(number<array[mid]) {
			   high=mid-1;
		   }
		   else {
			   low=mid+1;
		   }
	   }
	   System.out.print("Not found");
   }
}
