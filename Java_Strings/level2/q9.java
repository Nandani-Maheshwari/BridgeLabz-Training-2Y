import java.util.Scanner;

public class q9 {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if (user.equals("Rock") && computer.equals("Scissors") ||
            user.equals("Paper") && computer.equals("Rock") ||
            user.equals("Scissors") && computer.equals("Paper")) {
            return "Player";
        }
        return "Computer";
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", (playerWins * 100.0 / totalGames)) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0 / totalGames)) + "%";
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.printf("%-10s %-12s %-12s %-10s%n", "Game", "Player", "Computer", "Winner");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d %-12s %-12s %-10s%n",
                    (i + 1), results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nFinal Stats:");
        System.out.printf("%-10s %-12s %-12s%n", "Player", "Wins", "Win %");
        System.out.println("----------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-10s %-12s %-12s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); 
        String[][] results = new String[totalGames][3];
        int playerWins = 0, computerWins = 0;
        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        String[][] stats = calculateStats(playerWins, computerWins, totalGames);
        displayResults(results, stats);
        sc.close();
    }
}

