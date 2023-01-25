package ddg.races.api.application.usecases.update_race;

import ddg.races.RaceUpdate;
import ddg.races.api.application.usecases.update_race.models.UpdateRaceOutput;

public interface IUpdateRaceUseCase {
    UpdateRaceOutput update(RaceUpdate request);
}
