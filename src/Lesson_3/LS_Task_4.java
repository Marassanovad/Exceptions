package Lesson_3;

// **Текст задачи:**
//     Напишите метод, на вход которого подаётся двумерный строковый
//     массив размером 4х4. При подаче массива другого размера необходимо
//     бросить исключение MyArraySizeException.
//
//    1. Далее метод должен пройтись по всем элементам массива,
//    преобразовать в int и просуммировать. Если в каком-то элементе
//    массива преобразование не удалось (например, в ячейке лежит символ
//    или текст вместо числа), должно быть брошено исключение
//    MyArrayDataException с детализацией, в какой именно ячейке
//    лежат неверные данные.
//
//    2. В методе main() вызвать полученный метод, обработать
//    возможные исключения MyArraySizeException и MyArrayDataException
//    и вывести результат расчета (сумму элементов, при условии что
//    подали на вход корректный массив).


public class LS_Task_4 {
    public static void main(String[] args) {
        String [][] myArray = new String[][]{{"1", "dgh", "4", "6"},{"2", "4", "5", "7"},{"1", "2", "4", "6"},{"2", "4", "5", "7"}};
        try {
            System.out.println(sumArray(myArray));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static int sumArray(String [][] argArray) throws Exception {
        int sumArr = 0;
        if (argArray.length != 4 || argArray[0].length != 4) {
            throw new myArraySizeException();
        } else {
            for (int i = 0; i < argArray.length; i++) {
                for (int j = 0; j < argArray.length; j++) {
                    try {
                        sumArr += Integer.parseInt(argArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new myArrayDataException(i, j);
                    }
                }
            }
        }
        return sumArr;

    }
    public static class myArraySizeException extends Exception {
        public myArraySizeException() {
            super("Размер массива не равен 4x4!");
        }
    }
    public static class myArrayDataException extends Exception {

        public myArrayDataException(int indexI, int indexJ) {
            super("Ячейка массива с индексами " + indexI + " "+ indexJ + " не содержит числовые данные!");

        }
    }

}
