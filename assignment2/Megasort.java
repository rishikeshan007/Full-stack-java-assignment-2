package assignment2;
import java.util.Scanner;
public class Megasort{
	 void merge(int arr[], int left, int mid, int right)
	    {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;
	        int Left[] = new int[n1];
	        int Right[] = new int[n2];
	        for (int i = 0; i < n1; ++i)
	        {
	            Left[i] = arr[left + i];
	        }
	        for (int j = 0; j < n2; ++j) {
	            Right[j] = arr[mid + 1 + j];
	        }
	        int i = 0, j = 0;
	        int k = left;
	        while (i < n1 && j < n2) {
	            if (Left[i] <= Right[j]) {
	                arr[k] = Left[i];
	                i++;
	            }
	            else {
	                arr[k] = Right[j];
	                j++;
	            }
	            k++;
	        }
	       while (i < n1) {
	            arr[k] = Left[i];
	            i++;
	            k++;
	        }
	       while (j < n2) {
	            arr[k] = Right[j];
	            j++;
	            k++;
	        }
	    }
	 
	    
	    void sortingAlgorithm(int arr[], int l, int r)
	    {
	        if (l < r) {
	            
	            int m = l + (r - l) / 2;
	            sortingAlgorithm(arr, l, m);
	            sortingAlgorithm(arr, m + 1, r);
	            merge(arr, l, m, r);
	        }
	    }
	    static void printMergedArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	    	Scanner input = new Scanner(System.in);
	    	System.out.println("Enter the size of array");
	    	int length = input.nextInt();
	    	int []arr = new int[length];
	    	System.out.println("Enter the array");
	    	for(int i=0;i<length;i++)
	    	{
	    		arr[i]=input.nextInt();
	    	}
	        Megasort mG1 = new Megasort();
	        mG1.sortingAlgorithm(arr, 0, arr.length - 1);
	        System.out.println("\nSorted array");
	        printMergedArray(arr);
	    }
}
