package dz1_PobitovieOperatori;

public class PrioretetOperatorov {
    public static void main(String[] args){
        int a = 5; int b = 2; int c = 8; int d = 7; int e = 20;
        int f = 68; int g = 22;

        System.out.println(a+b/c);// 2/8=0 5+0=5
        System.out.println((a+b)/c);//7/8=0
        System.out.println((a+b++)/8);//7/8=0 в следующую перменную b+1
        b=2;
        System.out.println((a+b++)/--c);// 8-1=7, 7/7=1
        b=2; c=8;
        System.out.println((a*b>>b++)/--c);//10>>2(двоичный код 1010>>2=10-это 2 в десятичном. 2/7=0)
        a=5; b=2; c=8;
        System.out.println((a + d > e ? f:g *b >> b++)/--c);
        //Или можно решить этот пример с помощью if, else
        //if (a + d > e) System.out.println(f / --c);
        //else System.out.println((g * b >> b++) / --c);

       // System.out.println((a + d > e ? f >= f : g * b >> b++) / --c); f>=f Это boolean выражение, с ним не полчается решить
        int q= 6; int r= 2; int t= 3; int p=12; int m = 119;
        System.out.println(q-r>t && p*p<=m);//справа true, слева false поэтому false
        System.out.println(true && false);//true не равно false поэтому false





        }
    }

