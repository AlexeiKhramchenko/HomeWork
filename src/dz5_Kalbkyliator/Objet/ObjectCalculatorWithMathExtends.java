package dz5_Kalbkyliator.Objet;

import dz5_Kalbkyliator.CalculatorWithMathExtends;

public class ObjectCalculatorWithMathExtends extends CalculatorWithMathExtends {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc0 = new CalculatorWithMathExtends();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double variable = (calc0.plus(4.1,(calc0.plus(calc0.multiply(15,7),Math.pow((calc0.div(28,5)),2)))));
        System.out.println(variable);
        System.out.println(variable/0); // на 0 делить нелья
        System.out.println(variable/0.0d); // на 0 делить нельзя
    }
}
