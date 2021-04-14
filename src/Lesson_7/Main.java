package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5),new Cat("Myrzik", 15),new Cat("Snezhok", 21)};


        Plate plate = new Plate(40);
        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.catInfo();

//            plate.addFood(); // возможность добавить еды
        }
    }
}
