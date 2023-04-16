package Lesson_3;

public class LS_Task_1 {

// **Текст задачи:**

// Создайте метод doSomething(), который может быть источником одного из типов
// checked exceptions (тело самого метода прописывать не обязательно).
// Вызовите этот метод из main и обработайте в нем исключение, которое
// вызвал метод doSomething().
//


    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception" + e.getMessage());
        }
    }

    private static void doSomething() throws IndexOutOfBoundsException {
        System.out.println();
    }
}
