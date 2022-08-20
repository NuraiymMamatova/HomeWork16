package HomeWork16;

public class Turtle extends Animal{
    @Override
    void animal() {
        System.out.println("I am a turtle about how I can swim you can find out here: ");
    }
    void swim(){
        System.out.println("""
                The slowest are the giant elephant and Galapagos tortoises, whose maximum speed is 4 km / h,
                 and the fastest are the sea tortoises. Their speed is up to 35 km/h.
                 The heavier the turtle's shell, and the colder it is, the slower its speed.
                """);
    }
}
