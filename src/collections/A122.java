package collections;

import java.util.Scanner;

public class A122 {
    static Scanner s = new Scanner(System.in);
    static int[] luckys = {4,7,44,47,74,77,444,447,474,477};
    public static void main(String[] args) {
        int n = s.nextInt();
        boolean flag = false;
        for (int i = 0; i < luckys.length; i++) {
            if (n % luckys[i] == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}