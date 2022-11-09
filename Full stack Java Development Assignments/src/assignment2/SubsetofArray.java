package assignment2;
import java.util.Arrays;
import java.util.Scanner;
public class SubsetofArray {
	static  boolean checkSubsetofArrays1(int[] arr1,int n1,int[] arr2,int n2)
	{
		int i,j;
		for(i=0;i<n2;i++)
		{
			for(j=0;i<n1;j++)
			{
				if(arr2[i]==arr1[j])
				{
					break;
				}
			}
			if(j==n1) {
				return false;
			}
		}
		return true;
		
	}
	static boolean checkSubsetofArrays2(int[] arr1,int n1,int[] arr2,int n2)
	{
		int i,j;
		for(i=0;i<n1;i++) {
			for(j=0;j<n2;j++) {
				if(arr1[i]==arr2[j]) {
					break;
				}
			}
			if(j==n1) {
				return false;
			}
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of array1");
		int n1 = input.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter the array 1:");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=input.nextInt();
		}
		System.out.println("Enter length of array2");
		int n2 = input.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter the array 2:");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=input.nextInt();
		}
		if(n1>n2)
		{
		
		if(checkSubsetofArrays1(arr1,n1,arr2,n2)) {
			System.out.println("arr2 is subset of arr1");
		}
		else {
			System.out.println("arr2 is not subset of arr1");
		}
		}
		else {
			if(checkSubsetofArrays2(arr1,n1,arr2,n2)) {
				System.out.println("arr1 is subset of arr2");
			}
			else {
				System.out.println("arr1 is not subset of arr2");
			}
		}
		

		
		
		

	}

}
