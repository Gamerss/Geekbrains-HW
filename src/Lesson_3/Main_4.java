package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        randomNumGame();

    }
    public static void randomNumGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(10);

        int attempt = 0;
      while (attempt<3) {
          System.out.println("Введите число от 0 до 9 : ");
          int number = scanner.nextInt();

          if (number < randomInt) {
              System.out.println("Число меньше. ");
          } else if (number > randomInt) {
              System.out.println("Число больше. ");

          } else if (number == randomInt) {
              System.out.println("Поздравляю с правильным ответом ");

          }
          attempt++;
      }
        System.out.println("Попытки исчерпаны");
      while (true){
          System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
          int number = scanner.nextInt();
          if (number==1){
              randomNumGame();

          }else {
              break;
          }
      }
    }
}
