package ddg.races.api.application.usecases.create_race;

import ddg.races.Race;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.dependency_injection.IDIRaceRepository;
import ddg.races.api.infra_database.dependency_injection.RaceRepositoryInjector;

import java.util.Date;

public class CreateRaceUseCase implements ICreateRaceUseCase {
    private final IDIRaceRepository raceRepository;

    public CreateRaceUseCase() {
        RaceRepositoryInjector injector = new RaceRepositoryInjector();
        raceRepository = injector.insert();
    }

    @Override
    public CreateNewRaceOutput createNewRace(Race request) {
        RaceCollection collection = new RaceCollection(
                "123456",
                request.getName(),
                // request.getModifiers(),
                request.getMaxAge(),
                request.getTrend(),
                request.getHeight(),
                request.getDisplacement(),
                // request.getNamesList(),
                // request.getLanguagesList(),
                // request.getSubRaces(),
                new Date(),
                null
        );

        raceRepository.insert(collection);
        CreateNewRaceOutput output = new CreateNewRaceOutput();
        output.setId(collection.getId());
        return output;
    }
}
