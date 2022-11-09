package ineuron.main;

public class DemoApp {

	public static void main(String[] args) {
		
		int[] a = {10,20,30};
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String name = "sachin";
		int count = name.toUpperCase().length();
		System.out.println("Length of string is :"+count);
	}

}
