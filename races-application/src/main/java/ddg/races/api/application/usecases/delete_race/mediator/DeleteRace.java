package ddg.races.api.application.usecases.delete_race.mediator;

import ddg.races.RaceId;
import ddg.races.api.application.usecases.delete_race.IDeleteRaceUseCase;
import ddg.races.api.application.usecases.delete_race.models.DeleteRaceOutput;

public abstract class DeleteRace {
    public DeleteRace(IDeleteRaceUseCase usecase) {
        this.usecase = usecase;
    }

    public IDeleteRaceUseCase getUsecase() {
        return usecase;
    }

    private IDeleteRaceUseCase usecase;

    public abstract DeleteRaceOutput handler(RaceId request);
}
