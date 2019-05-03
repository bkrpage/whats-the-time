package dev.bradleypage.controller;

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

    @GetMapping("date/in/{weeks}/weeks")
    public String timeInWeeks(
            @PathVariable Integer weeks
    ){
        return timeService.getDateInWeeks(weeks).toString();
    }
}
