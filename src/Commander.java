public class Commander extends Man implements  CapableToCombat{
    Soldier [] soldiers =  new Soldier[3];
    @Override
    public void fight() {

    }

    @Override
    public void report() {
        System.out.println("I am capable to combat like a commander");
    }
}
