package com.coderscampus.A7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.A7.CustomArrayList;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_CustomArrayList() {
		CustomArrayList<String> customList = new CustomArrayList<>();
		customList.add("one");

		assertEquals(customList.get(0), "one");
		assertEquals(customList.getSize(), 1);
	}

	@Test
	void should_get_size() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		assertEquals(customList.getSize(), 10);
	}

	@Test
	void should_add_item_to_index() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		customList.add(0, 10385);

		assertEquals(customList.get(0), 10385);
	}
	@Test 
	void should_remove_item() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		} 
		customList.remove(3);
	 assertEquals(customList.getSize(),9);
	 assertEquals(customList.get(3), 4);
	}
	
}