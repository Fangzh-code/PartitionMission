package com.adneom.partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PartitionUtils {

	public static List<List<Integer>> partition(List<Integer> liste, Integer taille) {
		if (liste == null || liste.isEmpty() || taille <= 0) {
			return Collections.emptyList();
		}
		
		List<List<Integer>> findList = new ArrayList<>();
		for (int begin=0; begin < liste.size(); begin+=taille) {
			int end = begin+taille;
			if (end > liste.size()) {
				end = liste.size();
			}
			findList.add(liste.subList(begin, end));
		}
		
		return findList;
	}
}
