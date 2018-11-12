package fixtures;

import fixtures.controller.FixtureResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Client("/")
public interface FixtureClient {
    @Get("/")
    Flowable<FixtureResponse> list();
}
