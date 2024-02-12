package sth;

import java.util.Scanner;

public class Tri2{
    public static void main(String[]args){
        int number;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number =scanner.nextInt();
        System.out.println();
        for (int i = 0; i <= number; i++){
            for (j = 1; j <= number - i;j++){
                System.out.print(" #");
            }
            System.out.println(" ");
            for (int k = number; k >= j-1; k--){
                System.out.print(" ");
            }
        }
    }
}
