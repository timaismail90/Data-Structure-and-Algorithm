package day2;
//import java.util.ArrayList;

public class BubbleSortExample {
	
	
		public static int[] bubbleSort(int[] arr) {
			int n = arr.length - 1;
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n - i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			return arr;
		}
		
		public static void printArray(int[] arr) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		public static void main(String[] args)
		{
			int[] arr = {5, 4, 3, 2, 0, 1};
			printArray(arr);
			
			int[] result = bubbleSort(arr);
			printArray(result);
		}
	}
	

