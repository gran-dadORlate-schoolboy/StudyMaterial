package TimerMy;

import java.util.Iterator;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
public class Main {
	public static void main(String[] args) throws LineUnavailableException {
		Sound sound = new Sound();
		System.out.println("enter the time of one lap - ");
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int sleepTime = time * 1000;
		System.out.println(" enter laps - ");
		int laps = scan.nextInt();
		
		System.out.println(" Laps  = " + laps); 
		for (int i = 0; i < laps; i++) {
			try {
				System.out.println(" test = " + time);
				
				Thread.sleep(sleepTime);
				sound.tone(1800, 600);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}System.out.println(" end");
		
		
		
	}

}
