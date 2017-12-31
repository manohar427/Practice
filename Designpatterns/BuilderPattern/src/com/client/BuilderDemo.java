package com.client;

import com.pack.CDBuilder;
import com.pack.CDType;

public class BuilderDemo {
	public static void main(String args[]) {
		CDBuilder cdBuilder = new CDBuilder();
		
		CDType cdType1 = cdBuilder.buildSonyCD();
		cdBuilder.buildSonyCD();
		cdType1.showItems();

		CDType cdType2 = cdBuilder.buildSamsungCD();
		cdType2.showItems();
	}
}
