package com.tianque.factoryPattern.impl;

import com.tianque.factoryPattern.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
