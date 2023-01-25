package ddg.races.api.application.usecases.list_races.mediator;

import ddg.races.api.application.usecases.list_races.IListRacesUseCase;
import ddg.races.api.application.usecases.list_races.models.ListRacesOutput;

public abstract class ListRaces {

        public ListRaces(IListRacesUseCase useCase) {
            this.useCase = useCase;
        }

        public IListRacesUseCase getUseCase() {
            return useCase;
        }

        private IListRacesUseCase useCase;

        public abstract ListRacesOutput handler();
}
