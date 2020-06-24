package dz3_Cortirovka_Massiva;

import java.util.Arrays;
import java.util.Scanner;

public class SheikernaiaSortirovka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int dlinna = in.nextInt();
        int [] array = new int [dlinna];
        System.out.println("Заполните массив");
        for (int i = 0; i <array.length ; i++) {
            array[i] = in.nextInt();
        }

        int left = 1;
        int right = array.length-1;
        do {
            for (int i = right; i >= left; i--) {
                if (array[i - 1] > array[i]) {
                    int vremennaia = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = vremennaia;
                }

            }
            left++;
            for (int i = left; i <= right; i++) {
                if (array[i - 1] > array[i]) {
                    int vremennaia = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = vremennaia;
                }
            }
            right--;
        }while (left <= right);
        System.out.println(Arrays.toString(array));

    }
}
