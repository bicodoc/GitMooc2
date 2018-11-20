
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Contest {

    private Scanner input = new Scanner(System.in);
//        private List jumpers;
    private List<Jumper> jumpers;
    private int round = 1;

    public Contest() {
        jumpers = new ArrayList();
    }

    public void start() {
        //Welcome the jumpers
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        //Get names
        getNames();

        System.out.println("\nThe tournament begins!");
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String token = input.nextLine();
            if (token.contains("jump")) {
                System.out.println("\nRound " + round + "\n");
                System.out.println("Jumping order:");

                playerOrder();

                System.out.println("\nResults of round " + round + "\n");
                takeJumps();

                round++;
            } else {
                //quit
                System.out.println("\nThanks!");
                break;
            }
        }
        results();
    }

    public void getNames() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = input.nextLine();

            if (name.isEmpty()) {
                break;
            } else {
                Jumper jumper = new Jumper(name);
                jumpers.add(jumper);
            }
        }
    }

    public void playerOrder() {
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        int i = 1;
        for (Jumper item : jumpers) {
            System.out.println("  " + i + ". " + item);
            i++;
        }
    }

    public void takeJumps() {
        for (Jumper item : jumpers) {
            Jump jump = new Jump();
            jump.goJump();
            item.addJump(jump.getScore(), jump.getJump());

            System.out.println("  " + item.getName());
            System.out.println("    length: " + jump.getJump());
            System.out.println("    judge votes: " + jump);
        }
    }

    public void results() {
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
       
        int i = 1;
        for (Jumper item : jumpers) {
            System.out.println(i + "           " + item);
            item.printJumps();
            System.out.print("\n");
            i++;
        }
    }
}


/*
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class UserInterface {
 
    private Scanner reader;
    private Tournament tournament;
 
    public UserInterface(Scanner reader, Tournament tournament) {
        this.reader = reader;
        this.tournament = tournament;
    }
 
    public void start() {
        System.out.println(this.tournament.getName());
        System.out.println("");
        createParticipants();
 
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
 
        jumpRounds();
 
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
 
        printFinalResults();
    }
 
    private void createParticipants() {
        System.out.println("Write the names of the participants one at a time; " + 
                           "an empty string brings you to the jumping phase.");
 
        while (true) {
            System.out.print("  Participant name: ");
            String nameOfTheParticipant = this.reader.nextLine();
            if (nameOfTheParticipant.equals("")) {
                break;
            }
 
            this.tournament.addJumper(new Jumper(nameOfTheParticipant));
        }
    }
 
    private void jumpRounds() {
        int roundNumber = 1;
 
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit:");
            String input = reader.nextLine();
            if (!input.equals("jump")) {
                break;
            }
 
            System.out.println("");
            System.out.println("Round " + roundNumber);
            System.out.println(""); 
            jumpRound();
            roundNumber++;
 
            System.out.println("");
        }
    }
 
    private void jumpRound() {
        JumpRound round = this.tournament.createNextJumpRound();
        printJumpOrder(round);
        System.out.println("");
 
        round.jump();
        printRoundResults(round);
    }
 
    private void printJumpOrder(JumpRound round) {
        System.out.println("Jumping order: ");
        List<Jumper> jumpers = round.getJumpOrder();
        for (int i = 0; i < jumpers.size(); i++) {
            Jumper jumper = jumpers.get(i);
            System.out.println("  " + (i + 1) + ". " + jumper);
        }
    }
 
    private void printRoundResults(JumpRound round) {
        System.out.println("Results of round " + round.getRoundNumber());
        for (Jumper jumper : round.getJumpOrder()) {
            System.out.println("  " + jumper.getName());
            System.out.println(round.getJump(jumper));
        }
    }
 
    private void printFinalResults() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
 
        List<Jumper> jumpers = this.tournament.getJumpers();
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
 
        for (int i = 0; i < jumpers.size(); i++) {
            Jumper jumper = jumpers.get(i);
            System.out.println((i + 1) + "           " + jumper);
 
            printJumpsOfTheJumper(jumper);
        }
    }

    private void printJumpsOfTheJumper(Jumper jumper) {
        String string = "            jump lengths: ";
 
        List<Jump> jumps = jumper.getJumps();
        for (int i = 0; i < jumps.size(); i++) {
            Jump hyppy = jumps.get(i);
 
            string += hyppy.getLength() + " m";
            if (i < jumps.size() - 1) {
                string += ", ";
            }
        }
 
        System.out.println(string);
    }
}
*/