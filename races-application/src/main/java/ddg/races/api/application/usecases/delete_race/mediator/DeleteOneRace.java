package ddg.races.api.application.usecases.delete_race.mediator;

import ddg.races.RaceId;
import ddg.races.api.application.usecases.delete_race.IDeleteRaceUseCase;
import ddg.races.api.application.usecases.delete_race.models.DeleteRaceOutput;

public class DeleteOneRace extends DeleteRace {
    public DeleteOneRace(IDeleteRaceUseCase usecase) {
        super(usecase);
    }

    @Override
    public DeleteRaceOutput handler(RaceId request) {
        return getUsecase().delete(request);
    }
}
