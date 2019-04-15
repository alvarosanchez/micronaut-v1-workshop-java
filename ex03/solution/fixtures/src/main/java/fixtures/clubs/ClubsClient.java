package fixtures.clubs;

import io.micronaut.http.client.annotation.Client;

//tag::class[]
@Client("clubs")    // <1>
public interface ClubsClient extends ClubsApi {}
//end::class[]
