package com.hzh.factoryPattern.impl;

import com.hzh.factoryPattern.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
