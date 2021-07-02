import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class inOut {

	public static void main(String[] args) throws IOException {
//		//счивуваня з консоли Scanner
//		System.out.println("vvedite name");
//		Scanner scTest = new Scanner(System.in);
//		String name = scTest.nextLine();
//		System.out.println(" vvedite age");
//		int age = scTest.nextInt();
//		System.out.printf("thank u %s. it is hard in your %d age!!!", name, age );
//		
//		
//		//запис в файл PrintWriter
//		PrintWriter pw = new PrintWriter(new File("src/test3.txt"));
//		pw.print("test");
//		pw.println("test");
//		pw.print("test");
//		pw.println("test");
//			
//		pw.close();
//		
//		//читання файлу Scanner
//		String fileName = "src/test3.txt";
//        Path path = Paths.get(fileName);
//        Scanner scanner = new Scanner(path);
//		scanner.useDelimiter(System.getProperty("line.separator"));
//        while(scanner.hasNext()){
//            System.out.println("Строка: " + scanner.next());
//        }
//        scanner.close();
//		
		//filereader filewriter
        FileReader fr = new FileReader("src/test2.txt");
        FileWriter fw = new FileWriter("src/test.txt");
        while (fr.ready()) {
			int s = fr.read();
			fw.write(s);
			
		}
        fr.close();
        fw.close();
        
        
        // TODO Auto-generated method stub

	}

}
