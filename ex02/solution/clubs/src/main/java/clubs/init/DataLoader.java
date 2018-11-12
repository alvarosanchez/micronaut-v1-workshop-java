package clubs.init;

import clubs.domain.ClubRepository;
import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import javax.inject.Singleton;

//tag::class[]
@Singleton
@Requires(notEnv = Environment.TEST)
public class DataLoader implements ApplicationEventListener<ServerStartupEvent> {

    private ClubRepository repository;

    public DataLoader(ClubRepository repository) {
        this.repository = repository;
    }

    @Override
    public void onApplicationEvent(ServerStartupEvent event) {
        if (repository.count() == 0) {
            repository.save("Real Madrid CF", "Santiago Bernabeu");
            repository.save("FC Barcelona", "Camp Nou");
            repository.save("CD Leganes", "Butarque");
            repository.save("Getafe CF", "Coliseum");
        }
    }
}
//end::class[]

