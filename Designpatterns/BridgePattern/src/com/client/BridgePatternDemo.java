package com.client;

import com.test.Circle;
import com.test.GreenCircle;
import com.test.RedCircle;
import com.test.Shape;

public class BridgePatternDemo {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
