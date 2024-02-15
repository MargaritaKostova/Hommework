package sth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class diceGame{
    public static int diceThrow( int sideNum ){
        int dice1 = (int)(Math.random()*sideNum+1);
        int dice2 = (int)(Math.random()*sideNum+1);
        return dice1 + dice2;
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> players = new ArrayList<Integer>();
        //String command = scanner.next();
        int [] results = new int[4];
        int count =0;
        while (count < results.length){
            System.out.println("Roll dice... Y/N");
            int i = 6;
            int sideNum = i;
            results[count] = diceThrow(sideNum =i);

            count++;
        }
        int winPlayer =1;
        System.out.println(Arrays.toString(results));
        int winResult = results[0];
        for (int i =0; i< results.length; i++) {
            if (winResult < results[i]) {
                winResult = results[i];
                winPlayer = i + 1;
            }
        }
        System.out.println("Player " + winPlayer + " Is winning " + winResult);
        }
    }




