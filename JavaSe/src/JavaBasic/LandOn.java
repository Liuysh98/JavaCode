package JavaBasic;

import java.util.Scanner;

public class LandOn {
    public static void main(String[] args) {
        String user = "liuyishou";
        String password = "liu946351";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3;i++) {
            System.out.println("输入用户名和密码");
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            if (line1.equals(user) && line2.equals(password)) {
                break;
            }else {
                System.out.println("错了，继续");
            }
        }
    }
}
