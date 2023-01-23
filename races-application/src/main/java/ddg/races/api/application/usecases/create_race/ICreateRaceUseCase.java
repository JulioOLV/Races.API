package ddg.races.api.application.usecases.create_race;

import ddg.races.Race;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;

public interface ICreateRaceUseCase {
    CreateNewRaceOutput createNewRace(Race request);
}
