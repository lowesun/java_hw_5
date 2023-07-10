package lesson_5;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private static int num = 0;
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();
        pb.add("Соколов", "8(495)137-34-44");
        pb.add("Федоров", "8(495)183-39-92");
        pb.add("Крылов", "8(495)692-79-37");
        pb.add("Агеечев", "8(495)110-98-42");
        pb.add("Ефимов", "8(495)490-27-05");
        pb.add("Ермаков", "8(495)882-88-54");
        pb.add("Лебедев", "8(495)462-39-09");
        pb.add("Смирнов", "8(495)190-04-24");
        pb.add("Ермаков", "8(495)141-94-78");
        pb.add("Соколов", "8(495)247-79-75");

        for (String x : pb.get("Соколов")) {
            num++;
            System.out.println("Соколов " + num + " телефон: " + x);
        }
    }

    public void add(String surname, String phone) {
        ArrayList<String> strings = phoneMap.get(surname); 
        System.out.println("String = " + strings);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }

    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}