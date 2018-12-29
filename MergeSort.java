//Merge Sort: Time Complexity O(NlogN), Space Complexity O(n)
//To Compile: javac MergeSort.java and To run: java MergeSort
//Developed By: Rayhan Hossain(Mukla.C) 2018/12/28


import java.util.Arrays;

class MergeSort{
	public static void main(String[] args){
		int[] arr = {10, 20, 5, -5, 30, -1, 2};

		doMergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void doMergeSort(int[] arr){
		int length = arr.length;
		if(length < 2)
			return;
		int mid = length/2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];

		for(int i = 0; i < left.length; i++){
			left[i] = arr[i];
		}

		for(int j = 0; j < right.length; j++){
			right[j] = arr[mid + j];
		}

		doMergeSort(left);
		doMergeSort(right);
		merge(arr, left, right);
	}

	public static void merge(int[] arr, int[] left, int[] right){
		int l = left.length, r = right.length, i = 0, j = 0, n = 0;
		while(i < l && j < r){
			if(left[i] < right[j]){
				arr[n++] = left[i++];
			}else{
				arr[n++] = right[j++];
			}
		}
		while(i < l){
			arr[n++] = left[i++];
		}
		while(j < r){
			arr[n++] = right[j++];
		}
		
	}
}
