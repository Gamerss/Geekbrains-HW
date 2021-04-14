package Lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }
    public void catInfo (){
        System.out.println(name + " Сытость = "+ satiety);
    }

    void eat(Plate plate) {
     if(satiety && plate.decreaseFood(appetite))
         satiety=true;

        else {
            satiety=false;
         System.out.println("Не поел "+ name);

     }
    }
}
