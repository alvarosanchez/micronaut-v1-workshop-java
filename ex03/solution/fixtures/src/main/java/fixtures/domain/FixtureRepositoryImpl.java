package fixtures.domain;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import io.reactivex.Flowable;
import io.reactivex.Single;

import javax.inject.Singleton;
import javax.validation.Valid;

//tag::class[]
@Singleton
public class FixtureRepositoryImpl implements FixtureRepository {

    public static final String DB_NAME = "fixturesDb";
    public static final String COLLECTION_NAME = "fixtures";

    private MongoClient mongoClient;

    public FixtureRepositoryImpl(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public Single<Fixture> save(@Valid Fixture fixture) {
        return Single.fromPublisher(getCollection().insertOne(fixture)).map(success -> fixture);
    }

    @Override
    public Flowable<Fixture> findAll() {
        return Flowable.fromPublisher(getCollection().find());
    }

    @Override
    public Single<Long> count() {
        return Single.fromPublisher(getCollection().count());
    }

    private MongoCollection<Fixture> getCollection() {
        return mongoClient.getDatabase(DB_NAME).getCollection(COLLECTION_NAME, Fixture.class);
    }
}
//end::class[]

