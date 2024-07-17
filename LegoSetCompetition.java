import java.util.Scanner;

public class LegoSetCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Lego Set Competition!");

        System.out.println("Enter the name of Lego Set 1");
        String legoSet1 = sc.nextLine();
        System.out.println("Enter the number of pieces in Lego Set 1");
        int piecesSet1 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter the name of Lego Set 2");
        String legoSet2 = sc.nextLine();
        System.out.println("Enter the number of pieces in Lego Set 2");
        int piecesSet2 = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter the name of Lego Set 3");
        String legoSet3 = sc.nextLine();
        System.out.println("Enter the number of pieces in Lego Set 3");
        int piecesSet3 = Integer.parseInt(sc.nextLine());

        int totalPieces = piecesSet1 + piecesSet2 + piecesSet3;
        int player1Total = 0;
        int player2Total = 0;
        int dayCount = 0;
        boolean competitionOver = false;

        while (!competitionOver) {
            dayCount++;
            System.out.println("Enter the number of pieces player 1 used for building on day " + dayCount);
            int player1Daily = Integer.parseInt(sc.nextLine());
            player1Total += player1Daily;

            System.out.println("Enter the number of pieces player 2 used for building on day " + dayCount);
            int player2Daily = Integer.parseInt(sc.nextLine());
            player2Total += player2Daily;

            if (player1Total >= totalPieces && player2Total >= totalPieces) {
                System.out.println("The competition ended in a tie! There will be a tiebreaker round.");
                player1Total = 0;
                player2Total = 0;
                dayCount = 0;
            } else if (player1Total >= totalPieces) {
                competitionOver = true;
                System.out.println("Congratulations to player 1 for winning the Lego Set Competition!");
            } else if (player2Total >= totalPieces) {
                competitionOver = true;
                System.out.println("Congratulations to player 2 for winning the Lego Set Competition!");
            }
        }

        String player1CompleteSets = (player1Total >= piecesSet1 ? legoSet1 : "") + (player1Total >= (piecesSet1 + piecesSet2) ? ", " + legoSet2 : "") + (player1Total >= totalPieces ? ", " + legoSet3 : "");
        String player2CompleteSets = (player2Total >= piecesSet1 ? legoSet1 : "") + (player2Total >= (piecesSet1 + piecesSet2) ? ", " + legoSet2 : "") + (player2Total >= totalPieces ? ", " + legoSet3 : "");

        String player1IncompleteSets = (player1Total < piecesSet1 ? legoSet1 : "") + (player1Total < (piecesSet1 + piecesSet2) ? ", " + legoSet2 : "") + (player1Total < totalPieces ? ", " + legoSet3 : "");
        String player2IncompleteSets = (player2Total < piecesSet1 ? legoSet1 : "") + (player2Total < (piecesSet1 + piecesSet2) ? ", " + legoSet2 : "") + (player2Total < totalPieces ? ", " + legoSet3 : "");

        CompetitionLog log1 = new CompetitionLog(1, player1CompleteSets.isEmpty() ? "None" : player1CompleteSets, player1IncompleteSets.isEmpty() ? "None" : player1IncompleteSets, player1Total);
        CompetitionLog log2 = new CompetitionLog(2, player2CompleteSets.isEmpty() ? "None" : player2CompleteSets, player2IncompleteSets.isEmpty() ? "None" : player2IncompleteSets, player2Total);

        System.out.println("Additional information about the competition results is below");
        System.out.println(log1);
        System.out.println(log2);
        System.out.println("The competition lasted " + dayCount + " days");
    }
}
