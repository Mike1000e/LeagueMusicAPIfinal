package com.league.LeagueMusicAPI.presentation;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
public class HomeController {

    @GetMapping("/")


    public static String home(){
        return "redirect:swagger-ui.html";
    }

}