package ddg.races.api.grpc.services;

import ddg.races.*;
import ddg.races.api.application.usecases.create_race.mediator.CreateNewRace;
import ddg.races.api.application.usecases.create_race.models.CreateNewRaceOutput;
import ddg.races.api.application.usecases.create_race.mediator.CreateRace;
import ddg.races.api.application.usecases.list_races.IListRacesUseCase;
import ddg.races.api.application.usecases.list_races.ListRacesUseCase;
import ddg.races.api.application.usecases.list_races.mediator.ListAllRaces;
import ddg.races.api.application.usecases.list_races.mediator.ListRaces;
import ddg.races.api.application.usecases.list_races.models.ListRacesOutput;
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
}