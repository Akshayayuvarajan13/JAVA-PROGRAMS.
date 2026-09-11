public class CharactersArray {
    public static void main(String[] args) {
    String word = "welcome to java";
    char[] characters = word.toCharArray();
    System.out.println("Characters of the word:");
        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }
    }
}