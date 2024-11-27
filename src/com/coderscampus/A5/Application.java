package com.coderscampus.A5;


public class Application {

	public static void main(String[] args) {
		CustomArrayList<String> list = new CustomArrayList<>();

		System.out.println(list.add("Apple"));
		System.out.println(list.add("Banana"));
		System.out.println(list.add("cherry"));
		
		System.out.println("Size: " + list.getSize());
		System.out.println("Item at index 1: " + list.get(1));

		
		try {
			System.out.println(list.get(5));
		}catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
