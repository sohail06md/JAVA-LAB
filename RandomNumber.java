import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range Of Value Wants To Print Random Number:");

        System.out.println("Enter The Minimum Range : ");
        int min = sc.nextInt();
        System.out.println("Enter The Maximum Range :");
        int max = sc.nextInt();
        int a = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("Random Number Between" + min + "to "+ max + " is :" + a);
        sc.close();
    }
}