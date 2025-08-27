package algorithm.book.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sorting_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 1. BufferedReader: 라인 단위로 읽는 방법

        int n = Integer.parseInt(br.readLine()); // 2. br.readLine(); BufferedReader를 통해 받은 한 줄 전체를 String으로 반환
        int[] arr = new int[n]; // 3. 반환 받은 n을 Array의 length로 사용

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // 4. n 길이의 arr에 br.readLine()을 통해 숫자 하나씩 입력
        }

        // 버블 정렬
        for (int i = 0; i < n-1; i++) { // 5. 0부터 n-1까지 루프: 0부터 n-1까지만 정렬하면 마지막 n은 자동으로 정렬됨
            for (int j = 0; j < n-1-i; j++) { // 5-1. 0부터 n-1-i까지 루프: 반복될 때마다 뒤에서부터 하나씩 정렬이 완료되기 때문
                if (arr[j] > arr[j+1]) { // 5-2. 앞선 index에 있는 배열의 값이 뒤의 값보다 크다면 swap!
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
