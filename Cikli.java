import java.util.Scanner;

public class Cikli {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int start = 0;
       int end = 0;
       while (start < 10) {
           start++;
           System.out.println(start);
           end = scanner.nextInt();
           end += end;

       }
       System.out.println(end);
   }
}
