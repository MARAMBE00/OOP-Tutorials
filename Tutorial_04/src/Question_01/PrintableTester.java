package Question_01;

public class PrintableTester {

    public static void main(String[] args) {

        String grades1[] = {"A", "B", "C", "A", "B"};
        Student s1 = new Student("Pasindu", grades1);
        s1.print();

        String grade2[] = {"B", "B", "C", "A", "C"};
        Student s2 = new Student("John", grade2);

        Letter l1 = new Letter("my letter");
        l1.print();

    }
}
