package basic;

import java.util.Arrays;
import java.util.Comparator;

public class doubleArray {

	public static void main(String[] args) {
//		//двойной массив
//		int[][] a = new int[7][15];
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = (int) (Math.random()* 100);
//			}
//		}
//		for (int[] row : a) {
//			for (int is : row) {
//				System.out.printf( "%-5d ",is );
//			}
//			System.out.println();
//		}
		//неровный массив
		final int NMAX = 10;
		//выделить память под треугольный масив
		int[][] odds = new int[NMAX + 1][];
		for (int n = 0; n <= NMAX; n++) {
			odds[n] = new int[n+1];
		}
		//заполнить треугольный массив
		
		for (int i = 0; i < odds.length; i++) {
			for (int j = 0; j < odds[i].length; j++) {
				
				odds[i][j] = 1;
			}
		}
		
		//вывести треугольный массив
		for (int[] is : odds) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
