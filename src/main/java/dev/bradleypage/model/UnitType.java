package dev.bradleypage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UnitType {

    SECONDS("seconds"),
    MINUTES("minutes"),
    HOURS("hours"),
    DAYS("days"),
    WEEKS("weeks"),
    MONTHS("months"),
    YEARS("years");


    private final String description;


    public static UnitType get(String description) {
        for (UnitType t : UnitType.values()) {
            if (t.getDescription().equalsIgnoreCase(description)) return t;
        }
        return null;
    }
}
