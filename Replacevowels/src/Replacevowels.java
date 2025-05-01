public class Replacevowels {
    public static void main(String[] args) {
        String input = "you are welcome";
        input = input.toLowerCase();
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                char nextChar = (char) (ch + 1);
                while ("aeiou".indexOf(nextChar) != -1) {
                    nextChar++;
                }
                result += nextChar;
            } else {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
