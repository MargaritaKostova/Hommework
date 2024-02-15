public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int number) {
        if (number > 0) {
            int i = number + sum(number - 1);
        } else {
            return 0;
        }
        int number1 = number;
        return number1;
    }
}