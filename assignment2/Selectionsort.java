package assignment2;
import java.util.Scanner;
public class Selectionsort {
	static void selectionsortAlgorithm(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				if(min!=i)
				{
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the Array:");
		int length = input.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the Array:");
		for(int i=0;i<length;i++)
		{
			arr[i]=input.nextInt();
		}
		
		selectionsortAlgorithm(arr,length);
		System.out.println("The sorted array is:");
		
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
