package fixtures.controller;

import java.util.Date;

public class FixtureResponse {

//tag::fields[]
    private String homeClubName;
    private String awayClubName;

    private String stadium;

    private Short homeScore;
    private Short awayScore;

    private Date date;
//end::fields[]

    public FixtureResponse() {}

    public FixtureResponse(String homeClubName, String awayClubName, String stadium, Short homeScore, Short awayScore, Date date) {
        this.homeClubName = homeClubName;
        this.awayClubName = awayClubName;
        this.stadium = stadium;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.date = date;
    }

    public String getHomeClubName() {
        return homeClubName;
    }

    public void setHomeClubName(String homeClubName) {
        this.homeClubName = homeClubName;
    }

    public String getAwayClubName() {
        return awayClubName;
    }

    public void setAwayClubName(String awayClubName) {
        this.awayClubName = awayClubName;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Short getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Short homeScore) {
        this.homeScore = homeScore;
    }

    public Short getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Short awayScore) {
        this.awayScore = awayScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
