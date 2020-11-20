public class General extends Man implements  CapableToCombat{

    Commander [] commanders =  new Commander[2];

    @Override
    public void report() {
        System.out.println("I am capable to combat like a general");
    }
    public void setCommanders(Commander commanders1, Commander commanders2) {
        this.commanders[0] = commanders1;
        this.commanders[1] = commanders2;
    }

    @Override
    public Commander[] subordinate() {
        return commanders;
    }
}
