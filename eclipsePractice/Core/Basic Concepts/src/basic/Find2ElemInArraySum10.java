package basic;

import java.util.HashSet;

public class Find2ElemInArraySum10 {
//находимо два елементи в масиві які в сумі = 10
	public static void main(String[] args) {
		int[] test = {2, 4, 7, 3, 8};
		for (int i : towSum(test, 10)) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}
	public static int[] towSum(int[] numbers, int targetSum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int seachEl = targetSum - numbers[i];
			if (!set.contains(seachEl)) {
				set.add(numbers[i]);
				continue;
			}return new int[]  {numbers[i], seachEl};
		}
		
		return null;
		
	}

}
