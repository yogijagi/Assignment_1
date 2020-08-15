package com.ashokit;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class FindThirdLargestElements {

	public static void main(String[] args) {
		int a[] = {6, 8, 1, 9, 2, 1, 10, 12};
		/*
		 * Arrays.sort(a); System.out.println(a[a.length-3]);
		 */
		FindThirdLargestElements.find(a,a.length);
	}

	private static void find(int[] a, int length) {
		int temp=0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			}
		}
	for(int x:a) {
	System.out.println(x);
	}
	
	
	System.out.println(a[a.length-3]);
	}

}
