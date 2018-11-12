package hello.galaxy;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HelloControllerTest {

    @Inject
    private EmbeddedServer embeddedServer;

    @Test
    void testHelloGalaxy() {
        try(RxHttpClient client = embeddedServer.getApplicationContext().createBean(RxHttpClient.class, embeddedServer.getURL())) {
            assertEquals("Hello Galaxy!", client.toBlocking().exchange("/hello", String.class).body());
        }
    }

}
