import java.util.Random;
import java.util.Scanner;

public class Game {
    public static class PromptPlayer {
        Scanner playerInput = new Scanner(System.in);
        String playerChoice = playerInput.nextLine().toLowerCase();


        public String getPlayerChoice() {
            return playerChoice;
        }

    }

    public static class ComputerChoice {
        Random i = new Random();
        int choice = i.nextInt(3) + 1;

        public String convertNumber(int number) {
            String choice = "";
            if (number == 1) {
                choice = "rock";
            } else if (number == 2) {
                choice = "paper";
            } else if (number == 3) {
                choice = "scissors";
            }

            return choice;
        }

        public int getChoice() {
            return choice;
        }

    }

    public static class CompareChoice {
        String playerChoice;
        String computerChoice;

        public void compareChoice(String playerChoice, String computerChoice) {
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Tie!\nLet's go again!\n\n");
            } else if (playerChoice.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("Paper beats rock you lose!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("Rock beats scissors you win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("Paper beats rock you win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("scissors")) {
                System.out.println("Scissors beats paper you lose!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("Rock beats scissors you lose!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("Scissors beats paper you win!");
            } else System.out.println("That's not how you play rock paper scissors!\nGo read a rule book!");


        }

        public String PlayGame() {
            while (true) {
                System.out.println("Rock! Paper! Scissors! Shoot!");
                Game.PromptPlayer input = new Game.PromptPlayer();
                playerChoice = input.getPlayerChoice();
                if (playerChoice.equals("rock")) {
                    break;
                } else if (playerChoice.equals("paper")) {
                    break;
                } else if (playerChoice.equals("scissors")) {
                    break;
                } else System.out.println("That's not how you play rock paper scissors!\nGo read a rule book!");
            }
                return playerChoice;
            }



        }

    }


