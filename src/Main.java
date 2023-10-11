import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Game of Craps");
        int points = 0;
        int dice_sum = rolldice();
        System.out.println("Dice Sum: "+ dice_sum);
        if(dice_sum == 2 || dice_sum ==3 || dice_sum == 12)
        {
            System.out.println("Craps! Game is over with a loss");
        }
        else if(dice_sum == 7 || dice_sum == 11)
        {
            System.out.println("Natural! Game is over with a win");
        }
        else
        {
            points = dice_sum;
            System.out.println("Points: "+ points);
            while(true)
            {
                dice_sum = rolldice();
                System.out.println("Dice Sum: "+ dice_sum);

                if(dice_sum == points)
                {
                    System.out.println("Natural! Game is over with a win");
                    break;
                }
                else if(dice_sum == 7)
                {
                    System.out.println("Craps! Game is over with a loss");
                    break;
                }
            }
        }
        System.out.print("Want to Play Again [Press Y]: ");
        char user_input = new Scanner(System.in).next().charAt(0);

        if(user_input == 'Y' || user_input == 'y')
        {
            main(null);
        }
    }
    public static int rolldice() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        System.out.println("Dice 1: " + dice1 + "\tDice 2: " + dice2);
        return dice1 + dice2;
    }
}