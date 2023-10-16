package com.niceinfoshop.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {

	@Autowired
	Calculator cal;
	
	@Test
	public void add() {
		//Calculator cal = new Calculator();
		double result = cal.add(1,  1);
		System.out.println(result);
		assertEquals(2, result, 0.00001);
		assertEquals(2.0, result, 0.00001);
	}
	
	@Test
	public void add2() {
		
		double result = cal.add(1,  1);
		System.out.println("add2 >>> " + result);
		assertEquals(2, result, 0.00001);
		assertEquals(2.0, result, 0.00001);
	}

}
