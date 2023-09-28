package org.example;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");

        try {
            String string = scanner.nextLine();
            if (string.equals("")) throw new RuntimeException("Строка не может быть пустой!");
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
