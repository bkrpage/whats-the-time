package dev.bradleypage.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class TimeService {


    public ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks) {
        return getDateTimeInWeeks(weeks, null);
    }

    public ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks, ZonedDateTime time) {
        return nowIfNull(time).plusWeeks(weeks);
    }


    public ZonedDateTime getDateTimeInDays(@NonNull Integer days){
        return getDateTimeInDays(days, null);
    }

    public ZonedDateTime getDateTimeInDays(@NonNull Integer days, ZonedDateTime time)  {
        return nowIfNull(time).plusDays(days);
    }

    public ZonedDateTime getDateTimeInHours(@NonNull Integer hours){
        return getDateTimeInHours(hours, null);
    }

    public ZonedDateTime getDateTimeInHours(@NonNull Integer hours, ZonedDateTime time)  {
        return nowIfNull(time).plusHours(hours);
    }

    public ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes){
        return getDateTimeInMinutes(minutes, null);
    }

    public ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes, ZonedDateTime time)  {
        return nowIfNull(time).plusMinutes(minutes);
    }


    private static ZonedDateTime nowIfNull(ZonedDateTime time){
        if (time == null)
             return ZonedDateTime.now();
        else
            return time;
    }



}
