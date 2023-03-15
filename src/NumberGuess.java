import java.util.Scanner;


public class NumberGuess {
    public static void numberGame(){
        Scanner scanner = new Scanner(System.in);

        int number = 1 + (int)(50 * Math.random());
        int x = 5;
        int i, guess;


        System.out.println( "A number is chosen between 1 to 50, Guess the number within the 5 trials..");

        for (i = 0; i<x; i++){
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("Congratulations...! You Guessed the number correctly.. ");
                break;
            } else if (number > guess && i!=x-1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i!=x-1) {
                System.out.println("The number is less than " + guess);
            }
        }
        if (i == x){
            System.out.println("You have executed 5 trials..");
            System.out.println("The number was " +number);
        }
    }

    public static void main(String[] args) {
        numberGame();
    }
}
