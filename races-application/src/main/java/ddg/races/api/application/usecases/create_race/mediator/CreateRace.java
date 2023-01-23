package ddg.races.api.application.usecases.create_race.mediator;

import ddg.races.Race;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.ICreateRaceUseCase;

public abstract class CreateRace {

    public CreateRace(ICreateRaceUseCase useCase) {
        this.useCase = useCase;
    }

    public ICreateRaceUseCase getUseCase() {
        return useCase;
    }

    private ICreateRaceUseCase useCase;

    public abstract CreateNewRaceOutput handler(Race request);
}
