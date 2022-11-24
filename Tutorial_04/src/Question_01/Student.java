package Question_01;

public class Student implements Printable{

    private String name;
    private String grades[] = new String[5];

    public Student(String name, String grades[]){
        this.name = name;

        int i = 0;
        while (i < 5 && i < grades.length){
            this.grades[i] = grades[i];
            ++i;
        }
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Grades: ");
        for(String s: grades)
            System.out.print(s + " ");
        System.out.println();
    }
}
