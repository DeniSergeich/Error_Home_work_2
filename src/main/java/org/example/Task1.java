package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.printf("Вы ввели: %s", EntryFloat());

    }

    public static float EntryFloat() throws NumberFormatException {

        Scanner scanner = new Scanner(System.in);

        float value = 0;

        while (true) {
            try {
                System.out.print("Введите число: ");
                value = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите число!");
            }
        }
        return value;
    }
}
