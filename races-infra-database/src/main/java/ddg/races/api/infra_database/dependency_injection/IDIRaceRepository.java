package ddg.races.api.infra_database.dependency_injection;

import ddg.races.api.infra_database.collections.RaceCollection;

public interface IDIRaceRepository {
    void insert(RaceCollection dbEntity);
}
