package Lesson_3.LS_Task_3;

import java.io.FileNotFoundException;

//        3. Создайте класс исключения, которое будет возникать при попытке
//        открыть несуществующий файл. Исключение должно отображать понятное для
//        пользователя сообщение об ошибке.

public  class FileNotFound extends FileNotFoundException {
    public FileNotFound(){
        super("Файл не найден!");
    }
}

