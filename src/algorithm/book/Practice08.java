package algorithm.book;

import java.util.Scanner;

public class Practice08 {
    // 가우스의 덧셈 방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Get total sum from 1 to n.");
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;
        System.out.println("The sum of the digits is: " + sum);
    }
}
