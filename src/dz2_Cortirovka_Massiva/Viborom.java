package dz2_Cortirovka_Massiva;

import java.util.Scanner;

public class Viborom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну масива");
        int dlinna = in.nextInt();
        int [] array = new int [dlinna];
        System.out.println("Заполните массив");
        for (int i = 0; i < dlinna; i++) {
            array[i]= in.nextInt();
        }

        for (int i = 0; i < dlinna; i++) {
            int maloe = array[i];
            int maloe1 = i;
            for(int j =i+1;j<dlinna;j++){
                if (array[j]<maloe){
                    maloe = array[j];
                    maloe1 = j;
                }
            }
            if (i!=maloe1){
                int peremennaia = array[i];
                array[i] = array[maloe1];
                array[maloe1]=peremennaia;
            }
            System.out.print(array[i]+" ");
        }


    }
}
