package ddg.races.api.application.usecases.list_races.mediator;

import ddg.races.api.application.usecases.list_races.IListRacesUseCase;
import ddg.races.api.application.usecases.list_races.models.ListRacesOutput;

public class ListAllRaces extends ListRaces {
    public ListAllRaces(IListRacesUseCase useCase) {
        super(useCase);
    }

    @Override
    public ListRacesOutput handler() {
        return getUseCase().listRaces();
    }
}
