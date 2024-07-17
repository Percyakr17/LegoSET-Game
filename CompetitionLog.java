public class CompetitionLog {
    private int playerNumber;
    private String completeSets;
    private String incompleteSets;
    private int piecesBuilt;

    public CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt) {
        this.playerNumber = playerNumber;
        this.completeSets = completeSets;
        this.incompleteSets = incompleteSets;
        this.piecesBuilt = piecesBuilt;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getCompleteSets() {
        return completeSets;
    }

    public String getIncompleteSets() {
        return incompleteSets;
    }

    public int getPiecesBuilt() {
        return piecesBuilt;
    }

    public void setCompleteSets(String completeSets) {
        this.completeSets = completeSets;
    }

    public void setIncompleteSets(String incompleteSets) {
        this.incompleteSets = incompleteSets;
    }

    public void setPiecesBuilt(int piecesBuilt) {
        this.piecesBuilt = piecesBuilt;
    }

    @Override
    public String toString() {
        return "Player " + playerNumber + " completed the following sets: " + completeSets + "\n" +
               "Player " + playerNumber + " did not complete the following sets: " + incompleteSets + "\n" +
               "Player " + playerNumber + " built a total of " + piecesBuilt + " pieces\n";
    }
}
