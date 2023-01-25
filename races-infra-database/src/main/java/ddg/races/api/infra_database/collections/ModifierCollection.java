package ddg.races.api.infra_database.collections;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ModifierCollection {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private String name;
    private int value;

    public ModifierCollection() {
        super();
    }
}
