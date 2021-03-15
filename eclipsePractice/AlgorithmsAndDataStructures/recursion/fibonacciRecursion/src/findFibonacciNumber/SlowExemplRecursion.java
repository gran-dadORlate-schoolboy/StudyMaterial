package findFibonacciNumber;

//найти число фибоначи Fn = fn-1 + fn-2 размножение кролликов)))

public class SlowExemplRecursion {

	public static void main(String[] args) {
		System.out.println(SeachFibonacciRecurSlow(0));
		System.out.println(SeachFibonacciRecurSlow(1));
		System.out.println(SeachFibonacciRecurSlow(2));
		System.out.println(SeachFibonacciRecurSlow(3));
		System.out.println(SeachFibonacciRecurSlow(4));
		System.out.println(SeachFibonacciRecurSlow(5));
		System.out.println(SeachFibonacciRecurSlow(6));

		

	}
	private static long SeachFibonacciRecurSlow(int n){
		if (n<=1) {
			return n;
		}
		
		return SeachFibonacciRecurSlow(n-1) + SeachFibonacciRecurSlow(n-2);
		
	}

}
