package dz2_Tcikli;

import java.util.Scanner;

public class Tcikli1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j =1; //Название переменной для второго числа в таблице умноэения
        System.out.println("Введите число до которого хотите сделать таблицу умножения");
        int chiclo = in.nextInt();
        for (int i =1; i<=chiclo;i++,j=1){
            System.out.print(i*j+"\t");
            for (j = 1; j<=chiclo;j++){
                System.out.print(j*i+"\t");
            }
            System.out.println('\t');
        }
    }
}

