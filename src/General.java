public class General extends Man implements  CapableToCombat{

    Commander [] comanders =  new Commander[2];

    @Override
    public void report() {
        System.out.println("I am capable to combat like a general");
    }
    public void setComanders(Commander comanders1, Commander comanders2) {
        this.comanders[0] = comanders1;
        this.comanders[1] = comanders2;
    }

    @Override
    public Commander[] subordinate() {
        return comanders;
    }
}
