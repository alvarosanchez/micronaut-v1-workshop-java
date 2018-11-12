package fixtures.clubs;

public class Club {

    private String name;
    private String stadium;

    public Club() {
    }

    public Club(String name, String stadium) {
        this.name = name;
        this.stadium = stadium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
