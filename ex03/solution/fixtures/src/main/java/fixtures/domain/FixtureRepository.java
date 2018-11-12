package fixtures.domain;

import io.reactivex.Flowable;
import io.reactivex.Single;

import javax.validation.Valid;

//tag::class[]
public interface FixtureRepository {

    Single<Fixture> save(@Valid Fixture fixture);
    Flowable<Fixture> findAll();
    Single<Long> count();

}
//end::class[]

