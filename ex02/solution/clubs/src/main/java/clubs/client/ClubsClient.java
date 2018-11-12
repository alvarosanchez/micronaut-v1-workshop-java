package clubs.client;

import clubs.ClubsApi;
import io.micronaut.http.client.annotation.Client;

@Client("/")
public interface ClubsClient extends ClubsApi {
}
