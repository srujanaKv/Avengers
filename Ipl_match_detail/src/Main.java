//import static java.util.Collections.reverse;//

public class Main {

    public static void main(String[] args) {

        String input = "RCB will win the match";
        String[] words= input.split("");
        System.out.println("Arrays.toString(result)");
        if (words.length >= 3) {
            words[2] = new StringBuilder(words[2]).reverse().toString();
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
