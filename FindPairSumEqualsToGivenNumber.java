package com.ashokit;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class FindPairSumEqualsToGivenNumber {

	public static void main(String[] args) {
		int a[] = {3, 6, 8, -8, 10, 8};
		int sum=16;
		/*
		 * Arrays.sort(a); System.out.println(a[a.length-3]);
		 */
		FindPairSumEqualsToGivenNumber.find(a, a.length,sum);
	}

	private static void find(int[] a, int length,int sum) {
		int temp = 0,i=0;
		while(i < length) {
			int j=i;
			while(j+1 < length) {
				if (sum==a[i]+a[j]) {
				System.out.println("Sum : "+sum+" pair "+" ( "+a[i]+ ","+a[j]+" ) ");
				}
				j++;
			}
			i++;
		}
		/*
		 * for (int x : a) { System.out.println(x); }
		 */
	}

}
