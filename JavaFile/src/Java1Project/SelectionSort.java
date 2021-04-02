package Java1Project;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택정렬
		int[] arr = { 8, 7, 3, 1, 6, 0 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[minIdx] > arr[z]) {
					minIdx = z;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}
}
