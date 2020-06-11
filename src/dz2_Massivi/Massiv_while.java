package dz2_Massivi;

import java.util.Scanner;

public class Massiv_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int dlinna = in.nextInt();
        int[] array = new int [dlinna];
        System.out.println("Заполните массив числами");
        for (int i = 0; i < dlinna; i++) {
            array[i]=in.nextInt();
        }
        System.out.print("Теперь мы выведем массив: {");
        int i = 0;
        while (i< dlinna) {
            //if(i%2==0)
            System.out.print(array[i] + ",");
            i++;
        }
        System.out.print("}");
    }
}

