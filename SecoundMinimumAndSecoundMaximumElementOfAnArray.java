package com.ashokit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecoundMinimumAndSecoundMaximumElementOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 2, 5, 9, 6, 4, 7, 2};
		int len = a.length;
		
		System.out.println("Secount Min : "+a[1]+" Secound Max : "+a[len-2]);
		SecoundMinimumAndSecoundMaximumElementOfAnArray.find(a,a.length);
	}
	
	private static void find(int[] a, int length) {
		int i = 0;
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		while (i < length) {
			if (!hashMap.containsKey(a[i])) {
				hashMap.put(a[i], 1);
			} else {
				int oldValue = hashMap.get(a[i]);
				int newValue = oldValue + 1;
				hashMap.put(a[i], newValue);
			}
			i++;
		}
		int b[]=new int[hashMap.size()];
		int count=0;
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			b[count]=entry.getKey();
			count++;
		}
		/*
		 * for(int x:b) { System.out.println("value:"+x); }
		 */
		
		System.out.println("Secount Min : "+b[1]+" Secound Max : "+b[hashMap.size()-2]);
	}
}
