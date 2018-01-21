package com.test.serial;

import java.io.Serializable;

class Singleton implements Serializable {
	private static final long serialVersionUID = -7584189955787505073L;
	public static Singleton instance = new Singleton();

	private Singleton() {
	}

	// implement readResolve method
	protected Object readResolve() {
		return instance;
	}
}
