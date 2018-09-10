import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Random random = new Random ();
        int randomNumber = random.nextInt (100 - 1) + 1;         //Generating random number bw 1 and 100
        int guessedNumber = 0;

        System.out.println ("The number is between 1 and 100.");

        do
        {
            System.out.print ("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if ( guessedNumber > randomNumber ) {
                System.out.println ("Your guess is high!");             //Rest Logic
            }
            else if ( guessedNumber < randomNumber ) {
                System.out.println ("Your guess is low!");
            }
            else {
                System.out.println ("You got it!");
            }
        } while ( guessedNumber != randomNumber );
    }
}