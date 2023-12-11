package algo.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//세로읽기 (어렵네(못풀었다))
public class B10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[5][15];

        for (int i = 0; i<5; i++) {
            for (int j = 0; j<15; j++) {
                String test = br.readLine();

                arr[i][j]= Arrays.toString(test.split(""));
            }
        }
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.print("\n");
        }

    }
}
