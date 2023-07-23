package BinarySearch;

import java.util.Scanner;

public class BinarySearchCode {

	private static int binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int left=0, right=arr.length-1, mid;
		
		while(left<=right) {
			
			mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		//binary search applied on sorted array
		int[] arr = {11,22,33,44,55,66,77,88,99}; 
		System.out.println("Enter Number to search in array:");
		int key=sc.nextInt();
		int index = binarySearch(arr,key);

		if(index != -1) {
			System.out.println("Key present at Index No :"+index);
		}else if(index == -1) {
			System.out.println("Not present");
		}

	}

	
}
