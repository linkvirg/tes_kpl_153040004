package com.rennovirgonata.rennovirgonata_153040004;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

/**
 * Hello world!
 *
 */
public class A {
	
	public double hitung(double a, double b, double c) {
		Argument argA = new Argument("a", a);
		Argument argB = new Argument("b", b);
		Argument argC = new Argument("c", c);
		Expression exp = new Expression("(a+b)*c", argB, argA, argC);
		return exp.calculate();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
