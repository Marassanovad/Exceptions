package HW_3;

//Напишите приложение, которое будет запрашивать у пользователя следующие данные
// в произвольном порядке, разделенные пробелом:

//        Фамилия Имя Отчество датарождения номертелефона пол
//        Форматы данных:
//        фамилия, имя, отчество - строки
//        дата_рождения - строка формата dd.mm.yyyy
//        номер_телефона - целое беззнаковое число без форматирования
//        пол - символ латиницей f или m.
// Приложение должно проверить введенные данные по количеству.
// Если количество не совпадает с требуемым, вернуть код ошибки,
// обработать его и показать пользователю сообщение, что он ввел меньше
// и больше данных, чем требуется.
//
// Приложение должно попытаться распарсить полученные значения и выделить из
// них требуемые параметры. Если форматы данных не совпадают, нужно бросить
// исключение, соответствующее типу проблемы. Можно использовать встроенные
// типы java и создать свои. Исключение должно быть корректно обработано,
// пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием,
// равным фамилии, в него в одну строку должны записаться полученные данные, вида
//<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//        Не забудьте закрыть соединение с файлом.
//        При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Task_1 {
    public static void main(String[] args) throws myArraySizeEx {
        String [] person = textDivisionAndFilter();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        try (FileWriter writer = new FileWriter(person[0]+".txt", true)) {
            writer.write(Arrays.toString(person) + "\n");

            writer.flush();


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }


    public static String inputDate(){
        try {
            System.out.println("Вам надо будет вести: Фамилия, Имя, Отчество, дата рождения, номер телефона, пол(f или m)");
            System.out.println("Пример: Ким Даша В. 21.03.2001 f +12345678901 ");
            System.out.println("Введите данные в любом порядке, через пробел: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            return str;
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static boolean isPhoneNumber(String s) {
        return s != null && s.matches("(\\+*)\\d{11}");
    }
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }

    public static boolean isDate(String s) throws ParseException {
        try{
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            format.parse(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public static String [] textDivisionAndFilter() throws myArraySizeEx {

        String [] person = new String[6];

        String [] words = inputDate().split("\\p{Space}");
        if(words.length != 6){
            throw new myArraySizeEx();
        } else{
            for (int i = 0; i < words.length; i++) {
                try {
                    if ((words[i].equals("f") || words[i].equals("m")) && person[5] == null) {
                        person[5] = words[i];
                    } else if (isPhoneNumber(words[i]) && person[4] == null) {
                        person[4] = words [i];
                    } else if (isDate(words[i]) && person[3] == null){
                        person[3] = words[i];
                    } else if (isAlpha(words[i]) && person[0] == null){
                        person[0] = words[i];
                    } else if (isAlpha(words[i]) && person[1] == null) {
                        person[1] = words[i];
                    } else if (isAlpha(words[i]) && person[2] == null) {
                        person[2] = words[i];
                    } else {
                        throw new myArrayDataEx();
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return person;
    }

}




