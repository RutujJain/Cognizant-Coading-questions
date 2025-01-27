
//Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
import java.util.*;

public class Question2 {
    public static void printAns(int pizza, int puffs, int drinks) {
        System.out.println("Bill Details");
        System.out.println("No of Pizzas :" + pizza);
        System.out.println("No of Puffs :" + puffs);
        System.out.println("No of Drinks :" + drinks);

        int total = 100 * pizza + 20 * puffs + 10 * drinks;
        System.out.println("Total Cost : " + total);
        System.out.println("ENJOY THE SHOW!!!");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought: ");
        int pizza = sc.nextInt();
        System.out.print("Enter the no of puffs bought: ");
        int puffs = sc.nextInt();
        System.out.print("Enter the no of cool drinks bought: ");
        int drinks = sc.nextInt();
        printAns(pizza, puffs, drinks);
        sc.close();
    }
}
