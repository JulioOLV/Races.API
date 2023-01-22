package ddg.races.api.application.usecases.create_race.models;

public class CreateNewRaceInput {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
