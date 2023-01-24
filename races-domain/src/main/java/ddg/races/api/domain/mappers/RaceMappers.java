package ddg.races.api.domain.mappers;

import ddg.races.Race;
import ddg.races.api.infra_database.collections.RaceCollection;
import org.modelmapper.ModelMapper;

public class RaceMappers {
    public static RaceCollection MapToRaceCollection(Race race) {
        ModelMapper modelMapper = new ModelMapper();

        RaceCollection raceCollection = modelMapper.map(race, RaceCollection.class);

        return raceCollection;
    }
}
