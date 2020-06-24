package dz3_Cortirovka_Massiva;

import java.util.Arrays;

public class SortirovkaRazdeleniem {
    public static void main(String[] args) {
        int[] array = {73, 24, 96, 1, 12, 82, 3, 95, 16};
        System.out.println(Arrays.toString(array));

        array = sort (array, 0, array.length-1);




        System.out.println(Arrays.toString(array));
    }
    public static int [] sort (int [] array, int left, int right){
        int i = left;
        int j = right;
        int opora = i-(i-j)/2;
        while (i < j){
            while ((i<opora) && (array[i] <= array[opora]))
                i++;
            while ((j>opora) && (array[j] >= array[opora]))
                j--;
            if (i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == opora)opora=j;
                else if (j == opora) opora = i;
            }
        }

        return array;
    }
}
