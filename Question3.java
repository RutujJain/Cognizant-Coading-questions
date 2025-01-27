//Problem Statement – Ritik wants a magic board, which displays a character for a corresponding number for his science project. Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ]

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char e = (char) a;
        char f = (char) b;
        char g = (char) c;
        char h = (char) d;
        System.out.println(a + "-" + e);
        System.out.println(b + "-" + f);
        System.out.println(c + "-" + g);
        System.out.println(d + "-" + h);
        sc.close();
    }
}
