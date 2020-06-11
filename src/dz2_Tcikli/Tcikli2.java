package dz2_Tcikli;

import java.util.Scanner;

public class  Tcikli2 {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("Введите число ");
        int chiclo = in.nextInt();
        int sum = 1;
        int i=1;
        while (i <= chiclo){
            sum *= i;
            i++;
            }
            System.out.println("Перемноженная сумма всех чисел числа равна: "+sum);

        }
    }
