package Java1Project;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		

		// 7, 8, 3, 1, 6
		// 7, 3, 8, 1, 6
		// 7, 3, 1, 8, 6
		// 7, 3, 1, 6, 8
		int[] arr = { 8, 7, 3, 1, 6 };
		
		for(int i=1; i<arr.length; i++) {
			System.out.println();
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr)); //중간 과정을 보기 위함 
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("--------------------------------------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println();
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr)); //중간 과정을 보기 위함 
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("--------------------------------------------");
		
		for(int i=arr.length-1; i>0; i--) {
			System.out.println();
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr)); //중간 과정을 보기 위함 
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		

		
	}
}
