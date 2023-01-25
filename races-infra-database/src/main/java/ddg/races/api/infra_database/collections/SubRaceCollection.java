package ddg.races.api.infra_database.collections;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class SubRaceCollection {
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

    private String name;
    private ArrayList<ModifierCollection> modifiers;

    public SubRaceCollection() {
        super();
    }
}
