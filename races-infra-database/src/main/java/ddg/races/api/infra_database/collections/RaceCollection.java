package ddg.races.api.infra_database.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class RaceCollection {
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

    public ModifierCollection[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(ModifierCollection[] modifiers) {
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

    public SubRaceCollection[] getSubRaces() {
        return subRaces;
    }

    public void setSubRaces(SubRaceCollection[] subRaces) {
        this.subRaces = subRaces;
    }

    @Id
    private String id;
    private String name;
    private ModifierCollection[] modifiers;
    private int maxAge;
    private String trend;
    private double height;
    private double displacement;
    private String[] names;
    private String[] languages;
    private SubRaceCollection[] subRaces;
    private Date creationDate;
    private Date updatedDate;

    public RaceCollection(String id, String name, int maxAge, String trend, double height, double displacement, Date creationDate, Date updatedDate) {
        this.id = id;
        this.name = name;
        // this.modifiers = modifiers;
        this.maxAge = maxAge;
        this.trend = trend;
        this.height = height;
        this.displacement = displacement;
        // this.names = names;
        // this.languages = languages;
        // this.subRaces = subRaces;
        this.creationDate = creationDate;
        this.updatedDate = updatedDate;
    }
}

class ModifierCollection {
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

    public ModifierCollection(String name, String value) {
        this.name = name;
        this.value = value;
    }
}

class SubRaceCollection {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifierCollection[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(ModifierCollection[] modifiers) {
        this.modifiers = modifiers;
    }

    private String name;
    private ModifierCollection[] modifiers;

    public SubRaceCollection(String name, ModifierCollection[] modifiers) {
        this.name = name;
        this.modifiers = modifiers;
    }
}
