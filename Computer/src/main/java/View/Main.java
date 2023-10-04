package View;

import Controller.Manager;

public class Main {

    private static Manager manager = new Manager();

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = manager.mennu();
            switch (choice) {
                case 1:
                    manager.normalCalculator();
                    break;
                case 2:
                    manager.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }

    }
}
