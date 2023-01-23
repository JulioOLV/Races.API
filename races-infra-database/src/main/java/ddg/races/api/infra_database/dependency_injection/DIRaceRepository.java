package ddg.races.api.infra_database.dependency_injection;

import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.repositories.IRaceRepository;

public class DIRaceRepository implements IDIRaceRepository {
    private final IRaceRepository repository;

    public DIRaceRepository(IRaceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void insert(RaceCollection dbEntity) {
        this.repository.insert(dbEntity);
    }
}
