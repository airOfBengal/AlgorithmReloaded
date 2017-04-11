package org.airofbengal.math;

import java.math.BigInteger;

public class NumberTheory{
	public static BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);
	public static BigInteger THREE = TWO.add(BigInteger.ONE);


	public static BigInteger triangularNo(BigInteger n){
		return n.multiply(n.add(BigInteger.ONE)).divide(TWO);
	}

	public static boolean isTriangularNumber(BigInteger n){
		// TODO: for BigInteger
		return false;
	}
	public static boolean isTriangularNumber(Long n){
		if(n < 1){
			throw new IllegalArgumentException("Triangular Number should be an integer greater than 0(zero).");
		}
		if(MathA.isSquared(1+8*n)) return true;
		return false;
	}
}