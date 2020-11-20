public class General extends Man implements  CapableToCombat{

    Commander [] comanders =  new Commander[2];
    @Override
    public void fight() {

    }

    @Override
    public void report() {
        System.out.println("I am capable to combat like a general");
    }
}
