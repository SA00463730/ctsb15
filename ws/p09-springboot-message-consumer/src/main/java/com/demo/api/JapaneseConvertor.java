package com.demo.api;

public class JapaneseConvertor implements MessageConvertor {

	@Override
	public void translate(String m) {
		System.out.println("This is japanese message: "+m);
	}
	
}
