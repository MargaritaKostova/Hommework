package sth;

import java.util.Scanner;

public class Upr8 {
    public static void main(String[] args) {
        float price;
        int size;
        boolean isBack = true;
        boolean canReturn = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price");
        price = scanner.nextFloat();
        System.out.println("Size");
        size = scanner.nextInt();
        if((price <= 150) && (size >=44 && size <=45) && (isBack) && (canReturn)){
            System.out.println("I can buy these shoes");
        }else {
            System.out.println("I cannot buy these shoes");
        }
    }
}
