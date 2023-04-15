package HW_2;

//4.Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите что-хотите: ");
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        String a = scan.nextLine();
        if (a.isEmpty()) {
            throw new Exception("Пустая строка");
        } else {
            System.out.println();
            System.out.println("Вы ввели: " + a);
        }
    }
}


