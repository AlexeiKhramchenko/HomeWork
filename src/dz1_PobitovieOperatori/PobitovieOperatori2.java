package dz1_PobitovieOperatori;

public class PobitovieOperatori2 {

    public static void main(String[] args) {
        int x = -42;//Двоичный код 101010
        int y = -15;//Двоичный код  1111


        //Побитовый оператор NOT
        System.out.println(~x);//Двоичный код (41) 101001
        System.out.println(~y);//Двоичный код (14) 1110

        //Побитовый оператор AND
        System.out.println(x&y);//Двоичный код (-48) 11111111111111111111111111010000

        //Побитовый оператор AND с присваиванием x= x&y и потом опять делаем оператор AND
        System.out.println((x&y)&y);//Двоичный код (-48) 11111111111111111111111111010000

        //Побитовый оператор OR
        System.out.println(x|y);//Двоичный код (-9) 11111111111111111111111111110111

        //Побитовый оператор OR с присваиванием x= x|y и потом опять делаем оператор OR
        System.out.println((x|y)|y);//Двоичный код (-9) 11111111111111111111111111110111

        //Побитовый исключающее OR
        System.out.println(x^y);//Двоичный код (39) 100111

        //Побитовый исключающее OR c присваиванием x= x^y и потом опять делаем оператор OR
        System.out.println((x^y)^y);//Двоичный код (-42) 11111111111111111111111111010110

        //Сдвиг влево
        System.out.println(x << y);//Двоичный код (-5505024) 11111111101011000000000000000000

        //Сдвиг влево с присваиванием x<<=y и потом опять делаем присваивание
        System.out.println((x << y)<<y);//Двоичный код (0) 0

        //Сдвиг вправо
        System.out.println(x >> y);//Двоичный код (-1) 11111111111111111111111111111111

        //Сдвиг вправо с присваиванием x>>=y и потом опять делаем присваивание
        System.out.println((x >> y)>>y);//Двоичный код (-1) 11111111111111111111111111111111

        //Сдвиг вправо с заполнением нулями
        System.out.println(x >>> y);//Двоичный код (32767) 111111111111111

        //Сдвиг вправо с заполнением нулями с присваиванием и потом еще раз Сдвиг вправо с заполнением нулями
        System.out.println((x >>> y)>>>y);//Двоичный код 0

    }
}