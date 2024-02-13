package sth;

import java.util.Scanner;

public class ReverseNumber {
    /*
    Да печата въведеното цяло число обърнато.
    Напр: 123456 => 654321
     */
    public static void main(String[]args) {
        String original,reverse = "";
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number:");
        original = number.nextLine();
        int length = original.length();
        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse + " is reverse number for " + original);
    }
}
