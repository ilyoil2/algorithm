package algo.algorithm;

import java.util.Arrays;
import java.util.Scanner;

//주사위
public class B1041X {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();        //보이는 면의 수

        long[] arr = new long[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        long low1 = arr[0];
        long low2 = arr[1];
        long low3 = arr[2];

        long side3 = (low1 + low2 + low3) * 4;
        long side2 = (low1 + low2) * ((n * 8) -12);
        long side1 = (low1) * ((n-2)*(n-2) * 5 + (n-2) * 4);

        System.out.print(side1 + side2 + side3);
    }

}
