import java.util.Scanner;
import java.util.InputMismatchException;

public class JustePrix {

    public static void main(String[] args) {

        System.out.print("\nBonjour !\n");
        System.out.print("Bienvenue dans le Jeu du juste Prix :) ! :\n------------------------------------\n");

        Menu();

    }

    public static void Menu() {

        Scanner msg = new Scanner(System.in);
        int intMsg = 0;

        do {

            System.out.print("Choissisez un mode de jeu ! : \n\n");
            System.out.print("1 : SOLO \n");    
            System.out.print("2 : DUO \n");

            intMsg = msg.nextInt();

            if (intMsg == 1 || intMsg == 2) System.out.print("reponse correcte !\n"); else System.out.print("\n\nERREUR : reponse incorrecte\n\n\n");

        } while (intMsg < 1 || intMsg > 2);

        if (intMsg == 1) SOLO();
        if (intMsg == 2) DUO(); 


        msg.close();

    }

    public static void SOLO() {

        Scanner msg = new Scanner(System.in);

        System.out.print("Choissisez la fourchette minimum ! : ");
        int min = msg.nextInt();
        System.out.print("Choissisez la fourchette maximum ! : ");
        int max = msg.nextInt();

        int number = (min + (int)(Math.random() * (max - min)));
        System.out.print("\n\nLe nombre a etait creer entre " + min + " et " + max + " !\n\n");

        int reponse = 0;

        do {

            System.out.print("essayez de le devinez ! : ");

            if (reponse > number) System.out.print("\nCe nombre est trop Grand ! \n");
            if (reponse < number) System.out.print("\nCe nombre est trop Petit ! \n");

            if (reponse == number) {
                
                System.out.print("\nBravo ! Vous avez trouver le resultat !\n");
                Menu();
            
            }
            
        }while (reponse != number);

        msg.close();

    }

    public static void DUO() {

        Scanner msg = new Scanner(System.in);

        System.out.print("Choissisez le nombre ! : ");
        int number = 0;

        try {
            
            number = msg.nextInt();
            
        } catch(InputMismatchException execption) {

    
            System.out.println("ERREUR : Ce n'est pas un nombre il se peux qu'il y est des lettres ou d'autres symboles (il se peut aussi que ce soit un nombre trop grand) !\nVeuillez retapez votre nombre ! ");
            DUO();


        }

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nLe nombre a etait creer !\n\n");

        int reponseUser = 0;

        do {
                
            System.out.print("essayez de le devinez ! : ");

            try {
            
                reponseUser = msg.nextInt();
                
            } catch(InputMismatchException execption) {
    
        
                System.out.println("ERREUR : Ce n'est pas un nombre il se peux qu'il y est des lettres ou d'autres symboles (il se peut aussi que ce soit un nombre trop grand) !\nVeuillez retapez votre nombre ! ");
                DUO();
    
    
            }

            if (reponseUser > number) System.out.print("\nCe nombre est trop Grand ! \n");
            if (reponseUser < number) System.out.print("\nCe nombre est trop Petit ! \n");

            if (reponseUser == number) {
                
                System.out.print("\nBravo ! Vous avez trouver le resultat !\n");
                Menu();
                msg.close();
            
            }

            
        }while (reponseUser != number);



    }


}