public class Commander extends Man implements  CapableToCombat{
    Soldier [] soldiers =  new Soldier[3];
    @Override
    public void fight() {

    }

    @Override
    public void report() {
        System.out.println("I am capable to combat like a commander");
    }

    public void setSoldiers(Soldier soldier1, Soldier soldier2, Soldier soldier3) {
        this.soldiers[0] = soldier1;
        this.soldiers[1] = soldier2;
        this.soldiers[2] = soldier3;
    }

    @Override
    public Soldier[] subordinate() {
        return soldiers;
    }
}
