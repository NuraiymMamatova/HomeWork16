package HomeWork16;

public class Eagle extends Animal{
    @Override
    void animal() {
        System.out.println("I'm an eagle about how I can fly you can find out here: ");
    }

    void fly(){
        System.out.println("""
                Many forest-dwelling eagles, including the very large harpy, have relatively short wingspans,
                 necessary to be able to maneuver in quick, short bursts through dense forests.
                 Eagles of the genus Aquila., found almost exclusively in open country,
                 are known for their ability to soar and have relatively long wings for their size.
                """);
    }
}
