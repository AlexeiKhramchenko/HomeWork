package dz3_Cortirovka_Massiva;

import java.util.Arrays;
import java.util.Scanner;

public class SortirovkaSliyaniem {
    public static void main(String[] args) {
        int array_lenght = 10;

        int [] array = new int [array_lenght];
        for (int i = 0; i < array_lenght; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] result = sliyaniem (array);
        for (int i = 0; i < array_lenght; i++) {
            System.out.print(result[i]+ " ");
        }

    }
    public static int [] sliyaniem(int [] array){
        int [] array1 = Arrays.copyOf(array,array.length);
        int [] array2 = new int [array.length];
        int [] result = sortirovka (array1, array2, 0, array.length);

        return result;
    }


    public static int [] sortirovka (int [] array1, int [] array2, int startIndex, int endIndex){
        if (startIndex >= endIndex - 1) {
            return array1;
        }
            int peremennaia = startIndex + (endIndex - startIndex) / 2;
            int [] sort1 = sortirovka(array1, array2, startIndex, peremennaia);
            int [] sort2 = sortirovka(array1, array2, peremennaia, endIndex);
            int index1 = startIndex;
            int index2 = peremennaia;
            int destIndex = startIndex;
            int [] result = sort1 == array1 ? array2 : array1;
            while (index1< peremennaia && index2 < endIndex){
                result[destIndex++] = sort1[index1] < sort2[index2] ? sort1[index1++] : sort2[index2++];
            }
            while (index1 < peremennaia){
                result[destIndex++] = sort1[index1++];
            }
            while (index2 <endIndex){
                result[destIndex++] = sort2[index2++];
            }
            return result;

    }

}
