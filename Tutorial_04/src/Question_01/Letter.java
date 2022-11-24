package Question_01;

public class Letter implements Printable{

    private String text;

    public Letter(String text){
        this.text = text;
    }

    public void print(){
        System.out.println("Text: " + text);
    }
}
