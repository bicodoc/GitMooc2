public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService govtWork = new CivilService();
        MilitaryService army = new MilitaryService(350);
        
        int govDays = govtWork.getDaysLeft();
        for (int i = 0; i <= govDays; i++) {
            govtWork.work();
        }
        
        System.out.println("Civ Service days left = " + govtWork.getDaysLeft());
        
        int armyDays = army.getDaysLeft();
        for (int i = 0; i <= armyDays; i++) {
            army.work();
        }

        System.out.println("Days left in Army: " + army.getDaysLeft());
    }
}
