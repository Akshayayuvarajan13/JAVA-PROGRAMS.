public class ReverseString {
    public static void main(String[] args) {
        String original = "Beautiful Princess";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }
}
