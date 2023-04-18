package com.wlei24.queuesystem.misc.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/misc")
public class BasicController {
    @PostMapping("/getSetting")
    public String getSetting() {
        return "setting" + new Date();
    }
}
