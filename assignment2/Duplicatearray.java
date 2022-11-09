package assignment2;
import java.util.*;
import java.util.Arrays;

public class Duplicatearray {   //Method 1 to find duplicate
	static void findDuplicate1(int[] arr, int n)
	{
		Arrays.sort(arr);
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	static void findDuplicate2(int[]arr , int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = input.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("The duplicate elements in array using findDulicate1 are:");
		findDuplicate1(arr,n);
		System.out.println("The duplicate elements in array using findDulicate2 are:");
		findDuplicate2(arr,n);

	}

}
