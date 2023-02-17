package day1;


import java.util.Arrays;
//import java.util.Random;

public class BinarySearchChallenge {

    public void Start(){
        
        int[] array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 1;
    	

        Arrays.sort(array);

        //sort array
        int result = binarySearch(array,key);

        //Print values in array after sort
        System.out.println(result);

    }

    int binarySearch(int arr[], int key){
       // put your code here.
    	int first = 0;
    	int last = arr.length - 1;
    	
    	while(last >= first) {
    		int middle = (first + last)/2;
    		
    		if(arr[middle] == key) {
    			return middle;
    		} else if(arr[middle] < key) {
    			first = middle + 1;
    		} else if(arr[middle] > key) {
    			last = middle - 1;
    		}
    	}
    	return -1;
    	
    	
       
    }
    
       public static void main(String[] args) {
        BinarySearchChallenge main = new BinarySearchChallenge();
        main.Start();
    }
}