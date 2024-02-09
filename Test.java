package sth;

public class Test {
    public static void main(String[]args){
        int a = 5;
        int b = 7;

        System.out.println("a&b=" + (a & b));
        System.out.println("a|b=" + (a | b));
        System.out.println("a^b=" + (a ^ b));
        System.out.println("~a=" + ~a);
        a &= b;
        System.out.println("a=" + a);
        System.out.println("a >> 1 = " +(a >> 1));
        System.out.println("b << 1 = " + (b << 1));

    }
}

