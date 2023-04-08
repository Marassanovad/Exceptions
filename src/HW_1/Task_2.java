package HW_1;
// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,т.е. ваше.


public class Task_2 {
    public static void main(String[] args) {
        int [] array1 = {8,7,6,5,4,3,2,1};
        int [] array2 = {1,2,3,4,5,6};
        int [] array3 = {0,2,3,4,0,6,7,8};
        int [] array5 = {1,2,3,4,5,8,7,8};
        int [] array4;

//        Connect(array1,array2);
//        Connect(array1,array3);
        Connect(array1,array5);

    }



    public  static void Connect (int [] array1, int [] array2){

        //        метод для проверки длин массивов
        if (array1.length != array2.length) {
            throw new RuntimeException("Разная длина массивов");
        }

        //         метод для деления на 0
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("На ноль делить нельзя");
            }
        }
        int [] array3 = new int [array1.length];

//        метод для соединения массивов
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j]/array2[j];
            System.out.print(array3[j] + " ");
        }
    }
}

