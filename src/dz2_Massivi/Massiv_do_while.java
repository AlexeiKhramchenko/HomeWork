package dz2_Massivi;

import java.util.Scanner;

public class Massiv_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int dlinna = in.nextInt();
        int [] array = new int [dlinna];
        System.out.println("Теперь нужно заполнить массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Теперь мы выведем массив: {");
        int i =0;
        do{
            System.out.print(array[i]+",");
            i++;
        }while (i<dlinna);
        System.out.print("}");
    }
}
