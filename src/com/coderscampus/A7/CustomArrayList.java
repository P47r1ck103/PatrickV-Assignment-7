package com.coderscampus.A7;

public class CustomArrayList<T> implements CustomList<T> {
	private Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		return add(size, item);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds " + index + ".");
		}
		if (size == items.length) {
			resize();
		}
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		size++;

		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= 0 && index < size) {
			return (T) items[index];
		}
		throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds " + index + ".");
		}
		@SuppressWarnings("unchecked")
		T toRemove = (T) items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size - 1] = null;
		size--;
		return toRemove;
	}

	private void resize() {
		Object[] newArray = new Object[items.length * 2];
		System.arraycopy(items, 0, newArray, 0, items.length);
		items = newArray;
	}
}
