package ddg.races.api.application.usecases.list_races.models;

import ddg.races.Race;

import java.util.List;

public class ListRacesOutput {
    public List<Race> getRaces() {
        return races;
    }

    public void setRaces(List<Race> races) {
        this.races = races;
    }

    List<Race> races;
}
