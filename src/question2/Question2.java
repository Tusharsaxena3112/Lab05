package question2;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        int arr[] = new int[no];
        int arr1[] = new int[50];
        for (int i = 0; i <= no - 1; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i <= no - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                arr[i] = 0;
                arr1[j] = arr[i + 1];
                j = j + 1;
            }
        }
    }
}
