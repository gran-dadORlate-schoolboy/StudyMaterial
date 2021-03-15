package findFibonacciNumber;

import java.util.Iterator;

//найти число фибоначи Fn = fn-1 + fn-2 размножение кролликов)))
public class EfectiveFindFibonacciNum {

	public static void main(String[] args) {
		System.out.println("fastSea= " + fastSeachFibonacci(100));
		System.out.println("mySeach= " + mySeach(100));
		
		
//		long startTime = System.currentTimeMillis();
//		System.out.println(fastSeachFibonacci(120));
//		System.out.println("mySeach= " + mySeach(100));
//	       long endTime = System.currentTimeMillis();
//	       System.out.println("Total execution time: " + (endTime-startTime) + "ms");        
	     		
//		for (int i = 2; i < 10; i++) {
//			System.out.println("mySeach= " + mySeach(i));
//			//System.out.println("fastSea= " + fastSeachFibonacci(i));
//		}
		

	}
	private static long fastSeachFibonacci(int n) {
		long[] arrayNum = new long[n+1];
		arrayNum[0] = 0;
		arrayNum[1] = 1;
		for (int i = 2; i < n+1; i++) {
			arrayNum[i] = arrayNum[i-1] + arrayNum[i - 2];
		}
		
		return arrayNum[n];
		
	}
	private static long mySeach(int n) {
		long a = 0;
		long b = 1;
		
		if(n <= 1)
			return n;
		for (int i = 2; i < n + 1; i++) {
			b = b +a;
			a = b - a;
		}
		return b;
	}

}
