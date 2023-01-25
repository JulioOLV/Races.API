package ddg.races.api.domain.mappers;

import ddg.races.Modifier;
import ddg.races.Race;
import ddg.races.SubRace;
import ddg.races.api.infra_database.collections.ModifierCollection;
import ddg.races.api.infra_database.collections.RaceCollection;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class RaceMappers {
    public static RaceCollection MapToRaceCollection(Race race) {
        ModelMapper modelMapper = new ModelMapper();

        RaceCollection raceCollection = modelMapper.map(race, RaceCollection.class);

        return raceCollection;
    }

    public static List<Race> MapToRaceDomain(List<RaceCollection> raceCollectionList) {
        ModelMapper modelMapper = new ModelMapper();

        List<Race> raceDomain = new ArrayList<Race>();

        for (RaceCollection race : raceCollectionList) {
            List<Modifier> modifiers = new ArrayList<Modifier>();
            List<SubRace> subRaces = new ArrayList<SubRace>();

            for (var modifier : race.getModifiers()) {
                modifiers.add(Modifier.newBuilder().setValue(modifier.getValue()).setName(modifier.getName()).build());
            }

            for (var subRace : race.getSubRaces()) {
                subRaces.add(SubRace.newBuilder().addAllBonus(modifiers).setName(subRace.getName()).build());
            }

            Race converted = Race
                    .newBuilder()
                    .setName(race.getName())
                    .setTrend(race.getTrend())
                    .setDisplacement(race.getDisplacement())
                    .setHeight(race.getHeight())
                    .setMaxAge(race.getMaxAge())
                    .addAllModifiers(modifiers)
                    .addAllSubRaces(subRaces)
                    .addAllLanguages(race.getLanguages())
                    .addAllNames(race.getNames())
                    .build();

            raceDomain.add(converted);
        }

        return raceDomain;
    }
}
