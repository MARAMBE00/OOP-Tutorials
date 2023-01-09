package JTable;

public class Person {
    private String name;
    private Date dateOfBirth;

    public Person() {
        name = "";
        dateOfBirth = null;
    }

    public  Person(String n){
        name = n;
    }

    public String getName(){
        return getName();
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        return ("The name is " + name + " and the age is " + dateOfBirth.getDate());
    }
}
