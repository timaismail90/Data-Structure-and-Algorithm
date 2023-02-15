package day2;
	public class BubbleSort {

		   //Method to perform bubble sort on an array of integers
		    public static void bubbleSort(int[] array) {
		        // Outer loop performs multiple passes through the array
		        int k = array.length;
		        for ( int i = 0; i < k; i++) {
		            // Inner loop performs comparisons between adjacent elements
		            for (int j = 0; j< k-1-i; j++) {
		                // If the current element is greater than the next element, they are swapped
		                if (array[j]> array[j+1]) {
		                    int temp = array[j];
		                    array[j] = array[j+1];
		                    array[j+1] = temp;
		                   
		                }
		            }
		            
		        }
		        
		    }
		//Do not modify this code
		    public static void main(String[] args) {
		        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};

		        // Call the bubble sort method on the array
		        bubbleSort(array);

		        System.out.println("Sorted array:");
		        // Print the sorted array
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		

}
