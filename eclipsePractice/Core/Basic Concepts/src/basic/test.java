package basic;

import java.awt.Toolkit;

public class test {
    public static void main(String... args) {
        Toolkit.getDefaultToolkit().beep();     
        System.out.print("\007"); // \007 is the ASCII bell
        System.out.flush();
    }
}