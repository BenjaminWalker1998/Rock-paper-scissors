public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Game.CompareChoice choice = new Game.CompareChoice();
                String playerChoice = choice.PlayGame();
                Game.ComputerChoice comp = new Game.ComputerChoice();
                String compChoice = comp.convertNumber(comp.getChoice());
                System.out.println(compChoice);
                Game.CompareChoice game = new Game.CompareChoice();
                game.compareChoice(playerChoice, compChoice);
                if (playerChoice.equals(compChoice)) continue;
                System.out.println("Would you like to play again Y/N?");
                Game.PromptPlayer yesOrNo = new Game.PromptPlayer();
                String quitOrNot = yesOrNo.getPlayerChoice();
                if (quitOrNot.equals("n")) {
                    System.out.println("Thank you for playing?");
                    break;
                }
            }catch (Exception e) {
                System.out.println("Unexpected error!!\nClosing app!!\n" + e);
                break;
            }

        }
    }
}
