package com.rennovirgonata.rennovirgonata_153040004;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void test1() {
		A a = new A();
		assertEquals(25.0, a.hitung(2, 3, 5));
	}
	
	public void test2() {
		A a = new A();
		assertEquals(5.6, a.hitung(2.1, 3.5, 1.0));
	}
}
