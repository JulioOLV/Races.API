package ddg.races.api.application.usecases.update_race.mediator;

import ddg.races.RaceUpdate;
import ddg.races.api.application.usecases.update_race.IUpdateRaceUseCase;
import ddg.races.api.application.usecases.update_race.models.UpdateRaceOutput;

public abstract class UpdateRace {
    public UpdateRace(IUpdateRaceUseCase useCase) {
        this.useCase = useCase;
    }

    public IUpdateRaceUseCase getUseCase() {
        return useCase;
    }

    private IUpdateRaceUseCase useCase;

    public abstract UpdateRaceOutput handler(RaceUpdate request);
}
