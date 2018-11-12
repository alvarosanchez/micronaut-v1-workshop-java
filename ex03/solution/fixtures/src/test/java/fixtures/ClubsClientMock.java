package fixtures;

import fixtures.clubs.Club;
import fixtures.clubs.ClubsApi;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Maybe;

//tag::class[]
@Fallback
public class ClubsClientMock implements ClubsApi {
    @Override
    public Maybe<Club> findTeam(Long id) {
        if (id == 1) {
            return Maybe.just(new Club("CD Leganes", "Butarque"));
        } else {
            return Maybe.just(new Club("Getafe CF", "Coliseum"));
        }
    }
}
//end::class[]
