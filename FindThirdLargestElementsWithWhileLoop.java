package com.ashokit;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class FindThirdLargestElementsWithWhileLoop {

	public static void main(String[] args) {
		int a[] = { 6, 8, 1, 9, 2, 1, 10, 12 };
		/*
		 * Arrays.sort(a); System.out.println(a[a.length-3]);
		 */
		FindThirdLargestElementsWithWhileLoop.find(a, a.length);
	}

	private static void find(int[] a, int length) {
		int temp = 0,i=0;
		while(i < length) {
			int j=i;
			while(j+1 < length) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				j++;
			}
			i++;
		}
		for (int x : a) {
			System.out.println(x);
		}

		System.out.println(a[a.length - 3]);
	}

}
