package com.demo.api;

public class EnglishConvertor implements MessageConvertor {

	@Override
	public void translate(String m) {
		System.out.println("This is english message: "+m);
	}
	
}
