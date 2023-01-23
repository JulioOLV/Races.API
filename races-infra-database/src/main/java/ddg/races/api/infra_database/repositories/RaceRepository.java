package ddg.races.api.infra_database.repositories;

import ddg.races.api.infra_database.collections.RaceCollection;

public abstract class RaceRepository implements IRaceRepository {
    @Override
    public <S extends RaceCollection> S insert(S entity) {
        return insert(entity);
    }
}
