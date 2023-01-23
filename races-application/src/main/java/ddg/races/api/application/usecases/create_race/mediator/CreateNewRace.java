package ddg.races.api.application.usecases.create_race.mediator;

import ddg.races.Race;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.ICreateRaceUseCase;

public class CreateNewRace extends CreateRace {
    public CreateNewRace(ICreateRaceUseCase useCase) {
        super(useCase);
    }

    @Override
    public CreateNewRaceOutput handler(Race request) {
        System.out.println("CreateNewRace handler");
        return getUseCase().createNewRace(request);
    }
}
