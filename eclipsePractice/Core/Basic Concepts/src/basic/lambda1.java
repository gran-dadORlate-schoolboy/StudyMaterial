package basic;

import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.Timer;


public class lambda1 {

	public static void main(String[] args) {
		
		repeatMassage("test", 10);// TODO Auto-generated method stub

	}
	public static void repeatMassage(String massage, int delay){
		
		ActionListener listener = event -> System.out.println(massage);
		new Timer(delay,listener).start();
	}

}
