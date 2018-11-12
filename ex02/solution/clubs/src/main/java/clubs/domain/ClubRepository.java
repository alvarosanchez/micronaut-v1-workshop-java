package clubs.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface ClubRepository {

//tag::operations[]
    Long count();
    Club save(@NotBlank String name, String stadium);
    List<Club> findAll();
    Optional<Club> find(@NotNull Long id);
//end::operations[]

}
