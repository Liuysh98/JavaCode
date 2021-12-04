package JavaBasic;
import java.util.Scanner;


public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String line = sc.nextLine();
        System.out.println(line);
    }
}
