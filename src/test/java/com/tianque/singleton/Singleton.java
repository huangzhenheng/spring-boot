package com.tianque.singleton;

public class Singleton {

	private static Singleton singleton;

	// 让构造函数为 private，这样该类就不会被实例化
	private Singleton(){}
	
	// 获取唯一可用的对象
	public static Singleton getInstance(){
		if (singleton==null) {
			
			synchronized (Singleton.class) {
				
				if (singleton==null) {
					singleton=new Singleton();
				}
				
			}
		}
		return singleton;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}