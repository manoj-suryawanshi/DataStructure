package LinearSearch;

import java.util.Scanner;

public class LinearSearchCode {
	private static int linearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub

		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		int[] arr = {88,33,66,99,11,77,55,12}; 
		System.out.println("Enter Number to search in array:");
		int key=sc.nextInt();
		int index = linearSearch(arr,key);

		if(index != -1) {
			System.out.println("Key present at Index No :"+index);
		}else if(index == -1) {
			System.out.println("Not present");
		}

	}



}
