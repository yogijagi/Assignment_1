package com.ashokit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindSumOfUniqueElementsOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 1, 6, 4, 3, 2, 2, 3, 8, 1 };
		FindSumOfUniqueElementsOfAnArray.find(a,a.length);
	}
	
	private static void find(int[] a, int length) {
		int i = 0;
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		int sum=0;
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
		// Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
			sum=sum+entry.getKey();
		}
		System.out.println("sum is : "+sum);
	}

}
