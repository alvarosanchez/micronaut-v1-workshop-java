package fixtures.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;

public class Fixture {

//tag::fields[]
    @BsonId
    private ObjectId id;

    private Long homeClubId;
    private Long awayClubId;

    private Short homeScore;
    private Short awayScore;

    private Date date;
//end::fields[]


//tag::constructor[]
    @BsonCreator
    @JsonCreator
    public Fixture(@BsonProperty("homeClubId") @JsonProperty("homeClubId") Long homeClubId,
                   @BsonProperty("awayClubId") @JsonProperty("awayClubId") Long awayClubId,
                   @BsonProperty("homeScore") @JsonProperty("homeScore") Short homeScore,
                   @BsonProperty("awayScore") @JsonProperty("awayScore") Short awayScore,
                   @BsonProperty("date") @JsonProperty("date") Date date) {
        this.homeClubId = homeClubId;
        this.awayClubId = awayClubId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.date = date;
    }
//end::constructor[]


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Long getHomeClubId() {
        return homeClubId;
    }

    public void setHomeClubId(Long homeClubId) {
        this.homeClubId = homeClubId;
    }

    public Long getAwayClubId() {
        return awayClubId;
    }

    public void setAwayClubId(Long awayClubId) {
        this.awayClubId = awayClubId;
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
