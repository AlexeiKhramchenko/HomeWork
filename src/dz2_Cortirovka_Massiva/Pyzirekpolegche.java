package dz2_Cortirovka_Massiva;
import java.util.Arrays;


public class Pyzirekpolegche {
        public static void main(String[] args) {
            int [] array = {88, 2, 34, 99, 13, 54};//наш массивб можно задать любую длинну или переменные

            boolean peremennaia = false;        //переменная отвечающая отсортирован ли массив
            int vremennaia;                     //временная переменная
            while(!peremennaia) {               //наш цикл
                peremennaia = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        peremennaia = false;

                        vremennaia = array[i];
                        array[i] = array[i+1];
                        array[i+1] = vremennaia;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }