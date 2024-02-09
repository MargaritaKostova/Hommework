import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the valies of the sides of the triangle:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if (x == y && x == z) {
            System.out.println("Равностранен триъгълник");
        }else if ((y == x) && (z>=0)){
            System.out.println("Равнобедрен триъгълник");
        }else if ((x==y) && (y>=0)){
            System.out.println("Равнобедрен триъгълник");
        }else if ((y==z) && (x>=0)) {
            System.out.println("Равнобедрен триъгълник");
        }else {
            System.out.println("Разностранен триъгълник");
        }
    }
}
