//Heap Sort: Time Complexity Worst O(NlogN), Space Complexity O(1)
//To Compile: javac HeapSort.java, and To run: java HeapSort
//Developed By: Rayhan Hossain(Mukla.C) 2019/01/15
//MaxHeap: root is the largest item
//MinHeap: root is the smallest item


import java.util.Arrays;

class HeapSort{
	public static void main(String[] args){
		int[] arr = {11, -5, -10, 55, 100, 2, 15, 3, 1, 6};

		doHeapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void doHeapSort(int arr[]){
		maxHeapify(arr, arr.length);
		int heapSize = arr.length;

		while(heapSize >= 2){
			int temp = arr[0];
			arr[0] = arr[heapSize-1];
			arr[heapSize-1] = temp;
			
			heapSize--;
			maxHeapify(arr, heapSize);
		}
	}

	public static void maxHeapify(int[] arr, int heapSize){
		int lastRoot = (heapSize/2) - 1;
		for(int i = lastRoot; i >= 0; i--){
			int left = (2*i) + 1;
			int right = left + 1;

			int max = left;
			if(right < heapSize && arr[right] > arr[left]){
				max = right;
			}

			if(arr[i] < arr[max]){
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
		}
	}
}
