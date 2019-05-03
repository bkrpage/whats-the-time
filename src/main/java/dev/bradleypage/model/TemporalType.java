package dev.bradleypage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TemporalType extends EnumType{

    DATE("date"),
    TIME("time"),
    DAY("day"),
    WEEK("week"),
    MONTH("month");

    private String description;


    public static TemporalType get(String description){
        for(TemporalType t : TemporalType.values()){
            if(t.getDescription().equalsIgnoreCase(description)) return t;
        }
        return null;
    }
}
