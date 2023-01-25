package ddg.races.api.application.usecases.list_races;

import ddg.races.Race;
import ddg.races.api.application.usecases.list_races.models.ListRacesOutput;
import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.repositories.IRaceRepository;
import ddg.races.api.domain.mappers.RaceMappers;

import java.util.List;

public class ListRacesUseCase implements IListRacesUseCase {
    private final IRaceRepository raceRepository;

    public ListRacesUseCase(IRaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public ListRacesOutput listRaces() {
        List<RaceCollection> raceCollectionList = this.raceRepository.findAll();

        List<Race> raceList = RaceMappers.MapToRaceDomain(raceCollectionList);

        ListRacesOutput output = new ListRacesOutput();
        output.setRaces(raceList);
        return output;
    }
}
