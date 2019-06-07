package dev.bradleypage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum UnitType {

    SECONDS(Arrays.asList("seconds", "second", "sec", "secs")),
    MINUTES(Arrays.asList("minutes", "minute", "min", "mins")),
    HOURS(Arrays.asList("hours", "hour")),
    DAYS(Arrays.asList("days", "day")),
    WEEKS(Arrays.asList("weeks", "week")),
    MONTHS(Arrays.asList("months", "month")),
    YEARS(Arrays.asList("years", "year"));


    private final List<String> unitNames;


    public static UnitType get(String description) {
        for (UnitType t : UnitType.values()) {
            for (String name : t.getUnitNames()){
                if (name.equalsIgnoreCase(description)) return t;
            }
        }
        return null;
    }
}
