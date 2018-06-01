package les_2_printf;

import java.util.Date;

public class Lessons1_Printf {
    public static void main(String[] args) {
        String s1 = "Форматирование", s2= "строки", s3 = "нужным", s4= "образом";

        System.out.printf("%s, %s, \n, \t" , "koza", s1);
        System.out.println("\\n - переводит позицию каретки на одну строку вниз\n" +
                "\\r - перемещает позицию каретки в крайнее левое положение\n" +
                "\\t - горизонтальная табуляция\n" +
                "\\b - перемещает позицию каретки на один символ назад");


        System.out.printf("Текущая дата в формате YYYY-MM-dd %tF\n", new Date());
        Date today = new Date();
        System.out.printf("Текущее время в формате hh/mm/ss %tT\n", today);

    }
}
