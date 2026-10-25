public class App {
    
    public static void main(String[] args) {
    String[] words = {"apple", "banana", "computer", "java", "keyboard"};

    wordguessing game = new wordguessing(words, 6);
    game.play();
}
}
