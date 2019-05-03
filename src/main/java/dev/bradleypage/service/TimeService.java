package dev.bradleypage.service;

import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class TimeService {


    public ZonedDateTime getDateInWeeks(Integer weeks) {
        return getDateInWeeks(weeks, null);
    }

    public ZonedDateTime getDateInWeeks(Integer weeks, ZonedDateTime time) {
        if (time == null)
            time = ZonedDateTime.now();
        return time.plusWeeks(weeks);
    }

}
