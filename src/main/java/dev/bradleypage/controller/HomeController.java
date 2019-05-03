package dev.bradleypage.controller;

import dev.bradleypage.model.TemporalType;
import dev.bradleypage.service.TimeService;
import lombok.AllArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CommonsLog
public class HomeController {

    private final TimeService timeService;

    @RequestMapping("/")
    public String home(){
        return "Home.";
    }

    @GetMapping("/{temporalType}/in/{weeks}/weeks")
    public String timeInWeeks(
            @PathVariable TemporalType temporalType,
            @PathVariable Integer weeks
    ){
        switch(temporalType){
            case TIME:
                return "";
            case DAY:
                return "";
            case WEEK:
                return "";
            case MONTH:
                return "";
            case DATE:
            default:
                return timeService.getDateInWeeks(weeks).toString();
        }
    }
}
