import java.util.Scanner;

public class Name2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        switch (name){
            case "Вася":
                System.out.print("Привет \n" + "Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.print("Я тебя так долго ждал");
                break;
            default:
                System.out.print("Добрый день, а вы кто?");
        }
        in.close();
    }
}