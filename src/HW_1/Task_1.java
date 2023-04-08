package HW_1;
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


public class Task_1 {

    public static void main(String[] args) {
        int [] array1 = {8,7,6,5,4,3,2,1};
        int [] array2 = {1,2,3,4,5,6};
        int [] array3 = {1,2,3,4,5,6,7,8};

        if (Exception1(array1, array2) == -1) {
            System.out.println("Длина массивов разная");
        } else {
            int [] array4;
            array4 = Connect(array1,array2);
            for (int i = 0; i <array4.length ; i++) {
                System.out.println(array4[i]);
            }
        }
        if (Exception1(array1, array3) == -1) {
            System.out.println("Длина массивов разная");
        } else {
            int [] array4;
            array4 = Connect(array1,array3);

            for (int i = 0; i <array4.length ; i++) {
                System.out.print(array4[i] + " ");
            }
        }

    }

    public static int Exception1 (int [] array1, int [] array2) {

//        метод для проверки длин массивов
        if (array1.length != array2.length) {
            return -1;
        } else return 0;

    }

    public  static int [] Connect (int [] array1, int [] array2){

        int [] array3 = new int [array1.length];

//        метод для соединения массивов
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i]-array2[i];
        }
        return array3;
    }
}