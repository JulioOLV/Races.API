package ddg.races.api.application.usecases.delete_race;

import ddg.races.RaceId;
import ddg.races.api.application.usecases.delete_race.models.DeleteRaceOutput;

public interface IDeleteRaceUseCase {
    DeleteRaceOutput delete(RaceId request);
}
