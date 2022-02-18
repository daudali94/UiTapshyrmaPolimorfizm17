package peaksoft;

public class Shark extends Animal{
    public void attack() {System.out.println("Змея нападает");}

    @Override
    public void eat() {
        super.eat();
    }
}
