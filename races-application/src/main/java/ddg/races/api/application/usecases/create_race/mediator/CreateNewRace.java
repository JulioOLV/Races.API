package ddg.races.api.application.usecases.create_race.mediator;

import ddg.races.api.application.usecases.create_race.models.CreateNewRaceInput;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.ICreateRaceUseCase;

public class CreateNewRace extends CreateRace {
    public CreateNewRace(ICreateRaceUseCase useCase, CreateNewRaceInput input) {
        super(useCase, input);
    }

    @Override
    public CreateNewRaceOutput handler(CreateNewRaceInput request) {
        System.out.println("CreateNewRace handler");
        return getUseCase().createNewRace(request);
    }
}
