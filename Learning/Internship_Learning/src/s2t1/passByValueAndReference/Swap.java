package s2t1.passByValueAndReference;

//c and d get swapped at swap, but the initial values stay as they were at input and don't get changed. so java is pass by value
public class Swap {
    public static void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println("c1 = "+ c);
        System.out.println("d1 = "+ d);
    }
}
