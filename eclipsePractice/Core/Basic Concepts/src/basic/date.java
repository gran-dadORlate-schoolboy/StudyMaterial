package basic;

import java.time.LocalDate;
import java.util.*;



public class date {

	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println(new Date().toString());
		
		
		 LocalDate date = LocalDate.now();
	System.out.printf("d %d - m %d - y %d",date.getMonthValue() ,date.getDayOfMonth() ,date.getYear());
	
	
		
		// TODO Auto-generated method stub

	}

}
