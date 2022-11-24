package Question_2;

public class ConcatTester {

    public static void main(String[] args) {

        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String sentence1 = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(article).concat(" ")
                .concat(animal2);
        System.out.println(sentence1);

        System.out.println("Length is: " + sentence1.length());

        System.out.println(article + " " + animal1 + " " + action + " " + article + " " + animal2);

    }
}
