// Problem Statement – FOE college wants to recognize the department which has succeeded in getting the maximum number of placements for this academic year. The departments that have participated in the recruitment drive are CSE,ECE, MECH. Help the college find the department getting maximum placements. Check for all the possible output given in the sample snapshot

import java.util.Scanner;

public class Question4 {
    public static void printAns(int cse, int ece, int mech) {
        if (cse >= ece && cse >= mech) {
            System.out.println("CSE");
        } else if (ece >= cse && ece >= mech) {
            System.out.println("ECE");
        } else if (mech >= cse && mech >= ece) {
            System.out.println("MECH");
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mech = sc.nextInt();
        printAns(cse, ece, mech);
    }
}
