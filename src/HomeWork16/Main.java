package HomeWork16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shark shark  = new Shark();
        Eagle eagle = new Eagle();
        Turtle turtle = new Turtle();
        Animal  [] animals = {shark,eagle,turtle};
        for (Animal i:animals) {
            if (( i instanceof Shark)){
                int counter =0;
                Shark []sharks = new Shark[1];
                sharks[counter]=shark;
                System.out.println("--------------------");
                i.animal();
                shark.attack();

            }
            else if (i.getClass().getSimpleName().equals("Eagle")){
                int counter=0;
                Eagle []eagles = new Eagle[1];
                eagles[counter]=eagle;
                System.out.println("--------------------");
                i.animal();
                eagle.fly();
            }
            else {
                int counter =0;
                Turtle[] turtles = new Turtle[1];
                turtles[counter]=turtle;
                System.out.println("--------------------");
                i.animal();
                turtle.swim();
                System.out.println("--------------------");
            }
        }





    }
    }
