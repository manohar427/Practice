package com.test.reflection;

import java.lang.reflect.Constructor;

public class ReflectionManaget {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SingleTonIn instance1 = SingleTonIn.INSTANCE;
		SingleTonIn instance2 = null;
		try {
			Constructor[] constructors = SingleTonIn.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (SingleTonIn) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());
	}

}

// Singleton class
class Singleton {
	// public instance initialized when loading the class
	public static Singleton instance = new Singleton();

	private Singleton() {
		// Prevent form the reflection api.
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
		}
	}
}
