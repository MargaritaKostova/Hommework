public class Tri {
    public static void main(String[] ars) {
        int size = 5;
        for (int a = size; a >=1; a--) {
            for (int b = size; b >=1; b--) {
                System.out.print(b + " ");
            }
            size--;
            System.out.println();
        }
    }
}
