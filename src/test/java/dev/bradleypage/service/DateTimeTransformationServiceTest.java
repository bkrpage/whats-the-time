package dev.bradleypage.service;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static junit.framework.TestCase.assertEquals;

class DateTimeTransformationServiceTest {

    private DateTimeTransformationService service = new DateTimeTransformationServiceImpl();

    @Test
    void givenDateFrom_transformingDateWithSeconds_isCorrectTest() {

        ZonedDateTime testNow = ZonedDateTime.now();
        ZonedDateTime nowIn20Seconds = service.getDateTimeInSeconds(20, testNow);
        assertEquals(20, nowIn20Seconds.toInstant().getEpochSecond() - testNow.toInstant().getEpochSecond());

        ZonedDateTime now40SecondsAgo = service.getDateTimeInSeconds(-40, testNow);
        assertEquals(-40, now40SecondsAgo.toInstant().getEpochSecond() - testNow.toInstant().getEpochSecond());
    }
}
