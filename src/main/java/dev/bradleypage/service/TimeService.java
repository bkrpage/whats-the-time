package dev.bradleypage.service;

import dev.bradleypage.model.UnitType;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public interface TimeService {

    ZonedDateTime getDateTimeInYears(@NonNull Integer years);

    ZonedDateTime getDateTimeInYears(@NonNull Integer years, ZonedDateTime time);

    ZonedDateTime getDateTimeInMonths(@NonNull Integer months);

    ZonedDateTime getDateTimeInMonths(@NonNull Integer months, ZonedDateTime time);

    ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks);

    ZonedDateTime getDateTimeInWeeks(@NonNull Integer weeks, ZonedDateTime time);

    ZonedDateTime getDateTimeInDays(@NonNull Integer days);

    ZonedDateTime getDateTimeInDays(@NonNull Integer days, ZonedDateTime time);

    ZonedDateTime getDateTimeInHours(@NonNull Integer hours);

    ZonedDateTime getDateTimeInHours(@NonNull Integer hours, ZonedDateTime time);

    ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes);

    ZonedDateTime getDateTimeInMinutes(@NonNull Integer minutes, ZonedDateTime time);

    ZonedDateTime getDateTimeInSeconds(@NonNull Integer seconds);

    ZonedDateTime getDateTimeInSeconds(@NonNull Integer seconds, ZonedDateTime time);

    ZonedDateTime transformDateTime(Integer value, UnitType unit);

}
