package ddg.races.api.respositories;

import ddg.races.api.collections.RaceCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRaceRepository extends MongoRepository<RaceCollection, String> {
}
