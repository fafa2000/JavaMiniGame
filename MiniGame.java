
package minigame;

/**
 *
 * @author Fatemeh, Catherine, Isabelle, Abinaya
 * Created:  November 7th, 2017
 * Last edited: 
 */

import java.util.Scanner;
public class MiniGame {

    public static void main(String[] args) {
        
        //creating the objects (the people the player need to guess)
        People Beyonce = new Singer("Beyonce", "“All the single ladies! The Queen B originally from Destiny’s Child? Who am I?”");
        People Sheeran = new Singer("Ed Sheeran", "“Shape of You? Ginger haired singer of the second Hobbit movie soundtrack? Who am I?”");
        People Swift = new Singer("Taylor Swift", "“Shake it off! Blonde singer who sings her heart out after a breakup. Who am I?”");
        People Dion = new Singer("Celine Dion", "“I’m a Canadian singer who sang the famous song from Titanic, who am I?”");
        People Luce = new Teacher("Luce", "“I am a badminton coach who teaches in the technology department, who am I?”");
        People Lim = new Teacher("Lim", "“I run the math competitions, and have a daughter and a son. I’m now department head, who am I?“");
        People VanDyk = new Teacher("Van Dyk", "“I am the head of the technology department, who am I?”");
        People Czudner = new Teacher("Czudner", "“I am the math teacher everyone wanted for gr12, but left the school last year, who am I?”");
        People Stalin = new Politician("Stalin", "“I’m a Georgian-born soviet leader who was paranoid of everyone around me, who am I?”");
        People Trump = new Politician("Trump", "“Let’s make America great again! Who am I?”");
        People Trudeau = new Politician("Trudeau", "“I’m a Canadian prime minister with nice hair, who am I?”");
        People Hitler = new Politician("Hitler", "“I was rejected from the art school in Vienna so I became a party leader and decided to start a war, who am I?”");
        
        //var for tracking score
        int score=0;
        
        
        System.out.print("Do you want to view the instructions or start the game? (Enter 'v' for instructions and 's' for game)");
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
       
        switch (input){
        case "v":
            //prints out instructions
            System.out.println("\n\nInstructions:\nWelcome to the game “Guess Who”! "
                    + "\nThis game consists of ten mystery people (in categories of politics, singers, and staff),"
                    + " in which users will have to guess the name of the person given a hint about them. "
                    + "\nFor answers guessed correctly, players will be awarded 5 points, for incorrect answers, players will be deducted 3 points."
                    + "\nNote: for the category politicians and teachers, state last names only, and for singers be sure to enter their stage name only. Good luck!\n");
           
            //delays program for 10 seconds
            try { 
                Thread.sleep(10000); 
            } catch (InterruptedException e) { 
                System.err.println(e); }         
            
        //game starts    
        case "s":
            
            System.out.println("\nMystery Person #1");
            Beyonce.Talk();
            String guess = sc.nextLine();
            System.out.println(Beyonce.PersonVerifier(guess));
            
            if ((Beyonce.PersonVerifier(guess))){ //can make into its own method
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #2");
            Sheeran.Talk();
            guess = sc.nextLine();
            System.out.println(Sheeran.PersonVerifier(guess));
            
            if ((Sheeran.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #3");
            Swift.Talk();
            guess = sc.nextLine();
            System.out.println(Swift.PersonVerifier(guess));
            
            if ((Swift.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }            
            System.out.println("\nMystery Person #4");
            Dion.Talk();
            guess = sc.nextLine();
            System.out.println(Dion.PersonVerifier(guess));

            if ((Dion.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #5");
            Luce.Talk();
            guess = sc.nextLine();
            System.out.println(Luce.PersonVerifier(guess));

            if ((Luce.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #6");
            Lim.Talk();
            guess = sc.nextLine();
            System.out.println(Lim.PersonVerifier(guess));

            if ((Lim.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #7");
            VanDyk.Talk();
            guess = sc.nextLine();
            System.out.println(VanDyk.PersonVerifier(guess));
            
            if ((VanDyk.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #8");
            Czudner.Talk();
            guess = sc.nextLine();
            System.out.println(Czudner.PersonVerifier(guess));

            if ((Czudner.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #9");
            Stalin.Talk();
            guess = sc.nextLine();
            System.out.println(Stalin.PersonVerifier(guess));
            
            if ((Stalin.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #10");
            Trump.Talk();
            guess = sc.nextLine();
            System.out.println(Trump.PersonVerifier(guess));
            
            if ((Trump.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #11");
            Trudeau.Talk();
            guess = sc.nextLine();
            System.out.println(Trudeau.PersonVerifier(guess));

            if ((Trudeau.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }
            
            System.out.println("\nMystery Person #12");
            Hitler.Talk();
            guess = sc.nextLine();
            System.out.println(Hitler.PersonVerifier(guess));

            if ((Hitler.PersonVerifier(guess))== true){
                score+= 5;
            }else{
                score -=3;
            }      
            System.out.println(score);
            break;
           
    }

        

    }
    
}
