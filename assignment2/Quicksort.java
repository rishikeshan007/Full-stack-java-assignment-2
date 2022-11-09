package assignment2;
import java.util.Scanner;
public class Quicksort {
	static int makePartitionarray(int low,int high,int[]arr) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i<j)
		{
			while(arr[i]<=pivot)
			{
				i++;
			}
			while(arr[j]>pivot)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;
	}
	
	static void quickSortimplementation(int low,int high,int[] arr)
	{
		if(low<high)
		{
			int j = makePartitionarray(low,high,arr);
			quickSortimplementation(low,j,arr);
			quickSortimplementation(j+1,high,arr);
					
		}
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n =input.nextInt();
		int[] arr = new int[n];
		System.out.println("The array is:");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		int low = 0;
		int high = n-1;
		System.out.println("partition index is:"+makePartitionarray(low,high,arr));
		quickSortimplementation(low,high,arr);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
