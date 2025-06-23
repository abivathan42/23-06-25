public class WordCounter {
    public static void main(String[] args) {
        String sentence = "This is a sample Java sentence";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
