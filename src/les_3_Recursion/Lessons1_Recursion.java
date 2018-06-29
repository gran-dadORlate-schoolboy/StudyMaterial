package les_3_Recursion;

public class Lessons1_Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static long factorial(long l){
        if (l<=1)
            return 1;
        else {
            return l * factorial(l-1);
        }
    }
}
