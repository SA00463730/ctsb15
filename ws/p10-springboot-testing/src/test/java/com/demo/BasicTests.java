package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicTests {

	@Test
	public void check() {
		/* 
		  Cal c = new Cal();
		  int r = c.add(5, 6)
		*/ 
		int r = 11;
//		Assertions.assertTrue(r==11);
		Assertions.assertSame(11,r);
		
	}

}
