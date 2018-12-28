//Insertion Sort: One part sorted, another part unsorted. Concept of a hole. 
//Time Complexity O(N^2), Space Complexity O(1)
//To Compile: javac InsertionSort.java and To run: java InsertionSort
//Developed By: Rayhan Hossain(Mukla.C) 2018/12/28




import java.util.Arrays;

class InsertionSort{
	public static void main(String[] args){
		int[] arr = {11, -5, 2, 15, 3, 1, 6, -2};

		doInsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void doInsertionSort(int arr[]){
		for(int i = 0; i < arr.length; i++){
			int value = arr[i];
			int hole = i;
			while(hole > 0 && arr[hole-1] > value){
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = value;
		}
	}
}
