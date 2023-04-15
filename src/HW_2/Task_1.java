package HW_2;

//1.Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Locale;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float s = insertNum();
        System.out.println("Вы ввели: " + s);
    }

    public static float insertNum(){
        while (true){
            try {
                System.out.println("Введите любое число: ");
                Scanner scan = new Scanner(System.in);
                scan.useLocale(Locale.US);
                float num = scan.nextFloat();
                return num;
            } catch (Exception e) {
                System.out.println("Вы ввели не число");
                System.out.println("-".repeat(50));
            }
        }
    }

}



