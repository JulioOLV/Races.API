package ddg.races.api.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("ddg.races.api.infra_database.repositories")
public class GrpcServer {

	public static void main(String[] args) {
		SpringApplication.run(GrpcServer.class, args);
	}

}
