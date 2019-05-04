package dev.bradleypage.controller;

import dev.bradleypage.model.OutputType;
import dev.bradleypage.model.UnitType;
import dev.bradleypage.service.TimeService;
import lombok.AllArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.temporal.WeekFields;

import static dev.bradleypage.util.DateTimeFormatUtil.TIME_WITH_ZONE;

@RestController
@AllArgsConstructor
@CommonsLog
public class HomeController {

    private final TimeService timeService;

    private static final String GENERIC_ERROR = "There was an error processing this request.";

    @RequestMapping("/")
    public String home(){
        return "Home.";
    }

    @GetMapping("/{outputType}/in/{value}/{unit}")
    public String timeInWeeks(
            @PathVariable OutputType outputType,
            @PathVariable Integer value,
            @PathVariable UnitType unit
    ){
        return processOutputType(outputType, value, unit);
    }

    private String processOutputType(OutputType type, Integer value, UnitType unit){

        ZonedDateTime transformedDateTime = getTransformedDateTime(value, unit);

        if (transformedDateTime == null)
            return GENERIC_ERROR;

        switch(type){
            case TIME:
                return transformedDateTime.format(TIME_WITH_ZONE);
            case DAY:
                return transformedDateTime.getDayOfWeek().toString();
            case WEEK:
                return Integer.toString(transformedDateTime.get(WeekFields.ISO.weekOfWeekBasedYear()));
            case MONTH:
                return transformedDateTime.getMonth().toString();
            case DATE:
                return transformedDateTime.toString();
            default:
                return "Not Implemented";

        }
    }

    private ZonedDateTime getTransformedDateTime(Integer value, UnitType unit){

        switch (unit){
            case SECONDS:
                break;
            case MINUTES:
                break;
            case HOURS:
                break;
            case DAYS:
                return timeService.getDateTimeInDays(value);
            case WEEKS:
                return timeService.getDateTimeInWeeks(value);
            case MONTHS:
                break;
            case YEARS:
                break;
        }
        return null;
    }
}
