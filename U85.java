import java.util.Scanner;

public class U85 {
    public static void main(String[] args) {
        float a, b, c;
        double x1, x2, x3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b and c :");
        a = scanner.nextFloat();
        System.out.println("a= " + a);
        b = scanner.nextFloat();
        System.out.println("b= " + b);
        c = scanner.nextFloat();
        System.out.println("c= " + c);
        double D = Math.pow(b,2) - (4 * a * c);
        System.out.println("Дискриминантата D= " + D);
        double result = x1 = -b / (2 * a * c);
        double result1 = x2 = (-b + Math.sqrt(Math.pow(b,2) + (4 * a * c))) / 2 * a;
        double result2 = x3 = (-b - Math.sqrt(Math.pow(b,2) + (4 * a * c))) / 2 * a;
        if (D < 0) {
            System.out.println("Няма реални корени");
        }else if (D == 0) {
            System.out.printf ("%s %.2f" , "Корените са еднакви.Моля намери корена на уравнението.Корена на уравнението е x1=" , result);
        }else if (D > 0) {
            System.out.printf("%s %.2f %s %.2f ", "Имаме два корена.Моля намери корените на уравнението.Корена на уравнението са x2=", result1,"и x3=" , result2);
        }
    }
}
