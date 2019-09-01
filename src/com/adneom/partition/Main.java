package com.adneom.partition;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer taille = 2;
		List<List<Integer>> result = PartitionUtils.partition(list, taille);
		result.forEach(System.out::print);
		System.out.println("");
		
		taille = 3;
		result = PartitionUtils.partition(list, taille);
		result.forEach(System.out::print);
		System.out.println("");
		
		taille = 1;
		result = PartitionUtils.partition(list, taille);
		result.forEach(System.out::print);
	}

}
