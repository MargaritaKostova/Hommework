import java.util.Scanner;

public class U7 {

    public static void main(String[] args) {
        int date, month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        date = scanner.nextInt();
        System.out.println("Enter month");
        month = scanner.nextInt();
// Дати от 20.03-20.06
        if (month == 3 && date >=20 || month >3 && month <6 || month == 6 && date <= 20){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
