package com.ashokit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
		FindDuplicateElements.find(a,a.length);

	}

	private static void find(int[] a, int length) {
		int i=0;
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		while(i<length) {
		if(!hashMap.containsKey(a[i])) {
			hashMap.put(a[i],1);
		}else {
			int oldValue = hashMap.get(a[i]);
			int newValue=oldValue+1;
			hashMap.put(a[i],newValue);	
		}
		i++;
		}
		//Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		for(Entry<Integer, Integer> entry :hashMap.entrySet()) {
			if(entry.getValue()>1)
		System.out.println(entry.getKey());
		}
	}

}
