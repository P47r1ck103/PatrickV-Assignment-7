package com.coderscampus.A7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_CustomArrayList() {
		CustomArrayList<String> customList = new CustomArrayList<>();
		customList.add("one");

		assertEquals("one", customList.get(0));
		assertEquals(1, customList.getSize());
	}

	@Test
	void should_get_size() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		assertEquals(10, customList.getSize());
	}

	@Test
	void should_add_item_to_index() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		customList.add(0, 10385);

		assertEquals(10385, customList.get(0));
	}

	@Test
	void should_remove_item() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		customList.remove(3);
		assertEquals(9, customList.getSize());
		assertEquals(4, customList.get(3));
	}

	@Test
	void should_resize_array() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 11; i++) {
			customList.add(i);
		}

		assertEquals(11, customList.getSize());
	}

	@Test
	void should_get_from_index() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		assertEquals(5, customList.get(5));
	}

	@Test
	void should_throw_index_out_of_bounds_exception_get() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> customList.get(35));
		assertThrows(IndexOutOfBoundsException.class, () -> customList.get(-1));
	}

	@Test
	void should_throw_index_out_of_bounds_exception_add() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> customList.add(35, 35));
		assertThrows(IndexOutOfBoundsException.class, () -> customList.add(-1, -1));
	}

	@Test
	void should_resize_array_specific_index() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 10; i++) {
			customList.add(i);
		}
		customList.add(10, 10);
		assertEquals(11, customList.getSize());
	}

	@Test
	void should_throw_index_out_of_bounds_exception_remove() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		assertThrows(IndexOutOfBoundsException.class, () -> customList.remove(35));
		assertThrows(IndexOutOfBoundsException.class, () -> customList.remove(-1));
	}

	@Test
	void should_move_values_down_after_add() {
		CustomArrayList<Integer> customList = new CustomArrayList<>();
		for (int i = 0; i < 5; i++) {
			customList.add(i);
		}
		customList.add(3, 10);
		assertEquals(3, customList.get(4));
	}

}