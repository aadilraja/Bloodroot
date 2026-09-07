import java.util.Scanner;

public class Game {

    Scanner scan;

    public Game(Scanner scan)
    {
        this.scan=scan;
    }





    //starting point of the game
    public void start()
    {

        handleIntro();

        // store player choice in lower case
        char playerChoice=scan.next().toLowerCase().charAt(0); 
        System.out.println(playerChoice);
        scan.close();

        switch (playerChoice) {
            case 'x':
                handleNewGame();
                break;
        
            default:
                break;
        }
        scan.close();
    }

    //makes game intro ascii art
    private void handleIntro()
    {
        System.out.println("  \\_/       .:'    .:'    .:'");
        System.out.println("-=(_)=-  /\\||   /\\||   /\\||");
        System.out.println("  / \\   //\\\\|  //\\\\|  //\\\\|");
        System.out.println("       //  \\\\ //  \\\\ //  \\\\");
        System.out.println("      //    \\^/    \\^/    \\\\");
        System.out.println("      |[]  []|[]  []|[]  []|");
        System.out.println("      |__||__|__||__|__||__|");
        System.out.println();
        System.out.println("      =====================");
        System.out.println("       B L O O D R O O T S");
        System.out.println("      =====================");
        System.out.println();
        System.out.println("             New Game(X)");
        System.out.println("            Load Game(Y)");
        System.out.println("              Stats(S)");
        System.out.println("              Exit(E)");
    }
    private void handleNewGame()
    {
        Player player=new Player();

        System.out.println("Create your character");
        System.out.print("Enter your name:");
        String name=scan.nextLine();
        player.setName(name);


        

    }

}
