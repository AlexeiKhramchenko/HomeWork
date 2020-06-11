package dz2_Tcikli;

import java.util.Scanner;

public class  Tcikli3 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Введите число ");
        int chiclo = in.nextInt();
        int sum = 1;
        int n =1;
        for (;chiclo>0; chiclo /= 10){
            n = chiclo%10;
            sum *= n;

        }
        System.out.println("Перемноженная сумма всех чисел числа равна: "+sum);

    }
}