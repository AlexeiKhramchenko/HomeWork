package dz5_Kalbkyliator;

import java.util.Scanner;

public class ObjectColor extends Color {
    public ObjectColor(int numberColor) {
        super(numberColor);
    }

    public static void main(String[] args) {

        Color color1 = new Color(3);
        System.out.println(color1.getColor());
        System.out.println(color1.getNumberColor());
    }
}
