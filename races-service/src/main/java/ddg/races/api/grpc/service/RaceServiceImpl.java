package ddg.races.api.grpc.service;

import ddg.races.Race;
import ddg.races.RaceId;
import ddg.races.RaceServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class RaceServiceImpl extends RaceServiceGrpc.RaceServiceImplBase {
    @Override
    public void find(RaceId request, StreamObserver<Race> responseObserver) {
        String id = request.getId();
        System.out.println("Received Message: " + id);

        Race response = Race.newBuilder()
                .setName("Anão")
                .setMaxAge(150)
                .setTrend(". A maioria dos anões é leal, pois acreditam\n" +
                        "firmemente nos benefícios de uma sociedade bem\n" +
                        "organizada. Eles tendem para o bem, com um forte senso\n" +
                        "de honestidade e uma crença de que todos merecem\n" +
                        "compartilhar os benefícios de uma ordem social justa.")
                .setHeight(1.5)
                .setDisplacement(9.0)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(Race request, StreamObserver<RaceId> responseObserver) {
        System.out.println("Received Message: " + request.getName());

        RaceId response = RaceId.newBuilder()
                .setId("1")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}