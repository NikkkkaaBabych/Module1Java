public class MainClass {
    public static void main(String[] args) {
        Man headquarters [] = new Man[9];

        Object I = new Man();

        for (int i = 0; i < 9; i++) {

            if (i <= 5) {
                Soldier A = new Soldier();
                A.setPersonalNumber(i);
                headquarters[i] = A;
            }
            if (i == 6) {
                Commander A = new Commander();
                A.setSoldiers((Soldier)headquarters[0], (Soldier)headquarters[1], (Soldier)headquarters[2]);
                headquarters[i] = A;
            }
            if (i == 7) {
                Commander A = new Commander();
                A.setSoldiers((Soldier)headquarters[3], (Soldier)headquarters[4], (Soldier)headquarters[5]);
                headquarters[i] = A;
            }
            if (i == 8){
                General A = new General();
                A.setCommanders((Commander)headquarters[6], (Commander)headquarters[7]);
                headquarters[i] = A;
            }
            headquarters[i].setName("man" + i);
            headquarters[i].setAge(40 + i);
        }

        for (int i = 0; i < 9; i++) {
            System.out.println(i + " " + headquarters[i].getName() + " " + headquarters[i].getAge());
            headquarters[i].report();
            headquarters[i].fight();
            if (i >= 6) {
                System.out.println("My subordinaters");
                Man subords [] = headquarters[i].subordinate();
                for (Man man : subords) {
                    System.out.println(man.getName() + ", ");
                }
            }

        }
    }

}
