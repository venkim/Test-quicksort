package com.att.quicksort;

public class TQuickSort {

	public static void quicksort(int[] arr, int left, int right){
		// quick sort depends on this partition method
		// it arbitrarily chooses an element and puts all the elements less on left
		// all elements greater on the right
		int index = partition(arr, left , right) ;
		
		// sort the left side
		if (left < index - 1)
			quicksort(arr, left, index - 1) ;
		
		// sort the right side
		if (index < right)
			quicksort(arr, index, right) ;
	}
	public static int partition(int[] arr, int left, int right){
		// arbitrarily choose a point to pivot
		int pivot = arr[(left+right)/2];
		
		// keep looping until left < right
		while (left <= right){
			while (arr[left] < pivot)
				left++;
			
			while (pivot < arr[right])
				right--;
			
			if (left <= right){
				swap(arr, left, right) ;
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap(int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[]  sAry = {20, 30, 40, 5, 10 , 15, 18, 21};
		System.out.println("Array length " + sAry.length );
		System.out.println("Array initial " );
		for (int elem: sAry)
			System.out.print(" " + elem + ",") ;
		System.out.println("");
		quicksort(sAry,0,sAry.length - 1);
		System.out.println("Array after quicksort " );
		for (int elem: sAry)
			System.out.print(" " + elem + ",") ;
	}

}
