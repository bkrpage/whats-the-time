package dev.bradleypage.service;

import dev.bradleypage.model.UnitType;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class DateTimeTransformationServiceImpl implements DateTimeTransformationService {

    public ZonedDateTime getDateTimeInYears(@NonNull Integer years) {
        return getDateTimeInYears(years, null);
    }

    public ZonedDateTime getDateTimeInYears(@NonNull Integer years, ZonedDateTime time) {
        return nowIfNull(time).plusYears(years);
    }

    public ZonedDateTime getDateTimeInMonths(@NonNull Integer months) {
        return getDateTimeInMonths(months, null);
    }

    public ZonedDateTime getDateTimeInMonths(@NonNull Integer months, ZonedDateTime time) {
        return nowIfNull(time).plusMonths(months);
    }

    public ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks) {
        return getDateTimeInWeeks(weeks, null);
    }

    public ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks, ZonedDateTime time) {
        return nowIfNull(time).plusWeeks(weeks);
    }


    public ZonedDateTime getDateTimeInDays(@NonNull Integer days) {
        return getDateTimeInDays(days, null);
    }

    public ZonedDateTime getDateTimeInDays(@NonNull Integer days, ZonedDateTime time) {
        return nowIfNull(time).plusDays(days);
    }

    public ZonedDateTime getDateTimeInHours(@NonNull Integer hours) {
        return getDateTimeInHours(hours, null);
    }

    public ZonedDateTime getDateTimeInHours(@NonNull Integer hours, ZonedDateTime time) {
        return nowIfNull(time).plusHours(hours);
    }

    public ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes) {
        return getDateTimeInMinutes(minutes, null);
    }

    public ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes, ZonedDateTime time) {
        return nowIfNull(time).plusMinutes(minutes);
    }

    public ZonedDateTime getDateTimeInSeconds(@NonNull Integer seconds) {
        return getDateTimeInSeconds(seconds, null);
    }

    public ZonedDateTime getDateTimeInSeconds(@NonNull Integer seconds, ZonedDateTime time) {
        return nowIfNull(time).plusSeconds(seconds);
    }


    public ZonedDateTime transformDateTime(Integer value, UnitType unit) {

        switch (unit) {
            case SECONDS:
                return getDateTimeInSeconds(value);
            case MINUTES:
                return getDateTimeInMinutes(value);
            case HOURS:
                return getDateTimeInHours(value);
            case DAYS:
                return getDateTimeInDays(value);
            case WEEKS:
                return getDateTimeInWeeks(value);
            case MONTHS:
                return getDateTimeInMonths(value);
            case YEARS:
                return getDateTimeInYears(value);
        }
        return null;
    }


    /**
     * Returns the ZonedDateTime now if given ZonedDateTime is null
     *
     * @param time to evaluate if null
     * @return ZonedDateTime
     */
    private static ZonedDateTime nowIfNull(ZonedDateTime time) {
        if (time == null)
            return ZonedDateTime.now();
        else
            return time;
    }


}
