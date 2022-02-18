package peaksoft;

public class Main {

    public static void main(String[] args) {
	Animal shark = new Shark();
    Animal turtle = new Turtle();
    Animal eagle = new Eagle();
    Animal[] animals = {shark,turtle,eagle};

        for (Animal a:animals) {
            if (a instanceof Shark){
            ((Shark)a).attack();
            }
            if (a.getClass().getName().equals("peaksoft.Shark")){
                ((Shark)a).attack();
            }
            if (a instanceof Turtle) {
                ((Turtle)a).swim();
            }
            if (a.getClass().getName().equals("peaksoft.Turtle")){
                ((Turtle)a).swim();
            }
            if (a instanceof Eagle) {
                ((Eagle)a).fly();
            }
            if (a.getClass().getName().equals("peaksoft.Eagle")){
                ((Eagle)a).fly();
            }
            Shark[] sharks = {(Shark) animals[0]};
            Turtle[] turtles = {(Turtle) animals[1]};
            Eagle[] eagles = {(Eagle) animals[2]};

        }
    }
}