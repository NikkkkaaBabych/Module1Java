public class Soldier extends  Man implements  CapableToCombat{

    int personalNumber;
    boolean IsAtTheWar;

    public Soldier(){

    }

    @Override
    public void fight() {

    }

    @Override
    public void report() {
        System.out.println("I am capable to combat like a soldier");
    }
}
