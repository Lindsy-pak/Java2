package Java1Project;

import java.util.Arrays;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45};
//		System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}
	public static String toString(int[] arr) { /* 배열은 무조건 for와 같이 쓴다. */
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			if(i != 0) {
				str += ", ";
			}
			str += arr[i];
		}
		return String.format("[%s]", str);
		
//		String str = "" + arr[0];
		/* String str = Integer.toString(arr[0]); */
//		for(int i=1; i<arr.length; i++) {
//			str += ", " + arr[i];
//		}
		
//		String result = "";
//		for(int i=0; i<arr.length; i++) {
//			result += (i <arr.length-1) ? (arr[i] + ", ") : (arr[i]);  
//		}
//		return String.format("[%s]", result);
		
		
	}

}
