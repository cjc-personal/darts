public class Player {
    private static int nextPlayerNum = 1;
    private final int playerNum;
    private String name = "";
    private int score;

    public Player(String name){
        this.name = name;
        this.playerNum = nextPlayerNum;
        nextPlayerNum++;
    }
    public Player() {
        this("Player " + nextPlayerNum);
    }
    @Override
    public String toString() {
        return name + " " + score;
    }
    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Player thePlayer = (Player) toBeCompared;
        return thePlayer.getName().toLowerCase() == getName().toLowerCase();
    }

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public int getPlayerNum() {
        return playerNum;
    }
    public int getNextPlayerNum() {
        return nextPlayerNum;
    }
}
