package HomeWork16;

public class Shark extends Animal{
    @Override
    void animal(){
        System.out.println("I'm a shark here is detailed information about my attacks: ");
    }

    void attack(){

        System.out.println("""
                There are two types of attacks, provoked and unprovoked,
                 you can see more by copying and pasting this type of link or just type of link: https://en.wikipedia.org/wiki/Shark_attack
                """);
    }

}
