
package game;
import static game.Game.main;
import java.util.Scanner;
import java.util.Random;

public class Game {
             


   
    public static void main(String[] args) {
            System.out.println("Game created with the objective of passing time\n");
            System.out.println("What is your name dear user? Type it:");
            Scanner num = new Scanner(System.in);
            var name= num.nextLine();
            System.out.println("Well...Hello " + name + ".\n");
            System.out.println("Choose a number between 1 and 3 for the difficulty of this game.");
            int n = num.nextInt();
            
           
       if(n == 1){
           Scanner type = new Scanner(System.in);
           Random rand = new Random();
           int randomNum = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum1 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum2 = rand.nextInt((9 - 0) + 1) + 0;	    
           System.out.println("It Will be Generated 3 numbers from 1 to 9 if you get them correctly you win it!");
           
          System.out.println("Choose between 0-9\n");
           int nu= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu1= type.nextInt();   
           System.out.println("Choose between 0-9\n");
           int nu2= type.nextInt();
           if(nu==randomNum && nu1==randomNum1 && nu2==randomNum2){
               System.out.println("Congrats your guessed it correctly the number was :" + randomNum + randomNum1 + randomNum2);
         
           }else{
               System.out.println("Sorry you got it wrong, your answer was: "+ nu + nu1 + nu2 +"\n");
               System.out.println("And the correct one is " + randomNum + randomNum1 + randomNum2);
           
       
           }
               
       }else if(n == 2){
               Scanner type = new Scanner(System.in);
           Random rand = new Random();
           int randomNum = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum1 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum2 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum3 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum4 = rand.nextInt((9 - 0) + 1) + 0;
           System.out.println("It Will be Generated 5 numbers from 1 to 9 if you get them correctly you win it!");
           
          System.out.println("Choose between 0-9\n");
           int nu= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu1= type.nextInt();   
           System.out.println("Choose between 0-9\n");
           int nu2= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu3= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu4= type.nextInt();
           if(nu==randomNum && nu1==randomNum1 && nu2==randomNum2 && nu3==randomNum3 && nu4==randomNum4){
               System.out.println("Congrats your guessed it correctly the number was :" + randomNum + randomNum1 + randomNum2 + randomNum3 +randomNum4 );
         
           }else{
               System.out.println("Sorry you got it wrong, your answer was: "+ nu + nu1 + nu2 + nu3 + nu4 +"\n");
               System.out.println("And the correct one is " + randomNum + randomNum1 + randomNum2 + randomNum3 +randomNum4 );
           
       
           }
       }else if(n ==3){
                   Scanner type = new Scanner(System.in);
           Random rand = new Random();
           int randomNum = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum1 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum2 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum3 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum4 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum5 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum6 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum7 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum8 = rand.nextInt((9 - 0) + 1) + 0;
           int randomNum9 = rand.nextInt((9 - 0) + 1) + 0;
           System.out.println("It Will be Generated 10 numbers from 1 to 9 if you get them correctly you win it!");
           
          System.out.println("Choose between 0-9\n");
           int nu= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu1= type.nextInt();   
           System.out.println("Choose between 0-9\n");
           int nu2= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu3= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu4= type.nextInt();
            System.out.println("Choose between 0-9\n");
           int nu5= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu6= type.nextInt();   
           System.out.println("Choose between 0-9\n");
           int nu7= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu8= type.nextInt();
           System.out.println("Choose between 0-9\n");
           int nu9= type.nextInt();
           if(nu==randomNum && nu1==randomNum1 && nu2==randomNum2 && nu3==randomNum3 && nu4==randomNum4 && nu5==randomNum5 && nu6==randomNum6 && nu7==randomNum7 && nu8==randomNum8 && nu9==randomNum9 ){
               System.out.println("Congrats your guessed it correctly the number was :" + randomNum + randomNum1 + randomNum2 + randomNum3 +randomNum4 + randomNum5 +randomNum6 +randomNum7 +randomNum8 +randomNum9 );
         
           }else{
               System.out.println("Sorry you got it wrong, your answer was: "+ nu + nu1 + nu2 + nu3 + nu4 +  nu5 + nu6 + nu7 +nu8 + nu9 +"\n");
               System.out.println("And the correct one is " + randomNum + randomNum1 + randomNum2 + randomNum3 +randomNum4 + randomNum5 +randomNum6 +randomNum7 +randomNum8 +randomNum9);
           
       
           }
       
               
       }else {
          System.out.print("Choose a number between 1 and 3\n");
         
       }
    }
    
}
/* i could change the SOUT "Choose Between" with a while function yes i just didnt rememeber when doing it */ 
