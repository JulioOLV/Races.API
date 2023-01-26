package ddg.races.api.application.usecases.delete_race;

import ddg.races.RaceId;
import ddg.races.api.application.usecases.delete_race.models.DeleteRaceOutput;
import ddg.races.api.infra_database.repositories.IRaceRepository;

public class DeleteRaceUseCase implements IDeleteRaceUseCase {
    private final IRaceRepository raceRepository;

    public DeleteRaceUseCase(IRaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public DeleteRaceOutput delete(RaceId request) {
        try {
            raceRepository.deleteById(request.getId());
            return new DeleteRaceOutput(true);
        }
        catch (Exception e) {
            return new DeleteRaceOutput(false);
        }
    }
}
