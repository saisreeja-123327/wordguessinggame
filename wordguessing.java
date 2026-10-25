import java.util.Random;
import java.util.Scanner;
public class wordguessing{
    private String wordtoGuess;
    private char[] guessedLetters;
    private int attempts;
public wordguessing(String[] wordlist,int maxAttempts){
  Random rand= new Random();

      this.wordtoGuess=wordlist[rand.nextInt(wordlist.length)];
      this.guessedLetters = new char[this.wordtoGuess.length()];

    for(int i=0;i<this.guessedLetters.length;i++){
        this.guessedLetters[i]='-';

    }
    this.attempts=maxAttempts;

}


    public void play() {
    Scanner sc = new Scanner(System.in);

    while (attempts > 0) { 

        // Display current guessed word
        System.out.print("Word: ");
        for (char c : guessedLetters) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Attempts left: " + attempts);
        System.out.print("Guess a letter: ");
        char guess = sc.next().charAt(0);

        boolean found = false;

        // Check guessed letter
        for (int i = 0; i < wordtoGuess.length(); i++) {
            if (wordtoGuess.charAt(i) == guess) {
                guessedLetters[i] = guess;
                found = true;
            }
        }

        if (found) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
            attempts--;
        }

        // Check if the word is completely guessed
        boolean completed = true;
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i] == '-') {
                completed = false;
                break;
            }
        }

        if (completed) {
            System.out.println("Congratulations! You guessed the word: " + wordtoGuess);
            return;
        }
    } sc.close();

    System.out.println("Game Over! The word was: " + wordtoGuess);
    }
    }
