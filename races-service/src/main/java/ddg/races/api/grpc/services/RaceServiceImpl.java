package ddg.races.api.grpc.services;

import ddg.races.*;
import ddg.races.api.application.usecases.create_race.mediator.CreateNewRace;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.mediator.CreateRace;
import ddg.races.api.application.usecases.delete_race.DeleteRaceUseCase;
import ddg.races.api.application.usecases.delete_race.IDeleteRaceUseCase;
import ddg.races.api.application.usecases.delete_race.mediator.DeleteOneRace;
import ddg.races.api.application.usecases.delete_race.mediator.DeleteRace;
import ddg.races.api.application.usecases.delete_race.models.DeleteRaceOutput;
import ddg.races.api.application.usecases.list_races.IListRacesUseCase;
import ddg.races.api.application.usecases.list_races.ListRacesUseCase;
import ddg.races.api.application.usecases.list_races.mediator.ListAllRaces;
import ddg.races.api.application.usecases.list_races.mediator.ListRaces;
import ddg.races.api.application.usecases.list_races.models.ListRacesOutput;
import ddg.races.api.application.usecases.update_race.IUpdateRaceUseCase;
import ddg.races.api.application.usecases.update_race.UpdateRaceUseCase;
import ddg.races.api.application.usecases.update_race.mediator.UpdateOneRace;
import ddg.races.api.application.usecases.update_race.mediator.UpdateRace;
import ddg.races.api.application.usecases.update_race.models.UpdateRaceOutput;
import ddg.races.api.infra_database.repositories.IRaceRepository;
import io.grpc.stub.StreamObserver;
import ddg.races.api.application.usecases.create_race.CreateRaceUseCase;
import ddg.races.api.application.usecases.create_race.ICreateRaceUseCase;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class RaceServiceImpl extends RaceServiceGrpc.RaceServiceImplBase {
    @Autowired
    private final IRaceRepository raceRepository;

    public RaceServiceImpl(IRaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    @Override
    public void list(Null request, StreamObserver<ListRace> responseObserver) {
        IListRacesUseCase useCase = new ListRacesUseCase(this.raceRepository);

        ListRaces listRaces = new ListAllRaces(useCase);

        ListRacesOutput output = listRaces.handler();

        ListRace response = ListRace.newBuilder()
                .addAllRaces(output.getRaces())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(Race request, StreamObserver<RaceId> responseObserver) {
        ICreateRaceUseCase useCase = new CreateRaceUseCase(this.raceRepository);

        CreateRace createRace = new CreateNewRace(useCase);

        CreateNewRaceOutput output = createRace.handler(request);

        RaceId response = RaceId.newBuilder()
                .setId(output.getId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void update(RaceUpdate request, StreamObserver<RaceId> responseObserver) {
        IUpdateRaceUseCase useCase = new UpdateRaceUseCase(this.raceRepository);

        UpdateRace updateRace = new UpdateOneRace(useCase);

        UpdateRaceOutput output = updateRace.handler(request);

        RaceId response = RaceId.newBuilder()
                .setId(output.getId())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(RaceId request, StreamObserver<Success> responseObserver) {
        IDeleteRaceUseCase useCase = new DeleteRaceUseCase(this.raceRepository);

        DeleteRace deleteRace = new DeleteOneRace(useCase);

        DeleteRaceOutput output = deleteRace.handler(request);

        Success response = Success.newBuilder()
                .setSuccess(output.getDeleted())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}