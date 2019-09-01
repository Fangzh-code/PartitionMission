package com.adneom.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.adneom.partition.PartitionUtils;

public class PartitionTest {

	private List<Integer> list;
	
	@Before
	public void setUp() throws Exception {
		list = Arrays.asList(1, 2, 3 , 4, 5);
	}

	@Test
	public void partition_should_return_empty_list_when_list_null() {
		assertEquals(Collections.emptyList(), PartitionUtils.partition(null, 1));
	}
	
	@Test
	public void partition_should_return_empty_list_when_list_empty() {
		assertEquals(Collections.emptyList(), PartitionUtils.partition(new ArrayList<>(), 1));
	}
	
	@Test
	public void partition_should_return_empty_list_when_taille_zero() {
		assertEquals(Collections.emptyList(), PartitionUtils.partition(list, 0));
	}
	
	@Test
	public void partition_should_return_5element_list_when_taille_one() {
		List one = Arrays.asList(1);
		List two = Arrays.asList(2);
		List three = Arrays.asList(3);
		List four = Arrays.asList(4);
		List five = Arrays.asList(5);
		List exp = Arrays.asList(one, two, three, four, five);
		assertEquals(exp, PartitionUtils.partition(list, 1));
	}
	
	@Test
	public void partition_should_return_3element_list_when_taille_two() {
		List one = Arrays.asList(1, 2);
		List two = Arrays.asList(3, 4);
		List three = Arrays.asList(5);
		List exp = Arrays.asList(one, two, three);
		assertEquals(exp, PartitionUtils.partition(list, 2));
	}
	
	@Test
	public void partition_should_return_2element_list_when_taille_three() {
		List one = Arrays.asList(1, 2, 3);
		List two = Arrays.asList(4, 5);
		List exp = Arrays.asList(one, two);
		assertEquals(exp, PartitionUtils.partition(list, 3));
	}

}
