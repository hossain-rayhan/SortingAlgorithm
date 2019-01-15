//Quick Sort: Avg Time Complexity O(NlogN), Worst O(N^2), 
//In place sorting algorithm, Space Complexity O(1)
//Sometimes Better than MergeSort when input size is small (10 to 100)
//To Compile: javac QuickSort.java and To run: java QuickSort
//Developed By: Rayhan Hossain(Mukla.C) 2019/01/14
//
//Concept of Pivot and Partition
//https://www.youtube.com/watch?v=SLauY6PpjW4


import java.util.Arrays;

class QuickSort{
	public static void main(String[] args){
		int[] arr = {10, 20, 5, -5, 30, -1, 2};

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr, int left, int right){
		if(left >= right)
			return;

		int pivot = arr[(left + right)/2];
		int pivotIndex = partition(arr, left, right, pivot);
		quickSort(arr, left, pivotIndex - 1);
		quickSort(arr, pivotIndex, right);
	}

	public static int partition(int[] arr, int left, int right, int pivotValue){
		while(left <= right){
			while(arr[left] < pivotValue){
				left++;
			}
			while(arr[right] > pivotValue){
				right--;
			}
			if(left <= right){
				//swap the values
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}
}
