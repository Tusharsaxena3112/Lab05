package question2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    // Bottle neck Problem ----> Codevita
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        int arr[] = new int[no];
        int arr1[] = new int[50];
        for (int i = 0; i < no; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < no; i++) {
            int c = 0;
            for (int j = 0; j <= no - 1; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
                arr1[i] = c;
            }
        }
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length - 1]);
    }
}

