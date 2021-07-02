package basic;

import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*10);
		}
		for (int gh : a) {
			System.out.println(gh);
		}
		System.out.println("sort");
		Arrays.sort(a);//отсортировано от малого до великого
		for (int gh : a) {
			System.out.println(gh);
		}
		// TODO Auto-generated method stub

	}

}
