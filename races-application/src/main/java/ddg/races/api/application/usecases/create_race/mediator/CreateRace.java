package ddg.races.api.application.usecases.create_race.mediator;

import ddg.races.api.application.usecases.create_race.models.CreateNewRaceInput;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.ICreateRaceUseCase;

public abstract class CreateRace {

    public CreateRace(ICreateRaceUseCase useCase, CreateNewRaceInput input) {
        this.useCase = useCase;
        this.input = input;
    }

    public ICreateRaceUseCase getUseCase() {
        return useCase;
    }

    public CreateNewRaceInput getInput() {
        return input;
    }

    private ICreateRaceUseCase useCase;

    private CreateNewRaceInput input;

    public abstract CreateNewRaceOutput handler(CreateNewRaceInput request);
}
