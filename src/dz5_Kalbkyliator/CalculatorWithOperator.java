package dz5_Kalbkyliator;

public class CalculatorWithOperator {
    public double plus (double a, double b){
        return a + b; }
    public double minus (int a, int b){

        return  a - b;
    }
    public double div (int a, int b){

        return a / b;
    }
    public double multiply (int a, int b){

        return a * b;
    }
    public double degree (double a, double b){
        double result = a;
        for (int i = 1; i < b ; i++) {
            result *= a;
        }
        return result;
    }
    public double module (double a, double b) {
        double result = a;
        if (a < 0) {
            return a * (-1);
        } if (a > 0) {
            return a;
        } else{
            return a;
        }
    }
    public double square_root (double a, double b){
        double result = a;
        double x = 0.1;
            for (int i = 1; result <= a ; i++) {
                if(x < a) {
                    result = x * x;
                    x = x + 0.1;
                }
            }
        double scale = Math.pow(10, 1);
        x = Math.ceil(x * scale) / scale;
        return x-0.1;


    }

}
