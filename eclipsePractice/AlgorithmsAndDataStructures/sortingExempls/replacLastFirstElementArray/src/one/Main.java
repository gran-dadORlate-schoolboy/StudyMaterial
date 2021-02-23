package one;
import java.util.Arrays;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		
		int arg[] = {1,2,3,4,5,6,7,8,9};
		int leght = arg.length;
		for (int i = 0; i < leght/2; i++) {
			int temp = arg[i];
			arg[i] = arg[leght-1-i];
			arg[leght-1-i] = temp;
		}
		System.out.print(Arrays.toString(arg));
		// TODO Auto-generated method stub

	}

}
