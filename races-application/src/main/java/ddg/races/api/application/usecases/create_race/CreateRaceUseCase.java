package ddg.races.api.application.usecases.create_race;

import ddg.races.Race;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.domain.mappers.RaceMappers;
import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.repositories.IRaceRepository;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class CreateRaceUseCase implements ICreateRaceUseCase {
    private final IRaceRepository raceRepository;

    public CreateRaceUseCase(IRaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public CreateNewRaceOutput createNewRace(Race request) {
        RaceCollection collection = RaceMappers.MapToRaceCollection(request);
        this.raceRepository.save(collection);
        CreateNewRaceOutput output = new CreateNewRaceOutput();
        output.setId(collection.getId());
        return output;
    }
}
