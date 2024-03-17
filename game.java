import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter 0 for ROCK , Enter 1 for PAPER , Enter 3 for scissor");
         int userInput = p.nextInt();
              p.close();
        Random random = new Random(); 
        int computerInput = random.nextInt(3);
        
        if (userInput==computerInput){
            System.out.println("The match is draw");
        }
        else if(userInput==0 && computerInput==2 || userInput == 1 && computerInput == 0 ||
                                                                        userInput==2&&computerInput==1 ){

        System.out.println("You win the game");
        }
        else{
            System.out.println("THe computer is win ");
        }

         if (computerInput==0){
            System.out.println("Computer choice is rock that is = 0 ");
         }
         else if(computerInput==1){
            System.out.println("The computer choice is paper that is = 1");
         }
         else {
            System.out.println("computer choice is scissor that is = 2");
         }
    }
}
