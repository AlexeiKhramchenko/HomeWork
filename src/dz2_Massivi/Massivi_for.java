package dz2_Massivi;

import java.util.Scanner;

public class Massivi_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите длинну массива:");
        int dlinna = in.nextInt();
        int[] array = new int [dlinna];
        System.out.println("Надо заполнить массив");
        for (int i =0;i<dlinna;i++){
            array[i]=in.nextInt();
        }
        System.out.print("Сейчас выведем наш массив; {");
        for (int i=0; i<dlinna;i++){
            //if(i%2==0) //для задания 2.2 вывести каждлый второй элемент массива
            System.out.print(array[i]+",");
        }
        System.out.print("}");
        System.out.println();
    }
}
