package entities;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeModule {
    PROFESSIONNEL("PROFESSIONNEL"),
    TRANSVERSAL("TRANSVERSAL");

    private final String value;

    TypeModule(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}