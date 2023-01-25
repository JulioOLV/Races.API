package ddg.races.api.application.usecases.update_race;

import ddg.races.RaceUpdate;
import ddg.races.api.application.usecases.update_race.models.UpdateRaceOutput;
import ddg.races.api.domain.mappers.RaceMappers;
import ddg.races.api.infra_database.collections.RaceCollection;
import ddg.races.api.infra_database.repositories.IRaceRepository;

public class UpdateRaceUseCase implements IUpdateRaceUseCase {
    private final IRaceRepository raceRepository;

    public UpdateRaceUseCase(IRaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public UpdateRaceOutput update(RaceUpdate request) {
        RaceCollection raceCollection = RaceMappers.MapToRaceCollection(request.getRace());
        raceCollection.setId(request.getId());
        raceRepository.save(raceCollection);
        UpdateRaceOutput output = new UpdateRaceOutput();
        output.setId(raceCollection.getId());
        return output;
    }
}
