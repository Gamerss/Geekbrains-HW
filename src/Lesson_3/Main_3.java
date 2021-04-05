package Lesson_3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main_3 {


    public static void main(String[] args) {
        System.out.println("Введите число: " );
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();


        Random random = new Random();

        int randomInt = random.nextInt(10);

        for (int i = 0; i <10 ; i++) {

        }if (number<randomInt){
            System.out.println("Число меньше");

        }else if(number>randomInt){
            System.out.println("Число больше");
        }else{
            System.out.println("ГЦ");
        }





    }
}