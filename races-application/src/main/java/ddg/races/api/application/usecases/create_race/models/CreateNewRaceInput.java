package ddg.races.api.application.usecases.create_race.models;

import java.util.Date;

public class CreateNewRaceInput {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Modifier[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(Modifier[] modifiers) {
        this.modifiers = modifiers;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public SubRace[] getSubRaces() {
        return subRaces;
    }

    public void setSubRaces(SubRace[] subRaces) {
        this.subRaces = subRaces;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    private String id;
    private String name;
    private Modifier[] modifiers;
    private int maxAge;
    private String trend;
    private double height;
    private double displacement;
    private String[] names;
    private String[] languages;
    private SubRace[] subRaces;
    private Date creationDate;
    private Date updatedDate;

    public CreateNewRaceInput(String id, String name, Modifier[] modifiers, int maxAge, String trend, double height, double displacement, String[] names, String[] languages, SubRace[] subRaces, Date creationDate, Date updatedDate) {
        this.id = id;
        this.name = name;
        this.modifiers = modifiers;
        this.maxAge = maxAge;
        this.trend = trend;
        this.height = height;
        this.displacement = displacement;
        this.names = names;
        this.languages = languages;
        this.subRaces = subRaces;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
    }
}

class Modifier {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String name;
    private String value;

    public Modifier(String name, String value) {
        this.name = name;
        this.value = value;
    }
}

class SubRace {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Modifier[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(Modifier[] modifiers) {
        this.modifiers = modifiers;
    }

    private String name;
    private Modifier[] modifiers;

    public SubRace(String name, Modifier[] modifiers) {
        this.name = name;
        this.modifiers = modifiers;
    }
}
