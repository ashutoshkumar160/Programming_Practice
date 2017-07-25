package com.ashu.basicquestions;
public class Singleton {
	private static Singleton object = null;

	private Singleton() {

	}

	public static Singleton getObject() {
		if (object == null) {
			object = new Singleton();
		}
		return object;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Singleton.getObject());
		}
	}

}
