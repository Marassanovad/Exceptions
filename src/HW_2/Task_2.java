package HW_2;

//2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task_2 {
    public static void main(String[] args) {
        try {
//            int d = 0; // на ноль делить нельзя
            int d =1;
            int [] intArray = {1,2,3,4,5,6,7,8,9};

            double catchedRes1 = intArray[8] / d;
            // intArray не инициализирован
            // + не факт что в этом массиве 9 элементов (9 потому что отсчет начинается с 0)
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            // тут у нас будет как минимум 2 исключения
            //1. ArithmeticException
            //2. ArrayIndexOutOfBoundsException
            System.out.println("Catching exception: " + e);
        }

    }



}
