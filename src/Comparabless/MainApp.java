package Comparabless;

import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {


        Persons persons = new Persons();
        persons.addData(new Biodata("Mikhael" , "Indonesia"));
        persons.addData(new Biodata("Aldi" , "Indonesia"));
        persons.addData(new Biodata("Edo" , "Indonesia"));

        Collections.sort(persons.getData());
        System.out.println(persons.getData());


    }
}
