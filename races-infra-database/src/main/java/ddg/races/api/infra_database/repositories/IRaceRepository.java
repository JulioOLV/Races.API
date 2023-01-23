package ddg.races.api.infra_database.repositories;

import ddg.races.api.infra_database.collections.RaceCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRaceRepository extends MongoRepository<RaceCollection, String> {
}
