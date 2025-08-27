package algorithm.book;

import java.util.Scanner;

public class Practice09 {
    // 가우스의 덧셈의 특수성을 제외한 일반화된 방법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number : ");
        int n = sc.nextInt();
        System.out.println("Enter the ending number : ");
        int m = sc.nextInt();
        int sum = (n + m) * (m - n + 1) / 2;
        System.out.println("The sum of the digits is : "+sum);
    }
}
