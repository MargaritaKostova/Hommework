import java.util.Scanner;

public class Visokosna {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the year:");
        int year = in.nextInt();

        boolean isDivisibleOf4 = (year % 4) == 0;
        System.out.println(isDivisibleOf4);
        boolean isNotDivisibleOf100 = (year % 100) != 0; //not a century
        System.out.println(isNotDivisibleOf100);
        boolean isDivisibleOf100And400 = ((year % 100 == 0) && (year % 400 == 0));
//century and that is leap-2000 not 1900
        System.out.println(isDivisibleOf100And400);
        if (isDivisibleOf4 && (isNotDivisibleOf100 || isDivisibleOf100And400))
        {
            System.out.println(year + " is a Leap year");
        }
        else
        {
            System.out.println(year + "is not a leap year");
        }
    }
}
