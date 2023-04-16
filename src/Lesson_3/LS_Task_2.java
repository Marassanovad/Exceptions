package Lesson_3;

// Текст задачи:
// Создайте класс Счетчик, у которого есть метод add(),
// увеличивающий значение внутренней int переменной на 1.
// Сделайте так, чтобы с объектом такого типа можно было работать
// в блоке try-with-resources. Подумайте, что должно происходить
// при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
// При попытке вызвать add() у закрытого ресурса, должен выброситься IOException

import java.io.IOException;

public class LS_Task_2 implements AutoCloseable{
    private int var = 0;

    public void add() throws IOException {
        if (ifClose()) {
            throw new IOException("Ресурс закрыт!");
        }
        var += 1;
    }

    public int getVar() {
        return var;
    }

    @Override
    public void close() {
        var = -1;
    }

    public boolean ifClose() {
        return var < 0;
    }
}

