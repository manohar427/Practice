package com.test;

public class SomeClass {

	static private SomeClass _resource = null;

	public static SomeClass getResource() {
		if (_resource == null) {
			synchronized (SomeClass.class) {
				if (_resource == null)
					_resource = new SomeClass();
			}
		}
		return _resource;
	}
}
