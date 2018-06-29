package com.hzh.factoryPattern.impl;

import com.hzh.factoryPattern.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
