package sth;

public class SimpleScan3 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String nameIv = scanner.nextLine();
        String nameIv = "Ivancho";
        String nameAn = "Ani";
        String namePen = "Pencho";
        String nameMar = "Mariyka";
        String nameBor = "Borislavcho";
        int gradeIv = 2;
        int gradeAn = 5;
        int gradeMar = 6;
        int gradePen = 4;
        int gradeBor = 5;
        System.out.printf("|%-11s|%1d|%n",nameIv,gradeIv);
        System.out.printf("|%-11s|%1d|%n",nameAn,gradeAn);
        System.out.printf("|%-11s|%1d|%n",nameMar,gradeMar);
        System.out.printf("|%-11s|%1d|%n",namePen,gradePen);
        System.out.printf("|%-11s|%1d|%n",nameBor,gradeBor);
    }
}
