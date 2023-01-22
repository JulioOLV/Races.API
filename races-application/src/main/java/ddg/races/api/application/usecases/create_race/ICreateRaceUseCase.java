package ddg.races.api.application.usecases.create_race;

import ddg.races.api.application.usecases.create_race.models.CreateNewRaceInput;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;

public interface ICreateRaceUseCase {
    CreateNewRaceOutput createNewRace(CreateNewRaceInput request);
}
