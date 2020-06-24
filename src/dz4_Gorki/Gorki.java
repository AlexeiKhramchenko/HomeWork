package dz4_Gorki;

import java.util.Arrays;
import java.util.Scanner;

public class Gorki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество колец, не менее 3");
        int kolichestvo = in.nextInt();
        int sterzenb = 3;

        if (kolichestvo < 3){
            System.out.println("Колличество колец должно быть не меньше 3");
            return;
        }
        int [][] array = new int [kolichestvo][sterzenb];
        for (int i = 0; i < array.length; i++) {
            array[i][0] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i][array.length-1] == 0){
                System.out.println("Игра не закончена");
                break;
            }
        }
        printarray(array);

        while (!checkEndGame(array)) {
            int operation =getNextOperation();
            if (operation == 7){
                System.out.println("Очень жаль");
            }
            int[] indexs = getIndexForOperation(operation);
            moveElement(indexs[0], indexs[1], array);
            printarray(array);
        }

    }

    /**
     * Перемещение кольца со штыря на штырь
     * @param from индекс откуда перемещаем
     * @param to индекс куда перемещаем
     * @param array карта на которой перемещаем
     */
    public static void moveElement (int from, int to, int [][] array){
        if (from < 0 || to < 0 ){
            System.out.println("Вы выбрали неизвестный номер операции");
            return;
        }

        //итерируем ячейки штыря
        for (int i = 0; i < array.length; i++) {
            int fromValue =  array[i][from];
            if (fromValue != 0){
                for (int j = 0; j < array.length; j++) {
                    int toValue = array[j][to];
                    if (j == 0 && toValue != 0){
                        System.out.println("Штырь переполнен");
                        continue;
                    } else if (toValue < fromValue && toValue !=0){
                        System.out.println("Со штыря" + from + "на штырь" + to + "нельзя перемещать");
                        continue;
                    } else if (toValue > fromValue) {
                        array[i][from] = 0;
                        array[j-1][to] =  fromValue;
                        break;
                    } else if (j + 1 == array.length){
                        array[i][from] = 0;
                        array[j][to] =  fromValue;
                    }
                }
                break;
            }
        }
    }

    /**
     * Проверяем закончина ли игра
     * @param array карта
     * @return true - закончена игра или false незакончена
     */
    public static boolean checkEndGame (int [][] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i][array.length - 1] == 0) {
                System.out.println("Игра не закончена");
                return false;
            }
        }
        return true;
    }

    /**
     * Получить индексы штырей ск оторого и на который перемешать надо
     * @param operation номер действия пользователя
     * @return массив 1 элемент откуды перемещаем, 2 куда пермещаем
     */
    public static int[] getIndexForOperation(int operation){

        int from = -1, to = -1;
        switch (operation){
            case 1:
                from = 0;
                to = 1;
                break;
            case 2:
                from = 0;
                to = 2;
                break;
            case 3:
                from = 1;
                to = 0;
                break;
            case 4:
                from = 1;
                to = 2;
                break;
            case 5:
                from = 2;
                to = 0;
                break;
            case 6:
                from = 2;
                to = 1;
                break;
        }

        return new int[]{ from, to };
    }

    /**
     * Получить следующие дествия пользователя
     * @return номер дейсвтия
     */
    public static int getNextOperation(){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите куда будем перемещать блины");
        System.out.println("1) 1 >> 2");
        System.out.println("2) 1 >> 3");
        System.out.println("3) 2 >> 1");
        System.out.println("4) 2 >> 3");
        System.out.println("5) 3 >> 1");
        System.out.println("6) 3 >> 2");
        System.out.println("7) Выйти из игры");

        return in.nextInt();

    }
    /**
     * Печать игрового поля
     * @param array игровое моле
     */
    public static void printarray (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int value = array[i][j];
                if (value == 0){
                    System.out.print("* ");
                }else{
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
}
