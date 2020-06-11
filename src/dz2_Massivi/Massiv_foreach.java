package dz2_Massivi;

import java.util.Scanner;

public class Massiv_foreach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int dlinna = in.nextInt();
        int [] arrays = new int[dlinna];
        System.out.println("Теперь надо заполнить массив");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i]=in.nextInt();
        }
        System.out.print("Теперь выведем наш массив: {");
        for (int array  : arrays){
            //if(array%2==0) // Если нам нужно вывести только четные числа, нужно добавить эту строку
            System.out.print(array+",");
        }
        System.out.println("}");
    }
}
