package JavaBasic;

import java.util.Scanner;

public class StatisString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String nextLine = sc.nextLine();
        int numCount = 0;
        for (int i = 0; i < nextLine.length(); i++) {
            if (nextLine.charAt(i) >= '0' && nextLine.charAt(i) <= '9') {
                numCount++;

            }


        }
        System.out.println(numCount);
    }
}