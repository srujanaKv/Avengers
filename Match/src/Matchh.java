
public class Matchh {
    public static void main(String[] args) {
       String input="RCB will win the match against csk";

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.print(word.length() + " ");
        }
    }
}

