package com.excercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;

public class QuickSort {

	public static void main(String[] args) {

		int array[] = { 2, 8, 4, 7, 1, 3 };

		System.out.println("Before sorting..." + Arrays.toString(array));
		quickSort(array, 0, array.length-1);

		System.out.println("After sorting..." + Arrays.toString(array));

	}

	public static void quickSort(int[] array, int start, int end) {

		if (start < end) {

			int index = getPivot(array, start, end);
			System.out.println("index:"+index+"  "+Arrays.toString(array));

			quickSort(array, start, index - 1);
			quickSort(array, index + 1, end);
		}
	}

	public static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int getPivot(int array[], int start, int end) {
		int index = start;
		int p = end;

		for (int i = start; i < end; i++) {
			if (array[i] <= array[p]) {
				swap(array, i, index);
				index++;
			}
		}

		swap(array, index, p);
		return index;
	}
}
