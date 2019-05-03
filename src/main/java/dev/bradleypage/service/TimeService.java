package dev.bradleypage.service;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Service
public class TimeService {


    public ZonedDateTime getDateInWeeks(Integer weeks){
        return getDateInWeeksFrom(weeks, null);
    }

    public ZonedDateTime getDateInWeeksFrom(Integer weeks, ZonedDateTime time){

        if (time == null)
            time = ZonedDateTime.now();

        return time.plusWeeks(weeks);
    }

}
