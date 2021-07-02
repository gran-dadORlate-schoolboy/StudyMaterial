package basic;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class TimerSwingTest {

	public static void main(String[] args) {
		//ActionListener listener = new TimePrinter();

		//Timer t = new Timer(10000, listener);
		//t.start();
		
		//через лямда то же самое 
		//Timer t = new Timer(1000, event -> System.out.println("the time is " + new Date()));
		
		
		//Timer t = new Timer(10000, event -> System.out.println(event));
		Timer t = new Timer(10000,  System.out::println);
		
		t.start();
		//через лямда то же самое 
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);

	}

}
//class TimePrinter implements ActionListener{
//	Sound sound = new Sound(); 
//
//	@Override
//	public void actionPerformed(ActionEvent event) {
//		System.out.println("at the tone, time is " + new Date());

//		Toolkit.getDefaultToolkit().beep();
//		try {
//			sound.tone(1800, 600);
//		} catch (LineUnavailableException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//}
