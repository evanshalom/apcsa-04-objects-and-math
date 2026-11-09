public class DocsDetective {
    public static void main(String[] args) {
        String raw = "  hello  ";
        String trimmed = raw.trim();

        // String lives in java.lang, which is imported automatically.
        System.out.println("String package: java.lang");
        System.out.println("Constructors listed in the String API: 13");
        System.out.println("length: " + trimmed.length());
        System.out.println("isEmpty: " + trimmed.isEmpty());
        System.out.println("indexOf('l'): " + trimmed.indexOf('l'));
        System.out.println("charAt(0): " + trimmed.charAt(0));

        // One more String method that is not used in the exercise yet.
        System.out.println("substring(1, 4): " + trimmed.substring(1, 4));
    }
}
