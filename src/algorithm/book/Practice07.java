package algorithm.book;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the total sum from 1 to n.");
        System.out.println("Value n: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Total Sum: " + sum);
    }
}
