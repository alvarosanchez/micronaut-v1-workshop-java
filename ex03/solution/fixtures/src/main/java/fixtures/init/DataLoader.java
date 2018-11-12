package fixtures.init;

import fixtures.domain.Fixture;
import fixtures.domain.FixtureRepository;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import javax.inject.Singleton;
import java.util.Date;

//tag::class[]
@Singleton
@Requires(notEnv = Environment.TEST)
public class DataLoader implements ApplicationEventListener<ServerStartupEvent> {

    private FixtureRepository repository;

    public DataLoader(FixtureRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onApplicationEvent(ServerStartupEvent event) {
        if (repository.count().blockingGet() == 0) {
            repository.save(new Fixture(1L, 2L, (short)5, (short)0, new Date()));
        }
    }
}
//end::class[]

