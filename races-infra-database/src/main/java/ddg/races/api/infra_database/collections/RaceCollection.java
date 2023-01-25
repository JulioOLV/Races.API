package ddg.races.api.infra_database.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Document("RaceCollection")
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

    public ArrayList<ModifierCollection> getModifiers() {
        return modifiers;
    }

    public void setModifiers(ArrayList<ModifierCollection> modifiers) {
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

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
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

    public ArrayList<SubRaceCollection> getSubRaces() {
        return subRaces;
    }

    public void setSubRaces(ArrayList<SubRaceCollection> subRaces) {
        this.subRaces = subRaces;
    }

    @Id
    private String id;
    private String name;
    private ArrayList<ModifierCollection> modifiers;
    private int maxAge;
    private String trend;
    private double height;
    private double displacement;
    private ArrayList<String> names;
    private ArrayList<String> languages;
    private ArrayList<SubRaceCollection> subRaces;
    private Date creationDate;
    private Date updatedDate;

    public RaceCollection()
    {
        super();

        this.creationDate = new Date();
    }
}

