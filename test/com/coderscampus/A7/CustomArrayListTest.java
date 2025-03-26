package com.coderscampus.A7;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_CustomArrayList() {
		CustomArrayList<String> customList = new CustomArrayList<>();
		customList.add("one");

		assertEquals(1, 1, "one");
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
		assertEquals(customList.getSize(), 9);
		assertEquals(customList.get(3), 4);
	}
	@Test
	void should_resize_array() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			customList.add(i);
		}		
	
	assertEquals(customList.getLength(), 20);
	}
	@Test
	void should_get_from_index() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
	}
	assertEquals(customList.get(5), 5);
	}


}
		