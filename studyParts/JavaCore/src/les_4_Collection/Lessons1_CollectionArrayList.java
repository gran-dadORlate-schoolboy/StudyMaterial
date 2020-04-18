package les_4_Collection;
import java.util.*;

public class Lessons1_CollectionArrayList {
    public static void main(String[] args) {
        String[] someitem = {"one", "2", "3", "4"};
        List<String> list1 = new ArrayList<>();
        //добавление елементов в масив
        for (String x:someitem
             ) {
            list1.add(x);
        }
        String[] nextSomeItem = {"1", "29", "3", "4"};
        List<String> list2 = new ArrayList<>();
        for (String x: nextSomeItem
             ) {
            list2.add(x);


        }
        for (String x: nextSomeItem
             ) {
            list1.add(x);
        }
        for (int i = 0; i <list1.size() ; i++) {
            System.out.printf("list1 - %s \n", list1.get(i));
        }



        for (int i = 0; i <list2.size() ; i++) {
            System.out.printf("list2 - %s \n", list2.get(i));
        }
        //метод отсортирует елементы с лист1 которые есть в лист2
        sortlist(list1, list2);
        System.out.println("sortlist");
        for (int i = 0; i <list1.size() ; i++) {
            System.out.printf("(sort)list1  - %s \n", list1.get(i));
            System.out.println(list1.size());
        }

    }
    public static void sortlist(Collection<String> lst1, Collection<String> lst2){
        Iterator<String> iterator = lst1.iterator();
        while (iterator.hasNext()){
            if (lst2.contains(iterator.next()))
                iterator.remove();
        }
    }
}
