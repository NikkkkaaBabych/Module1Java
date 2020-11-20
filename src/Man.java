public class Man implements  CapableToCombat{
    private String name;
    private int age;
    private boolean IsAtTheWar;

    void sayName(){
        System.out.println("My name is " + name);
    }
    @Override
    public void fight() {
        this.goToWar();
    }

    @Override
    public void report() {
        System.out.println("I am capable to combat");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAtTheWar() {
        return IsAtTheWar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void goToWar(){
        IsAtTheWar = true;
    }
    public void WeWin(){
        IsAtTheWar = false;
    }
    Man [] subordinate(){
        return new Man[0];
    }
}
