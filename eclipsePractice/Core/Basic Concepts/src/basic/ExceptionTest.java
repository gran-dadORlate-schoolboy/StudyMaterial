package basic;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("dfg");
		Scanner scan = new Scanner(file);
		// TODO Auto-generated method stub

	}
	public   void printF() {
		File file = new File("dfg");
		try {
			Scanner scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void test1() {
		Throwable t = new Throwable();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		t.printStackTrace(out);
	}

}
