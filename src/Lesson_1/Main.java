package Lesson_1;

public class Main {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println(calculate(2, 2, 2, 2));
        System.out.println(task10and20(5, 3));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(3));
        name ("Denis");


    }


    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    public static void variables() {
        byte b = 1;
        short s = 12;
        int i = 23;
        long l = 123123123123L;
        float f = 12.32f;
        double d = 12.33;
        char c = 'A';
        boolean boolT = true;
        boolean boolF = false;


    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }


//    4. Написать метод, принимающий на вход два числа,
//    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;

    }
    // 5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали,
    // или отрицательное; Замечание: ноль считаем положительным числом.
       ;


    public static void isPositiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательно");
        }



    }
    //6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative (int a){
        if (a<0){
        return true;
    }else{
            return false;
        }

    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void name (String n){
        System.out.println("Привет " + n);
    }

}


