package dev.bradleypage.service;

import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class TimeService {


    public ZonedDateTime getDateTimeInWeeks(Integer weeks) {
        return getDateTimeInWeeks(weeks, null);
    }

    public ZonedDateTime getDateTimeInWeeks(Integer weeks, ZonedDateTime time) {
        return nowIfNull(time).plusWeeks(weeks);
    }


    public ZonedDateTime getDateTimeInDays(Integer days){
        return getDateTimeInDays(days, null);
    }

    public ZonedDateTime getDateTimeInDays(Integer days, ZonedDateTime time)  {
        return nowIfNull(time).plusDays(days);
    }


    private static ZonedDateTime nowIfNull(ZonedDateTime time){
        if (time == null)
             return ZonedDateTime.now();
        else
            return time;
    }



}
