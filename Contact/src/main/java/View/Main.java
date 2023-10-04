package View;

import Controller.Manager;
import Model.Contact;
import java.util.ArrayList;

public class Main {

    public static Manager manager = new Manager();

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "TamThai", "Star", "TK", "1234567890", "Tam", "Thai"));
        lc.add(new Contact(2, "QuocCu", "Star", "TX", "1234567890", "Quoc", "Cu"));
        lc.add(new Contact(3, "MotCu", "Star", "TA", "1234567890", "Mot", "Cu"));
        //loop until user want to exit
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.createContact(lc);
                    break;
                case 2:
                    manager.printAllContact(lc);
                    break;
                case 3:
                    manager.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
