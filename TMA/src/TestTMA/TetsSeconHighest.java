package TestTMA;

import java.util.Arrays;


public class TetsSeconHighest {

	public static void main(String[] args) {

		int arr[] = {100, 14, 46, 47, 94, 94, 52 ,86 ,36, 94, 89};
		int secon = arr.length;
		Arrays.sort(arr);
		System.out.println("Second largest number is:" + arr[secon - 2]);
		System.out.println("Largest Number is:" + arr[secon - 1]);
	}

}
