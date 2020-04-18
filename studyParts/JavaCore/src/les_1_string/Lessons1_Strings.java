package les_1_string;

public class Lessons1_Strings {
    public static void main(String[] args) {
        String [] food = {"food1 ", "food2", "food3", "food4", "5food", "food6"};
//        for (String s: food) {
//            System.out.println(s);/*вывели все елементы масива */ }
//        for (String s: food) {
//            if (s.startsWith("fo"))
//            System.out.println(s);/* выводим слова на fo*/
//        }
//        for (String s: food) {
//            if (s.endsWith("2"))
//                System.out.println(s + " end = 2");/* выводим слова end на 2*/
//        }
        System.out.println(food[1].replace("f","it is not a F"));
        System.out.println(food[3].toUpperCase());
        String s = "       a lot of ' ' ";
        System.out.println(s);
        System.out.println(s.trim());

    }
}
