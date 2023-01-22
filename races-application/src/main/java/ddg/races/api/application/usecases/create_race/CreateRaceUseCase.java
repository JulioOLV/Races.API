package ddg.races.api.application.usecases.create_race;

import ddg.races.api.application.usecases.create_race.models.CreateNewRaceInput;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;

public class CreateRaceUseCase implements ICreateRaceUseCase {
    @Override
    public CreateNewRaceOutput createNewRace(CreateNewRaceInput request) {
        System.out.println("CreateNewRace handler");
        CreateNewRaceOutput output = new CreateNewRaceOutput();
        output.setId("456789");
        return output;
    }
}
