package dev.bradleypage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OutputType {

    DATE("date"),
    TIME("time"),
    DAY("day"),
    WEEK("week"),
    MONTH("month");

    private String description;


    public static OutputType get(String description) {
        for (OutputType t : OutputType.values()) {
            if (t.getDescription().equalsIgnoreCase(description)) return t;
        }
        return null;
    }
}
