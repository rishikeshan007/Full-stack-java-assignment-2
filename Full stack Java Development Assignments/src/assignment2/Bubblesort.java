package assignment2;
import java.util.Scanner;
public class Bubblesort {
	
	 static void bubbleSort(int[] arr, int n){
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		
		
		
		
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array to perform bubble sort");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("The sorted array in bubble sort is");
		bubbleSort(arr,n);

	}

}
