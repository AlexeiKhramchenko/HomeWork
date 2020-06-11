import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();

        if(name.equals("Вася")){

            System.out.print("Привет \n" + "Я тебя так долго ждал "+name);
        }
        else if (name.equals("Анастасия")){
            System.out.print("Я тебя так долго ждал "+ name);
        }
        else {
            System.out.print("Добрый день, а вы кто?");
        }
        in.close();
    }
}