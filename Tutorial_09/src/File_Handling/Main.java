package File_Handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while(!exit){
            System.out.println("Menu:");
            System.out.println("1 - Add Student in the List and save to file");
            System.out.println("2 - Read Students List from a file and display on the screen");
            System.out.println("3 - Exit");
            System.out.print("Enter your choice: ");
            int m = sc.nextInt();
            switch (m) {
                case 1:
                    System.out.println("Enter name Student :");
                    String name = sc.next();

                    System.out.println("Enter ID Student :");
                    int id = sc.nextInt();

                    System.out.println("Enter mark Student :");
                    int mark = sc.nextInt();

                    student.inputStudent(name, id, mark);
                    break;
                case 2:
                    System.out.println("List student: ");
                    System.out.println("------------------" + "\n");
                    student.loadListStudent();
                    break;
                case 3:
                    exit = true;
                    break;
            }
        }
    }
}
