package dz3_Cortirovka_Massiva;

import java.util.Arrays;

public class SortirovkaVkliycheniem {
    public static void main(String[] args) {
        int [] array = new int[15];
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int) Math.round(Math.random()*200);
        }
        System.out.println(Arrays.toString(array));

        int j;
        int vremennaia;
        for (int i = 0; i < array.length; i++) {
            vremennaia = array[i];
            for(j = i-1; j >= 0 && array[j] > vremennaia; j--){
                array[j+1] = array[j];
            }
            array[j+1] =  vremennaia;
        }

        System.out.println(Arrays.toString(array));

        }
    }

