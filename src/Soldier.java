public class Soldier extends  Man implements  CapableToCombat{

    int personalNumber;

    @Override
    public void report() {
        System.out.println("I am capable to combat like a soldier");
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }
}
