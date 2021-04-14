package Lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n){
        int diff = food -n ;
        if(diff<0)return false;

        food -=n;
        return true;
    }
    void addFood(){
     food +=10;
    }

            public void info () {
            System.out.println("В тарелке " +" "+ food + " Еды");
        }

}

