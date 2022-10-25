package Question_2;

public class ConcatTester {

    public static void main(String[] args) {

        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String sentence1 = article.concat("\s" + animal1).concat("\s" + action).concat("\s" + animal2);   // "\s" for space...
        System.out.println(sentence1);

        int length = sentence1.length();
        System.out.println("Length is: " + length);

        System.out.println(article + " " + animal1 + " " + action + " " + animal2);

    }
}
