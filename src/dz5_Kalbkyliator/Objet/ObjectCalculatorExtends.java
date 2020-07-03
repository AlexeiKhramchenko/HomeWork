package dz5_Kalbkyliator.Objet;

import dz5_Kalbkyliator.CalculatorWithOperator;

public class ObjectCalculatorExtends extends CalculatorWithOperator {
    public static void main(String[] args) {
    CalculatorWithOperator calc1 = new CalculatorWithOperator();
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double variable = (calc1.plus(4.1,(calc1.plus(calc1.multiply(15,7),calc1.degree((calc1.div(28,5)),2)))));
        System.out.println(variable);
        System.out.println(variable/0); // на 0 делить нелья
        System.out.println(variable/0.0d); // на 0 делить нельзя
    }
}