package clubs.domain;

import io.micronaut.spring.tx.annotation.Transactional;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

//tag::class[]
@Singleton
public class ClubRepositoryImpl implements ClubRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional(readOnly = true)
    public Long count() {
        return entityManager.createQuery("select count(c) from Club c", Long.class).getSingleResult();
    }

    @Override
    @Transactional
    public Club save(@NotBlank String name, String stadium) {
        Club club = new Club(name);
        club.setStadium(stadium);
        entityManager.persist(club);
        return club;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Club> findAll() {
        return entityManager.createQuery("select c from Club c", Club.class).getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Club> find(@NotNull Long id) {
        return Optional.ofNullable(entityManager.find(Club.class, id));
    }

}
//end::class[]

