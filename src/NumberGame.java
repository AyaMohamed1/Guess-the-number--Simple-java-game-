import java.util.*;
public class NumberGame {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        /*  Math.random() returns floating point between 0 and 1
            so multiply by any number to get an integer value
            adding any number to be sure that its not 0
         */
        int randomNum = (int) (Math.random() * 100) + 1;
        boolean won = false;
        System.out.println("I have chosen number between 0 and 100 \nTry to guess it ^ ^");
        System.out.println("You have 10 guesses left");
        for(int i = 10; i > 0; i--){
            int guessedNum = input.nextInt();
            if(guessedNum > randomNum)
                System.out.println("The number is smaller than " + guessedNum);
            else if(guessedNum < randomNum)
                System.out.println("The number is bigger than " + guessedNum);
            else {
                System.out.println("Correct .. the number is " + guessedNum + "\nYou won the game <3");
                won = true;
                break;
            }
            if(i > 1)
                System.out.println("You have " + (i - 1) + " guess(es) left. Choose again");
        }

        if(won)
            System.out.println("Congratulations :)");
        else
            System.out.println("You lose :(" + "\nThe number was " + randomNum);

    }
}
