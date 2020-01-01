package emil.l5WhileLoops;
import java.util.Random;

public class LuckyDiceGame {
    public static void main(String[] args) {

            System.out.println("Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");

        while (true) {
            int dice1=(int)(Math.random()*6+1);
            int dice2=(int)(Math.random()*6+1);
            int sum = dice1 + dice2;

            System.out.println("Roll: total = " + sum);

            if (sum==2 || sum==3 || sum==12) {
                System.out.println("Sorry with a " + sum + " You LOSE :(");
                break;
            } else if(sum==7 || sum==11) {
                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
                break;
            }

                }
            }
        }



