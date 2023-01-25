package ddg.races.api.application.usecases.update_race.mediator;

import ddg.races.RaceUpdate;
import ddg.races.api.application.usecases.update_race.IUpdateRaceUseCase;
import ddg.races.api.application.usecases.update_race.models.UpdateRaceOutput;

public class UpdateOneRace extends UpdateRace {
    public UpdateOneRace(IUpdateRaceUseCase useCase) {
        super(useCase);
    }

    @Override
    public UpdateRaceOutput handler(RaceUpdate request) {
        return getUseCase().update(request);
    }
}
