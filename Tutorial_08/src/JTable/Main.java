package JTable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();

        Student s1 = new Student("Pasindu Marambe", "10");
        Date dobS1 = new Date(25, 05, 2000);
        s1.setDateOfBirth(dobS1);
        list.add(s1);

        Student s2 = new Student("Dilan Sasanjaya", "12");
        Date dobS2 = new Date(23, 07, 1999);
        s2.setDateOfBirth(dobS2);
        list.add(s2);

        Teacher t1 = new Teacher("Saman Perera", 30000);
        Date dobT1 = new Date(10, 10, 1965);
        t1.setDateOfBirth(dobT1);
        list.add(t1);

        Teacher t2 = new Teacher("Ruwan Darshana", 30000);
        Date dobT2 = new Date(01, 04, 1975);
        t2.setDateOfBirth(dobT2);
        list.add(t2);

        PersonTable table = new PersonTable(list);
        table.setVisible(true);


    }
}
