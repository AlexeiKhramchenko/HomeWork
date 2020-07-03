package dz5_Kalbkyliator;

public class Color {
    private int numberColor;
    private String color;
   final int red = 1;
   final int orange = 2;
   final int yellow = 3;
   final int green = 4;
   final int blue = 5;
   final int blue1 = 6;
   final int purple = 7;

    public int getNumberColor() {
        return numberColor;
    }
    public String getColor() {
        this.color = color;
        switch (numberColor){
            case red:
                color = "красный";
            break;
            case orange:
                color = "оранжевый";
            break;
            case yellow:
                color = "желтый";
            break;
            case green:
                color = "зеленый";
            break;
            case blue:
                color = "голубой";
            break;
            case blue1:
                color = "синий";
            break;
            case purple:
                color = "фиолетовый";
            break;
            default:
                color = "нет такого цвета";
            break;
        }
        return color;
    }

    public Color(int numberColor){
        this.numberColor = numberColor;

    }
}
