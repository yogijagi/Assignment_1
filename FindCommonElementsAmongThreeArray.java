package com.ashokit;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;

public class FindCommonElementsAmongThreeArray {

	public static void main(String[] args) {
		int a[] = { 1, 5, 10, 20, 40, 80,300};
		int b[] = {1, 6, 7, 20, 80, 100,300};
		int c[] = {1, 3, 4, 15, 20, 30, 70, 80, 120,300};
		FindCommonElementsAmongThreeArray.find(a, b, c);
	}

	private static void find(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) {
           System.out.println(a[i]+":"+b[j]+":"+c[k]);
           ++i;++j;++k;
			}else if(a[i]<b[j]) {
				++i;
			}else if(b[j]<c[k]) {
				j++;
			}else if(c[k]<a[i]) {
				k++;
			}
		}
	}

}
