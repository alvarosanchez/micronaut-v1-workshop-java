package fixtures.controller;

import fixtures.service.FixtureService;
import fixtures.domain.FixtureRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

@Controller("/")
public class FixtureController {

    private FixtureRepository fixtureRepository;
    private FixtureService fixtureService;

    public FixtureController(FixtureRepository fixtureRepository, FixtureService fixtureService) {
        this.fixtureRepository = fixtureRepository;
        this.fixtureService = fixtureService;
    }

//tag::action[]
    @Get("/")
    public Flowable<FixtureResponse> list() {
        return fixtureRepository.findAll().flatMapMaybe(fixture -> fixtureService.toResponse(fixture));
    }
//end::action[]

}