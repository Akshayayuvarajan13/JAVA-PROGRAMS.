public class pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(str);
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

}