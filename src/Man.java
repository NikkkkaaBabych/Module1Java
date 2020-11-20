public class Man implements CapableToCombat{
    String name;
    int age;
    void sayName(){
        System.out.println("My name is " + name);
    }

    @Override
    public void fight() {

    }

    @Override
    public void report() {
        System.out.println("I am capable to combat");
    }
}
