package com.ashokit;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximumDifferenceInArray {

	public static void main(String[] args) {
		int a[] = {9, 2, 12, 5, 4, 7, 3, 19, 5};
		int len = a.length;
		
		  Arrays.sort(a); 
		  System.out.println(a[len-1]-a[0]);
		  
	}
		 
		/*FindMaximumDifferenceInArray.find(a,a.length);
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
	System.out.println(a[length-1]-a[0]);
	}
*/
}
