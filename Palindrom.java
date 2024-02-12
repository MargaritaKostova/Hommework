import java.util.Scanner;

public class Palindrom{
    public static void main(String[]args){
        String original,reverse ="";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length -1; i >=0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("It is a palindrome.");
        else
            System.out.println("it is no a palindrome.");

    }

}
