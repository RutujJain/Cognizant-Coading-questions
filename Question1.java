
//Problem Statement – Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
import java.text.DecimalFormat;
import java.util.Scanner;

class Question1 {
    public static void printAns(double liter, double dist) {
        DecimalFormat df2 = new DecimalFormat("0.00");
        double fuelconsumption = (liter / dist) * 100;
        double distinmiles = dist * 0.6214;
        double litergallon = liter * 0.2642;
        double milespergallons = distinmiles / litergallon;

        System.out.println("Liters/100KM");
        System.out.println(df2.format(fuelconsumption));
        System.out.println("Miles/gallons");
        System.out.println(df2.format(milespergallons));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter = sc.nextInt();
        System.out.println("Enter the distance covered");
        double dist = sc.nextInt();
        printAns(liter, dist);
        sc.close();
    }
}