package dz5_Kalbkyliator.Objet;

import dz5_Kalbkyliator.CalculatorWithMathCopy;

public class ObjectCalculatorWithMathCopy extends CalculatorWithMathCopy {
    public static void main(String[] args) {

        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double variable = (calc2.plus(4.1, (calc2.plus(calc2.multiply(15, 7), Math.pow((calc2.div(28, 5)), 2)))));
        System.out.println(variable);
        System.out.println(variable / 0); // на 0 делить нелья
        System.out.println(variable / 0.0d); // на 0 делить нельзя
    }
}
