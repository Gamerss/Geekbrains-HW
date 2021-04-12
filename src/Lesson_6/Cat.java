package Lesson_6;

class Cat extends Animals {

    protected boolean sweem;


    public Cat(String name, int run, boolean sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }
        public void catInfo () {
            System.out.println("CatName: " + name + " /RunLimit: " + run + " meters/" + " /Sweem:" + sweem + " meters/");
        }

    }


