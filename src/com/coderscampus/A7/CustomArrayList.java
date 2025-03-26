package com.coderscampus.A7;

public class CustomArrayList<T> implements CustomList<T> {
	private T[] items = (T[]) new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			resize();
		}
		items[size++] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index >= 0 && index < size) {
			return items[index];
		}
		throw new IndexOutOfBoundsException("index " + index + " out of bounds.");
	}

	private void resize() {
		T[] newArray = (T[]) new Object[items.length * 2];
		System.arraycopy(items, 0, newArray, 0, items.length);
		items = newArray;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds" + index + ".");
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
	public T remove(int index) throws IndexOutOfBoundsException {
		System.out.println(index);
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds" + index + ".");
		}
		T toRemove = items[index];
		for (int i = index; i < size - 1; i++){
			items[i] = items[i + 1];
		}
		items[size-1] = null;
		size--;
		return toRemove;
	}
	public int getLength() {
		return items.length;
	}
}
