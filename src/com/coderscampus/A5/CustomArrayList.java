package com.coderscampus.A5;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			Resize();
		}
		items[size++] = item;
		return true;
	}

	private void Resize() {
		Object[] newArray = new Object[items.length * 2];
		System.arraycopy(items, 0, newArray, 0, items.length);
		items = newArray;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= 0 && index < size) {
			return (T) items[index];
		}
		throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
	}

	private void resize() {
		Object[] newArray = new Object[items.length * 2];
		System.arraycopy(items, 0, newArray, 0, items.length);
		items = newArray;
	}
}