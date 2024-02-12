import java.util.Scanner;

/**
 * Която изчислява факториел на положително число
 * въведено от конзолата.
 */
public class L10f {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int fact = 1;
        int a = 1;
        n = scanner.nextInt();
        while (a <= n){
            fact *= a;
            if(fact <= 0){
                break;
            }
            a++;
        }
        System.out.println(fact);
    }
}
