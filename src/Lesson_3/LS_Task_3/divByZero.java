package Lesson_3.LS_Task_3;

//        1. Создайте класс исключения, который будет выбрасываться при делении на 0.
//        Исключение должно отображать понятное для пользователя сообщение об ошибке.

public class divByZero extends ArithmeticException {
    public divByZero() {
        super("На ноль делить нельзя");
    }
}
