package javaEx06;

public class PairMain {

    public static void main(String[] args) {
        Pair<String,Integer> p = new Pair<>();

        p.setFirst("Hello World");
        p.setSecond(6);

        String str = p.getFirst();
        int num = p.getSecond();

        System.out.println(str);
        System.out.println(num);
    }
}
