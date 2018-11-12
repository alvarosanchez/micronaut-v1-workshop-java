package fixtures.clubs;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

//tag::class[]
@Client("clubs")    // <1>
public interface ClubsClient extends ClubsApi {}
//end::class[]
